package com.pp.managesystem.security.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pp.managesystem.entity.SecurityUserDetailsImp;
import com.pp.managesystem.util.JWTUtils;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Objects;

/**
 * 验证token是否正确，并从token中还原"session"信息
 */
public class JwtAuthenticationFilter extends GenericFilter {
    private AuthenticationException AuthenticationException;

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String token = request.getHeader(JWTUtils.HEADER_TOKEN_NAME);   // 从请求头中拿到token

        if (Objects.nonNull(token) && token.trim().length() > 0) {

            String payload = JWTUtils.testJwt(token);   // 从token中拿到payload

            if (Objects.nonNull(payload) && payload.trim().length() > 0) {

                ObjectMapper objectMapper = new ObjectMapper();

                SecurityUserDetailsImp user = objectMapper.readValue(payload, SecurityUserDetailsImp.class);

                long deltaSign = System.currentTimeMillis() - user.getSign();
                if (deltaSign < 1000 * 60 * 60 * 24 * 6.5) { // 六天半有效期
                    // 将还原得到的认证信息交给spring-security管理（用户信息,认证,用户角色表）
                    SecurityContextHolder
                            .getContext()
                            .setAuthentication(
                                    new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities()));
                }
            }
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }
}

