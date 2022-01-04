package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysUserMapper;
import com.pp.managesystem.entity.SysUser;
import com.pp.managesystem.entity.SysUserDetail;
import com.pp.managesystem.entity.SysUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Lazy
    @Autowired
    PasswordEncoder passwordEncoder;

    public List<SysUser> getAllUsers(){
        return sysUserMapper.selectByExample(new SysUserExample());
    }

    public List<SysUserDetail> selectAll(){
        return sysUserMapper.selectAll();
    }

    public SysUser getUser(int id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    public SysUser getUser(String username) {
        return sysUserMapper.selectByUsername(username);
    }

    public Integer addUser(SysUser sysUser) {
        // 加密密码
        sysUser.setuPassword(passwordEncoder.encode(sysUser.getuPassword()));
        return sysUserMapper.insert(sysUser);
    }

    public Integer updateUser(SysUser sysUser) {
        return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    public Integer updateToken(SysUser sysUser){
        return sysUserMapper.updateToken(sysUser);
    }

    public int deleteUser(int id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }
}
