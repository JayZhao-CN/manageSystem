package com.pp.managesystem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.entity.SysUser;
import com.pp.managesystem.entity.SysUserDetail;
import com.pp.managesystem.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("12")
public class SysUserController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysUserService sysUserService;

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
            PageInfo pageInfo = new PageInfo(allUsers);
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
                              @RequestParam(value = "pageSize")Integer pageSize){
        try {
            logger.info("尝试查询所有用户详情");
            PageHelper.startPage(pageNum,pageSize);
            List<SysUserDetail> allUsers = sysUserService.selectAll();
            PageInfo pageInfo = new PageInfo(allUsers);
            return SysMsg.success().add("dataInfo",pageInfo);
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

    /**
     * 修改用户
     * @param sysUser
     * @return SysMsg
     */
    @PutMapping
    public SysMsg updateUser(@RequestBody SysUser sysUser) {
        try {
            logger.info("尝试更改用户："+sysUser);
            return SysMsg.success().add("state",sysUserService.updateUser(sysUser));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }

    /**
     * 删除用户
     * @param id
     * @return SysMsg
     */
    @DeleteMapping("/{uid}")
    public SysMsg deleteUser(@PathVariable("uid") int id) {

        try {
            logger.info("尝试添加用户："+id);
            return SysMsg.success().add("state",sysUserService.deleteUser(id));
        }catch (Exception e){
            logger.error(e.toString());
            return SysMsg.failed();
        }
    }
}
