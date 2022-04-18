package com.pp.managesystem.entity;

import java.io.Serializable;

public class SysType implements Serializable {
    private Integer tId;

    private String tName;

    private String tCode;

    private String tCompany;

    private static final long serialVersionUID = 1L;

    public SysType() {
    }

    public SysType(Integer tId, String tCompany) {
        this.tId = tId;
        this.tCompany = tCompany;
    }

    public String gettCompany() {
        return tCompany;
    }

    public void settCompany(String tCompany) {
        this.tCompany = tCompany;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettCode() {
        return tCode;
    }

    public void settCode(String tCode) {
        this.tCode = tCode == null ? null : tCode.trim();
    }

    @Override
    public String toString() {
        return "SysType{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", tCode='" + tCode + '\'' +
                ", tCompany='" + tCompany + '\'' +
                '}';
    }
}