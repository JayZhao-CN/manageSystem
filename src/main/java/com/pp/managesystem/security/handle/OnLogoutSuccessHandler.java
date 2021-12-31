package com.pp.managesystem.security.handle;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pp.managesystem.entity.SecurityUserDetailsImp;
import com.pp.managesystem.security.JWT;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OnLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {

    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
                                Authentication authentication) throws IOException, ServletException {
        response.setContentType("application/json;charset=utf-8");

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        ObjectMapper objectMapper = new ObjectMapper();

        if (auth.getPrincipal() instanceof SecurityUserDetailsImp) {
            SecurityUserDetailsImp principal = (SecurityUserDetailsImp) auth.getPrincipal();
            JWT jwt = null;
            try {
                jwt = new JWT(objectMapper.writeValueAsString(principal));
            } catch (Exception e) {
                e.printStackTrace();
            }

            response.getWriter().write("{\"code\": \"200\", \"msg\": \"登录成功\"}"
                    + "\n用户名：" + ((SecurityUserDetailsImp) auth.getPrincipal()).getUsername()
                    + "\n角色:" +  auth.getAuthorities()
                    + "\ntoken:\n" + jwt.toString()
            );
        }
    }
}
