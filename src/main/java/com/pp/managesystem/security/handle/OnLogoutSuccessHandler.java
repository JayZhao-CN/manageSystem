package com.pp.managesystem.security.handle;

import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.util.JWTUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

public class OnLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {

    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
                                Authentication authentication) throws IOException, ServletException {

        Collection<? extends GrantedAuthority> userAuthorities = null;
        response.setContentType("application/json;charset=utf-8");

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String token = request.getHeader(JWTUtils.HEADER_TOKEN_NAME);

        if (null == token){
            SysMsg result = SysMsg.failed().add("code", 405).add("auth", "非法访问！未登录！");
            response.getWriter().write(result.toString());
        }else {
            response.getWriter().write(SysMsg.success().toString());
        }
    }
}
