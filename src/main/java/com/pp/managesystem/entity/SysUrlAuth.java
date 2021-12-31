package com.pp.managesystem.entity;

import java.io.Serializable;

public class SysUrlAuth implements Serializable {
    private Integer uaId;

    private String uaUrl;

    private String uaAuth;

    private static final long serialVersionUID = 1L;

    public Integer getUaId() {
        return uaId;
    }

    public void setUaId(Integer uaId) {
        this.uaId = uaId;
    }

    public String getUaUrl() {
        return uaUrl;
    }

    public void setUaUrl(String uaUrl) {
        this.uaUrl = uaUrl == null ? null : uaUrl.trim();
    }

    public String getUaAuth() {
        return uaAuth;
    }

    public void setUaAuth(String uaAuth) {
        this.uaAuth = uaAuth == null ? null : uaAuth.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uaId=").append(uaId);
        sb.append(", uaUrl=").append(uaUrl);
        sb.append(", uaAuth=").append(uaAuth);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}