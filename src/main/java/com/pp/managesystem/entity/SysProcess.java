package com.pp.managesystem.entity;

import java.io.Serializable;

public class SysProcess implements Serializable {
    private Integer prcId;

    private String prcCode;

    private String prcName;

    private String prcCompany;

    private static final long serialVersionUID = 1L;

    public SysProcess() {
    }

    public SysProcess(Integer prcId, String prcCompany) {
        this.prcId = prcId;
        this.prcCompany = prcCompany;
    }

    public Integer getPrcId() {
        return prcId;
    }

    public void setPrcId(Integer prcId) {
        this.prcId = prcId;
    }

    public String getPrcCode() {
        return prcCode;
    }

    public void setPrcCode(String prcCode) {
        this.prcCode = prcCode == null ? null : prcCode.trim();
    }

    public String getPrcName() {
        return prcName;
    }

    public void setPrcName(String prcName) {
        this.prcName = prcName;
    }

    public String getPrcCompany() {
        return prcCompany;
    }

    public void setPrcCompany(String prcCompany) {
        this.prcCompany = prcCompany == null ? null : prcCompany.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prcId=").append(prcId);
        sb.append(", prcCode=").append(prcCode);
        sb.append(", prcName=").append(prcName);
        sb.append(", prcCompany=").append(prcCompany);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}