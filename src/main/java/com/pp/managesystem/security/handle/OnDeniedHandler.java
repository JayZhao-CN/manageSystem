package com.pp.managesystem.security.handle;

import com.pp.managesystem.entity.SysMsg;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OnDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        SysMsg result = SysMsg.failed().add("code",403).add("auth", accessDeniedException.getMessage());
        response.getWriter().write(result.toString());
    }
}
