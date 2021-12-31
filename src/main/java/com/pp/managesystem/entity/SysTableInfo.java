package com.pp.managesystem.entity;

import java.io.Serializable;

public class SysTableInfo implements Serializable {
    private Integer tiId;

    private String tiTable;

    private String tiName;

    private static final long serialVersionUID = 1L;

    public Integer getTiId() {
        return tiId;
    }

    public void setTiId(Integer tiId) {
        this.tiId = tiId;
    }

    public String getTiTable() {
        return tiTable;
    }

    public void setTiTable(String tiTable) {
        this.tiTable = tiTable == null ? null : tiTable.trim();
    }

    public String getTiName() {
        return tiName;
    }

    public void setTiName(String tiName) {
        this.tiName = tiName == null ? null : tiName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tiId=").append(tiId);
        sb.append(", tiTable=").append(tiTable);
        sb.append(", tiName=").append(tiName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}