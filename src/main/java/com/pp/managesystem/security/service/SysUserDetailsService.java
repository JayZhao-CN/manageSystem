package com.pp.managesystem.security.service;

import com.pp.managesystem.dao.SysCompanyMapper;
import com.pp.managesystem.dao.SysPositionMapper;
import com.pp.managesystem.entity.*;
import com.pp.managesystem.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class SysUserDetailsService implements UserDetailsService {
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    SysPositionMapper sysPositionMapper;

    @Autowired
    SysCompanyMapper sysCompanyMapper;

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

        /**
         * 角色信息（控制权限）
         */
        //角色所属公司信息
        List<SysPosition> positions = new ArrayList<>();

        // 得到用户角色
        String roles = sysUser.getuPosition();
        // 角色集合
        List<SecurityGrantedAuthorityImpl> authorities = new ArrayList<>();

        ArrayList<String> roleList = new ArrayList<>();

        String[] split = roles.split("/");
        for (String role : split) {
            if (!role.equals("")) {
                // 添加进角色表
                roleList.add(role);
                // 查询该角色详细信息
                SysPosition sysPosition = sysPositionMapper.selectByPositionCode(role);
                // 详细信息临时保存
                positions.add(sysPosition);
                // 角色必须以`ROLE_`开头，数据库中没有，则在这里加
                authorities.add(new SecurityGrantedAuthorityImpl("ROLE_" + role));
            }
        }

        /**
         * 公司信息
         */
        // 查询到的组合
        String companies = sysUser.getuCompany();
        // 公司列表
        List<Map> companyList = new ArrayList<>();


        String[] split1 = companies.split("/");
        for (String company : split1) {
            if (!company.equals("")) {
                /*
                {
                    company:001
                    positions:[002,003]
                }
                */
                // 先构建一个保存最终结果的map
                Map map = new HashMap();
                /**
                 * 查询该循环公司的名称
                 */
                SysCompany sysCompany = sysCompanyMapper.selectByCompanyCode(company);// 得到了该公司的所有信息
                try{
                map.put("companyName",sysCompany.getCoName());
                }catch (Exception e){
                    e.printStackTrace();
                }

                // company:001
                map.put("companyCode", company);
                // [002,003]
//                List<String> positionList = new ArrayList<>();

                List positionList = new ArrayList();

                // 循环刚刚保存的角色信息
                // 比对是否与当前循环中的公司匹配
                for (SysPosition position : positions) {
                    if (position != null && !position.equals("")) {
                        String possessCompany = position.getpCompany();
                        if (possessCompany.equals(company)) {
                            // 首先构建一个保存职位详细信息的map
                            Map positionListChild = new HashMap();
                            positionListChild.put("positionCode", position.getpCode());

                            /**
                             * 查询该职位详细信息
                             */
                            SysPosition sysPosition = sysPositionMapper.selectByPositionCode(position.getpCode());// 得到当前循环中的职位信息
                            positionListChild.put("positionName", sysPosition.getpName());
                            // positionListChild放入positionList
                            positionList.add(positionListChild);
                        }
                    }
                }
                map.put("positionList",positionList);
                companyList.add(map);
            }
        }

//        {
//            companyAndRoleList:[
//                        {
//                            companyCode:001,
//                            companyName:美舒雅,
//                            positionList:[
//                                        {
//                                            positionCode:002,
//                                            positionName::职位1
//                                        }
//                                        {
//                                            positionCode:003,
//                                            positionName::职位2
//                                        }
//                                    ]
//                        }
//                        {
//                            companyCode:002,
//                            companyName:笨鸽,
//                            positionList:[
//                                        {
//                                            positionCode:002,
//                                            positionName::职位1
//                                        }
//                                        {
//                                            positionCode:003,
//                                            positionName::职位2
//                                        }
//                                    ]
//                        }
//                    ]
//        }


        Long sign = System.currentTimeMillis();

        return new SecurityUserDetailsImp(
                authorities,
                sysUser.getuPassword(),
                sysUser.getuUsername(),
                sign,
                companyList,
                roleList
        );
    }
}
