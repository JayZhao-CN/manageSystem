package com.pp.managesystem.entity;

import java.io.Serializable;

public class SysCompany implements Serializable {
    private Integer coId;

    private String coName;

    private String coCode;

    private Integer coState;

    private static final long serialVersionUID = 1L;

    public SysCompany() {
    }

    public SysCompany(String coName) {
        this.coName = coName;
    }

    public Integer getCoId() {
        return coId;
    }

    public void setCoId(Integer coId) {
        this.coId = coId;
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName == null ? null : coName.trim();
    }

    public String getCoCode() {
        return coCode;
    }

    public void setCoCode(String coCode) {
        this.coCode = coCode == null ? null : coCode.trim();
    }

    public Integer getCoState() {
        return coState;
    }

    public void setCoState(Integer coState) {
        this.coState = coState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", coId=").append(coId);
        sb.append(", coName=").append(coName);
        sb.append(", coCode=").append(coCode);
        sb.append(", coState=").append(coState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}