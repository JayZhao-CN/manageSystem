package com.pp.managesystem.entity;

import java.io.Serializable;

public class SysProduct implements Serializable {
    private Integer prId;

    private String prCode;

    private String prCompany;

    private String prBatch;

    private String prType;

    private String prColor;

    private String prSize;

    private Integer prCount;

    private String prRemark;

    private static final long serialVersionUID = 1L;

    public Integer getPrId() {
        return prId;
    }

    public void setPrId(Integer prId) {
        this.prId = prId;
    }

    public String getPrCode() {
        return prCode;
    }

    public void setPrCode(String prCode) {
        this.prCode = prCode == null ? null : prCode.trim();
    }

    public String getPrCompany() {
        return prCompany;
    }

    public void setPrCompany(String prCompany) {
        this.prCompany = prCompany == null ? null : prCompany.trim();
    }

    public String getPrBatch() {
        return prBatch;
    }

    public void setPrBatch(String prBatch) {
        this.prBatch = prBatch == null ? null : prBatch.trim();
    }

    public String getPrType() {
        return prType;
    }

    public void setPrType(String prType) {
        this.prType = prType == null ? null : prType.trim();
    }

    public String getPrColor() {
        return prColor;
    }

    public void setPrColor(String prColor) {
        this.prColor = prColor == null ? null : prColor.trim();
    }

    public String getPrSize() {
        return prSize;
    }

    public void setPrSize(String prSize) {
        this.prSize = prSize == null ? null : prSize.trim();
    }

    public Integer getPrCount() {
        return prCount;
    }

    public void setPrCount(Integer prCount) {
        this.prCount = prCount;
    }

    public String getPrRemark() {
        return prRemark;
    }

    public void setPrRemark(String prRemark) {
        this.prRemark = prRemark == null ? null : prRemark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prId=").append(prId);
        sb.append(", prCode=").append(prCode);
        sb.append(", prCompany=").append(prCompany);
        sb.append(", prBatch=").append(prBatch);
        sb.append(", prType=").append(prType);
        sb.append(", prColor=").append(prColor);
        sb.append(", prSize=").append(prSize);
        sb.append(", prCount=").append(prCount);
        sb.append(", prRemark=").append(prRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}