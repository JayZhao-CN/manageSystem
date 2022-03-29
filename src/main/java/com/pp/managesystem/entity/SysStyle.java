package com.pp.managesystem.entity;

import java.io.Serializable;

public class SysStyle implements Serializable {
    private Integer stId;

    private String stName;

    private String stCode;

    private String stImg;

    private String stCompany;


    private static final long serialVersionUID = 1L;

    public SysStyle() {
    }

    public SysStyle(Integer stId, String stCompany) {
        this.stId = stId;
        this.stCompany = stCompany;
    }

    public String getStImg() {
        return stImg;
    }

    public void setStImg(String stImg) {
        this.stImg = stImg;
    }

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName == null ? null : stName.trim();
    }

    public String getStCode() {
        return stCode;
    }

    public void setStCode(String stCode) {
        this.stCode = stCode == null ? null : stCode.trim();
    }

    public String getStCompany() {
        return stCompany;
    }

    public void setStCompany(String stCompany) {
        this.stCompany = stCompany;
    }

    @Override
    public String toString() {
        return "SysStyle{" +
                "stId=" + stId +
                ", stName='" + stName + '\'' +
                ", stCode='" + stCode + '\'' +
                ", stImg='" + stImg + '\'' +
                ", stCompany='" + stCompany + '\'' +
                '}';
    }
}