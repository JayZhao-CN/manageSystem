package com.pp.managesystem.security.handle;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pp.managesystem.entity.SecurityUserDetailsImp;
import com.pp.managesystem.entity.SysMsg;
import com.pp.managesystem.security.JWT;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OnAuthSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {

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
            SysMsg result = SysMsg.success()
                    .add("token",jwt.toString())
                    .add("roles",((SecurityUserDetailsImp) auth.getPrincipal()).getRoles())
                    .add("username",((SecurityUserDetailsImp) auth.getPrincipal()).getUsername())
                    .add("companyAndRoleList",((SecurityUserDetailsImp) auth.getPrincipal()).getCompany());
            response.setHeader("Content-Type","text/html;charset=utf-8");
            response.getWriter()
                    .write(String.valueOf(result));
        }
    }
}
