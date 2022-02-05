package com.pp.managesystem.service;

import com.github.pagehelper.PageHelper;
import com.pp.managesystem.dao.SysCompanyMapper;
import com.pp.managesystem.dao.SysPositionMapper;
import com.pp.managesystem.dao.SysUserMapper;
import com.pp.managesystem.entity.SysCompany;
import com.pp.managesystem.entity.SysPosition;
import com.pp.managesystem.entity.SysUser;
import com.pp.managesystem.entity.SysUserExample;
import com.pp.managesystem.entity.form.SysUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Autowired
    SysPositionMapper sysPositionMapper;

    @Autowired
    SysCompanyMapper sysCompanyMapper;

    @Lazy
    @Autowired
    PasswordEncoder passwordEncoder;

    public List<SysUser> getAllUsers(){
        return sysUserMapper.selectByExample(new SysUserExample());
    }

    public List<SysUserDetail> selectAll(){
        return sysUserMapper.selectAll();
    }

    public List<SysUserDetail> selectCompanyAll(String uCompany){
        return sysUserMapper.selectCompanyAll(uCompany);
    }

    /**
     * 查询员工列表服务
     * @param uCompany
     * @return
     */
    public List<SysUserDetail> selectUserLikeCompany(int pageNum,int pageSize,String uCompany){
        // 先构建一个保存职位的list
        List<Map> positionList = new ArrayList<>();
        // 构建一个职位字符串
        StringBuilder positionDetail = new StringBuilder();

        /**
         * 查询公司的详细信息
         */
        SysCompany sysCompany = sysCompanyMapper.selectByCompanyCode(uCompany);
        String coName = sysCompany.getCoName();

        /**
         * 首先查询包含此公司的员工
         */
        PageHelper.startPage(pageNum,pageSize);
        List<SysUserDetail> sysUserDetails = sysUserMapper.selectUserLikeCompany(uCompany);

        /**
         * 处理此员工职位编号
         */
        for (SysUserDetail sysUserDetail : sysUserDetails) {
            // 拿到职位编号组合
            String positionCodeMix = sysUserDetail.getuPosition();
            // 拿到自定义编号组合
            String nickCodeMix = sysUserDetail.getuNickCode();

            // 分割职位 ‘’ ‘002’ ‘’
            String[] positionSplit = positionCodeMix.split("/");
            // 分割自定义编号 ‘’ ‘2102.3’ ‘’
            String[] nickCodeSplit = nickCodeMix.split("/");

            // 大于3 代表有多个职位
//            if (positionSplit.length >= 2) {

            /**
             * 循环处理职位
             */
            for (String positionCode : positionSplit) {

                    if (!positionCode.equals("")){
                        /**
                         * 得到职位编号，进行循环获取职位详情
                         */
                        SysPosition sysPosition = sysPositionMapper.selectByPositionCode(positionCode);
                        if (sysPosition.getpCompany().equals(uCompany)) {
                            Map map = new HashMap();
                            map.put("positionCode",sysPosition.getpCode());
                            map.put("positionName",sysPosition.getpName());
                            if (positionDetail.length() > 0) {
                                positionDetail.append("，"+sysPosition.getpName());
                            }else {
                                positionDetail.append(sysPosition.getpName());
                            }
                            // 所查询的职位与公司匹配
                            positionList.add(map);
                        }
                    }
                }
            /**
             * 循环处理自定义编号
             */
            for (String nickCode : nickCodeSplit) {
                if (!nickCode.equals("")){
                    /**
                     * 得到自定义编号
                     */
                    String[] codeDotSplit = nickCode.split("\\.");// 2021.3
                    // 拿到公司对应的自定义编号
                    if (codeDotSplit[0].equals(uCompany)) {
                        sysUserDetail.setuNickCode(codeDotSplit[1]);
                        break;
                    }
                }
            }

                Map map = new HashMap();
                map.put("positionList",positionList);
                sysUserDetail.setPositionList(map);
                sysUserDetail.setuCompanyDetail(coName);
                sysUserDetail.setuPositionDetail(positionDetail.toString());
                positionDetail.setLength(0);
//            }
        }


        return sysUserDetails;
    }

    public String getUsername(String code) {
        return sysUserMapper.selectUsernameByCode(code);
    }

    public SysUser getUser(int id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    public SysUser getUser(String code) {
        return sysUserMapper.selectByCode(code);
    }

    public Integer addUser(SysUser sysUser) {
        // 加密密码
        sysUser.setuPassword(passwordEncoder.encode(sysUser.getuPassword()));
        return sysUserMapper.insert(sysUser);
    }

    public Integer updateUser(SysUser sysUser) {
        // 加密密码
        if (sysUser.getuPassword() == null) {
            sysUser.setuPassword(null);
        } else {
            sysUser.setuPassword(passwordEncoder.encode(sysUser.getuPassword()));
        }
        return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    public Integer updateToken(SysUser sysUser){
        return sysUserMapper.updateToken(sysUser);
    }

    public int deleteUser(int id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }
}
