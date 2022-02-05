package com.pp.managesystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class SecurityUserDetailsImp implements UserDetails {

    private List<SecurityGrantedAuthorityImpl> authorities;

    @JsonIgnore
    private String password;

    private String username;

    @JsonIgnore
    private boolean accountNonExpired;
    @JsonIgnore
    private boolean accountNonLocked;
    @JsonIgnore
    private boolean credentialsNonExpired;
    @JsonIgnore
    private boolean enabled;

    private Long sign;

    private List<Map> companies;

    public ArrayList<String> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }

    private ArrayList<String> roles;

    public SecurityUserDetailsImp() {
    }

    public SecurityUserDetailsImp(List<SecurityGrantedAuthorityImpl> authorities, String password, String username, Long sign, List<Map> companies, ArrayList<String> roles) {
        this.authorities = authorities;
        this.password = password;
        this.username = username;
        this.accountNonExpired = true;
        this.accountNonLocked = true;
        this.credentialsNonExpired = true;
        this.enabled = true;
        this.sign = sign;
        this.companies = companies;
        this.roles = roles;
    }

    public SecurityUserDetailsImp(Long sign) {
        this.sign = sign;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {

        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public Long getSign() {
        return sign;
    }

    public void setSign(Long sign) {
        this.sign = sign;
    }

    public List<Map> getCompany(){
        return companies;
    }

    public void setCompany(List<Map> companies){
        this.companies = companies;
    }

    @Override
    public String toString() {
        return "SecurityUserDetailsImp{" +
                "authorities=" + authorities +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", accountNonExpired=" + accountNonExpired +
                ", accountNonLocked=" + accountNonLocked +
                ", credentialsNonExpired=" + credentialsNonExpired +
                ", enabled=" + enabled +
                ", sign=" + sign +
                ", company=" + companies +
                '}';
    }
}
