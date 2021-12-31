package com.pp.managesystem.entity;

import java.io.Serializable;

public class SysProcessRemark implements Serializable {
    private Integer prrId;

    private String prrCompany;

    private String prrX;

    private String prrRemark;

    private static final long serialVersionUID = 1L;

    public Integer getPrrId() {
        return prrId;
    }

    public void setPrrId(Integer prrId) {
        this.prrId = prrId;
    }

    public String getPrrCompany() {
        return prrCompany;
    }

    public void setPrrCompany(String prrCompany) {
        this.prrCompany = prrCompany == null ? null : prrCompany.trim();
    }

    public String getPrrX() {
        return prrX;
    }

    public void setPrrX(String prrX) {
        this.prrX = prrX == null ? null : prrX.trim();
    }

    public String getPrrRemark() {
        return prrRemark;
    }

    public void setPrrRemark(String prrRemark) {
        this.prrRemark = prrRemark == null ? null : prrRemark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prrId=").append(prrId);
        sb.append(", prrCompany=").append(prrCompany);
        sb.append(", prrX=").append(prrX);
        sb.append(", prrRemark=").append(prrRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}