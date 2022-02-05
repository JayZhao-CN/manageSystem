package com.pp.managesystem.entity.form;

import java.io.Serializable;

public class SysPositionDetail implements Serializable {
    private Integer pId;

    private String pName;

    private String pCode;

    private String pCompany;

    private static final long serialVersionUID = 1L;

    public String getpCompany() {
        return pCompany;
    }

    public void setpCompany(String pCompany) {
        this.pCompany = pCompany;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode == null ? null : pCode.trim();
    }

    @Override
    public String toString() {
        return "SysPositionDetail{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pCode='" + pCode + '\'' +
                ", pCompany='" + pCompany + '\'' +
                '}';
    }
}