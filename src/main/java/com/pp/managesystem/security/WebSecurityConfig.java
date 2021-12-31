package com.pp.managesystem.security;

import com.pp.managesystem.security.handle.OnAuthFailHandler;
import com.pp.managesystem.security.handle.OnAuthSuccessHandler;
import com.pp.managesystem.security.handle.OnLogoutSuccessHandler;
import com.pp.managesystem.security.interceptor.MyFilterSecurityInterceptor;
import com.pp.managesystem.service.SysUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) // 开启方法级安全验证
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private SysUserDetailsService sysUserDetailsService;

    @Autowired
    private MyFilterSecurityInterceptor myFilterSecurityInterceptor;
    /**
     * 指定加密方式
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        // 使用BCrypt加密密码
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                // 从数据库读取的用户进行身份认证
                .userDetailsService(sysUserDetailsService)
                .passwordEncoder(passwordEncoder());
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // 拦截验证token
//                .addFilterBefore(new JwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(myFilterSecurityInterceptor, FilterSecurityInterceptor.class)
                // 设置无session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                // 过滤链接设置
                .authorizeRequests()
                // 设置忽略链接
                .antMatchers("/","/druid/**","/static/**","/login","/login.html").permitAll()
                // 所有请求都需要验证
                .anyRequest().authenticated()
                .and()

                // 设置登录表单提交页面
                .formLogin()
                .loginProcessingUrl("/login").permitAll()
                // 登录成功处理
                .successHandler(new OnAuthSuccessHandler())
                // 登录失败处理
                .failureHandler(new OnAuthFailHandler())
                .and()

                // 退出登录处理
                .logout()
                .logoutSuccessHandler(new OnLogoutSuccessHandler())
                .logoutUrl("/logout")
                .and()
                .csrf().disable();// post请求要关闭csrf验证,不然访问报错；实际开发中开启，需要前端配合传递其他参数
    }
}
