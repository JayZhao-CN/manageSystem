package com.pp.managesystem.security.interceptor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pp.managesystem.entity.SecurityUserDetailsImp;
import com.pp.managesystem.util.JWTUtils;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.FilterInvocation;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

@Component
public class MyAccessDecisionManager implements AccessDecisionManager {
    @Override
    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException {
        Collection<? extends GrantedAuthority> userAuthorities = null;

        if(configAttributes==null){
            return;
        }
        String token = ((FilterInvocation) o).getHttpRequest().getHeader(JWTUtils.HEADER_TOKEN_NAME);
        if (Objects.nonNull(token) && token.trim().length() > 0) {

            String payload = JWTUtils.testJwt(token);   // 从token中拿到payload

            if (Objects.nonNull(payload) && payload.trim().length() > 0) {

                ObjectMapper objectMapper = new ObjectMapper();
                // 我这个项目的payload是UserDetailImp的序列化后的Json，这里将其还原为UserDetailImpl对象

                SecurityUserDetailsImp user = null;
                try {
                    user = objectMapper.readValue(payload, SecurityUserDetailsImp.class);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                userAuthorities = user.getAuthorities();
            }
        }



        Iterator<ConfigAttribute> iterator = configAttributes.iterator();
        while (iterator.hasNext()){
            ConfigAttribute c = iterator.next();
            String needPerm = c.getAttribute();
            for(GrantedAuthority ga : userAuthorities) {
                // 匹配用户拥有的ga 和 系统中的needPerm
                if(("ROLE_" + needPerm).trim().equals(ga.getAuthority())) {
                    return;
                }
            }
        }
        throw new AccessDeniedException("抱歉，您没有访问权限");
    }
    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }
    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
