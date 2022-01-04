package com.pp.managesystem.service;

import com.pp.managesystem.entity.SecurityGrantedAuthorityImpl;
import com.pp.managesystem.entity.SecurityUserDetailsImp;
import com.pp.managesystem.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SysUserDetailsService implements UserDetailsService {
    @Autowired
    private SysUserService sysUserService;

    /**
     * 需新建配置类注册一个指定的加密方式Bean，或在下一步Security配置类中注册指定
     */
    @Lazy
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 通过用户名从数据库获取用户信息
        /**
         * 查询数据库用户信息
         */
        SysUser sysUser = sysUserService.getUser(username);
        if (sysUser == null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        sysUserService.updateToken(new SysUser(username,1));

        /**
         * 角色信息（控制权限）
         */
        // 得到用户角色
        String role = sysUser.getuPosition();

        // 角色集合
        List<SecurityGrantedAuthorityImpl> authorities = new ArrayList<>();
        // 角色必须以`ROLE_`开头，数据库中没有，则在这里加
        authorities.add(new SecurityGrantedAuthorityImpl("ROLE_" + role));

        Long sign = System.currentTimeMillis();

        return new SecurityUserDetailsImp(
                authorities,
                sysUser.getuPassword(),
                sysUser.getuUsername(),
                sign
        );
    }
}
