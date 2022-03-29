package com.pp.managesystem.entity;

import java.io.Serializable;

public class SysColor implements Serializable {
    private Integer cId;

    private String cName;

    private String cCode;
    private String cCompany;
    private String cColor;

    private static final long serialVersionUID = 1L;

    public SysColor() {
    }

    public SysColor(Integer cId, String cCompany) {
        this.cId = cId;
        this.cCompany = cCompany;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode == null ? null : cCode.trim();
    }

    public String getcCompany() {
        return cCompany;
    }

    public void setcCompany(String cCompany) {
        this.cCompany = cCompany;
    }

    public String getcColor() {
        return cColor;
    }

    public void setcColor(String cColor) {
        this.cColor = cColor;
    }

    @Override
    public String toString() {
        return "SysColor{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cCode='" + cCode + '\'' +
                ", cCompany='" + cCompany + '\'' +
                ", cColor='" + cColor + '\'' +
                '}';
    }
}