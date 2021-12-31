package com.pp.managesystem.entity;

import org.springframework.security.core.GrantedAuthority;

public class SecurityGrantedAuthorityImpl implements GrantedAuthority {
    private String authority;

    public SecurityGrantedAuthorityImpl() {
    }

    public SecurityGrantedAuthorityImpl(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    @Override
    public String toString() {
        return getAuthority();
    }
}