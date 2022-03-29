package com.pp.managesystem.entity;

import java.io.Serializable;

public class SysSize implements Serializable {
    private Integer sId;

    private String sName;

    private String sCode;

    private String sCompany;

    public SysSize() {
    }

    public SysSize(Integer sId, String sCompany) {
        this.sId = sId;
        this.sCompany = sCompany;
    }

    private static final long serialVersionUID = 1L;

    public String getsCompany() {
        return sCompany;
    }

    public void setsCompany(String sCompany) {
        this.sCompany = sCompany;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode == null ? null : sCode.trim();
    }

    @Override
    public String toString() {
        return "SysSize{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sCode='" + sCode + '\'' +
                ", sCompany='" + sCompany + '\'' +
                '}';
    }
}