package com.pp.managesystem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pp.managesystem.dao.SysUserMapper;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysUser;
import com.pp.managesystem.entity.form.SysUserDetail;
import com.pp.managesystem.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("sys_user")
public class SysUserController {

    private static String PATTEN_REGEX_PHONE= "^[1](([3][0-9])|([4][5-9])|([5][0-3,5-9])|([6][5,6])|([7][0-8])|([8][0-9])|([9][1,8,9]))[0-9]{8}$";

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysUserService sysUserService;
    
    @Autowired
    SysUserMapper sysUserMapper;

    /**
     * 获取所有用户
     * @return SysMsg
     */
    @GetMapping
    public SysMsg getAllUsers(@RequestParam(value = "pageNum")Integer pageNum,
                              @RequestParam(value = "pageSize")Integer pageSize){
        try {
            logger.info("尝试查询所有用户");
            PageHelper.startPage(pageNum,pageSize);
            List<SysUser> allUsers = sysUserService.getAllUsers();
            PageInfo pageInfo = new PageInfo<>(allUsers);
            return SysMsg.success().add("dataInfo",pageInfo);
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 获取所有用户详情
     * @return SysMsg
     */
    @GetMapping("/detail")
    public SysMsg getAllUsersDetail(@RequestParam(value = "pageNum")Integer pageNum,
                              @RequestParam(value = "pageSize")Integer pageSize,@RequestParam("uCompany")String uCompany){
        try {
            logger.info("尝试查询{}公司用户详情",uCompany);
            List<SysUserDetail> sysUserDetails = sysUserService.selectUserLikeCompany(pageNum,pageSize,uCompany);

            PageInfo<SysUserDetail> pageInfo = new PageInfo<>(sysUserDetails);
            return SysMsg.success().add("dataInfo",pageInfo);
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    @PostMapping("/add")
    public SysMsg addUserByCompany(SysUser sysUser,@RequestParam("new")String newUser,@RequestParam(value = "addHad",required = false)boolean addHad) {

        try {
            /**
             * 后端校验格式
             */
            // 定义提示信息
            StringBuffer msg = new StringBuffer();
            // 校验手机号
            if (newUser.equals("true") && !sysUser.getuPhone().matches(PATTEN_REGEX_PHONE)) {
                msg.append("请正确填写手机号！ ");
            }
            // 校验自定义编号
//            Map<String,String> map = new HashMap<>();
//            map.put("company",sysUser.getuCompany());
//            map.put("nickCode",sysUser.getuCompany());
            String company = sysUser.getuCompany();
            /**
             * 查询该公司的自定义编号列表
             */
            List<Map<String,String>> rowCodeList = sysUserMapper.selectEqCode(company);

            if (rowCodeList.size() > 0) {
                for (Map<String,String> rowCodeAndName : rowCodeList) {
                    String rowCode = rowCodeAndName.get("rowCode");
                    boolean containsCode = rowCode.contains("/" + sysUser.getuCompany() + "." + sysUser.getuNickCode() + "/");
                    if (containsCode){
                        String username = rowCodeAndName.get("username");
                        msg.append("自定义编号已存在：")
                                .append(username);
                        break;
                    }
                }
            }
            if (msg.length() > 0)
                return SysMsg.failed().add("msg",msg);


            logger.info("尝试添加用户："+sysUser);
            if (newUser.equals("true")) {
                if (!addHad){
                    /**
                     * 先校验是不是新用户
                     */
                    Map<String, String> map = new HashMap<>();
                    map.put("username", sysUser.getuUsername());
                    map.put("phone", sysUser.getuPhone());
                    List<Map<String, String>> userAndPhoneList = sysUserMapper.selectEqNewUser(map);
                    Map userAndPhoneMap = new HashMap();
                    for (Map<String, String> userAndPhone : userAndPhoneList) {
                        userAndPhoneMap.putAll(userAndPhone);
                    }
                    if (userAndPhoneMap.size() > 0){
                        return SysMsg.success().add("state","111").add("user",userAndPhoneMap);
                    }
                }

                /**
                 * 生成用户账号 年月日+编号
                 */
                String[] ymd = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).split("-");
                String year = ymd[0].substring(2, 4);
                String perCode = year + ymd[1] + ymd[2];
                System.out.println(perCode);
                String maxCode = sysUserMapper.selectMaxCode(perCode);
                // 默认为年月日+1
                String uCode = perCode + 1;
                // 查询为年月日+max+1
                if (maxCode != null && !maxCode.equals("")) {
                    uCode = String.valueOf(Integer.parseInt(maxCode) + 1);
                }

                List<String> positions = sysUser.getuPositions();
                StringBuilder positionString = new StringBuilder();
                for (String position : positions) {
                    positionString
                            .append("/")
                            .append(position)
                            .append("/");
                }

                Integer integer = sysUserService
                        .addUser(
                                new SysUser(
                                        null,
                                        sysUser.getuUsername(),
                                        uCode, "123456",
                                        sysUser.getuPhone(),
                                        "/" + sysUser.getuCompany() + "/",
                                        positionString.toString(),
                                        System.currentTimeMillis(), null, null, "/"+sysUser.getuCompany()+"."+sysUser.getuNickCode()+"/"));
                positionString.setLength(0);
                return SysMsg.success()
                        .add("state", integer);
            }
            else if (newUser.equals("false")) {
                /**
                 * 校验用户名和账号是否匹配
                 */
                String username = sysUser.getuUsername();
                String userCode = sysUser.getuCode();
                if (username != null && username.equals(sysUserService.getUsername(userCode))){
                    /**
                     * 修改该用户信息
                     */
                    SysUser DBUser = sysUserService.getUser(userCode);
                    Integer uId = DBUser.getuId();
                    String DBCompany = DBUser.getuCompany();
                    String DBNickCode = DBUser.getuNickCode();
                    String DBPosition = DBUser.getuPosition();
                    if (DBCompany.contains("/"+sysUser.getuCompany()+"/")){
                        // 该员工已在该公司
                        return SysMsg.failed().add("msg","该用户已是公司员工！");
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(DBCompany).append("/").append(sysUser.getuCompany()).append("/");
                    String MixCompany = stringBuilder.toString(); // 合成后的公司
                    stringBuilder.setLength(0);
                    stringBuilder.append(DBNickCode).append("/").append(sysUser.getuCompany()).append(".").append(sysUser.getuNickCode()).append("/");
                    String MixNickCode = stringBuilder.toString(); // 合成后的自定义编号
                    stringBuilder.setLength(0);
                    List<String> positions = sysUser.getuPositions();
                    StringBuilder positionBuilder = new StringBuilder();
                    for (String position : positions) {
                        positionBuilder.append("/").append(position).append("/");
                    }
                    stringBuilder.append(DBPosition).append("/").append(positionBuilder).append("/");
                    String MixPosition = stringBuilder.toString(); // 合成后的职位
                    return SysMsg.success()
                            .add("state",sysUserService.updateUser(new SysUser(uId,sysUser.getuUsername(),
                                    sysUser.getuCode(),null,sysUser.getuPhone(),MixCompany,MixPosition,
                                    null,null,null,MixNickCode)));
                }
                return SysMsg.failed().add("msg","添加失败，请稍后重试！");
            }else {
                return SysMsg.failed();
            }
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    @PostMapping("/change")
    public SysMsg changeUserByCompany(SysUser sysUser,@RequestParam("resetPw")boolean resetPw) {

        try {
            logger.info("尝试修改用户："+sysUser.getuUsername());
//            String code = sysUser.getuCompany() + sysUser.getuNickCode();
            Integer integer = sysUserService.updateUser(new SysUser(sysUser.getuId(), sysUser.getuUsername(), null,
                    resetPw ? "123456" : null, sysUser.getuPhone(), sysUser.getuCompany(), sysUser.getuPosition(),
                    null, null, null, sysUser.getuNickCode()));
            return SysMsg.success()
                    .add("state",integer);
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }
    /**
     * 获取指定用户
     * @param code
     * @return SysMsg
     */
    @GetMapping("/query/{code}")
    public SysMsg getUserNameByCode(@PathVariable("code")String code){
        try {
            logger.info("尝试查询用户："+code);
            return SysMsg.success().add("username",sysUserService.getUsername(code));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }
    /**
     * 获取指定用户
     * @param id
     * @return SysMsg
     */
    @GetMapping("/{uid}")
    public SysMsg getUser(@PathVariable("uid")int id){
        try {
            logger.info("尝试查询用户："+id);
            return SysMsg.success().add("user",sysUserService.getUser(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 添加用户
     * @param sysUser
     * @return SysMsg
     */
    @PostMapping
    public SysMsg addUser(@RequestBody SysUser sysUser) {

        try {
            logger.info("尝试添加用户："+sysUser);
            return SysMsg.success().add("state", sysUserService.addUser(sysUser));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

//    /**
//     * 修改用户
//     * @param sysUser
//     * @return SysMsg
//     */
//    @PutMapping
//    public SysMsg updateUser(@RequestBody SysUser sysUser) {
//        try {
//            logger.info("尝试更改用户："+sysUser);
//            return SysMsg.success().add("state",sysUserService.updateUser(sysUser));
//        }catch (Exception e){
//            logger.error(e.toString());
//            return SysMsg.failed();
//        }
//    }

//    /**
//     * 删除用户
//     * @param id
//     * @return SysMsg
//     */
//    @DeleteMapping("/{uid}")
//    public SysMsg deleteUser(@PathVariable("uid") int id) {
//
//        try {
//            logger.info("尝试添加用户："+id);
//            return SysMsg.success().add("state",sysUserService.deleteUser(id));
//        }catch (Exception e){
//            logger.error(e.toString());
//            return SysMsg.failed();
//        }
//    }

    @GetMapping("/delete")
    public SysMsg deleteUserByCompany(@RequestParam("uId")int id,@RequestParam("uCompany")String company) {

        try {
            logger.info("尝试删除用户："+id);
            return SysMsg.success().add("state",sysUserService.deleteUser(id,company));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }
}
