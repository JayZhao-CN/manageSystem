package com.pp.managesystem.entity;

import java.io.Serializable;

public class SysShowTable implements Serializable {
    private Integer stId;

    private Integer stTable;

    private String stColumn;

    private String stName;

    private static final long serialVersionUID = 1L;

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public Integer getStTable() {
        return stTable;
    }

    public void setStTable(Integer stTable) {
        this.stTable = stTable;
    }

    public String getStColumn() {
        return stColumn;
    }

    public void setStColumn(String stColumn) {
        this.stColumn = stColumn == null ? null : stColumn.trim();
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName == null ? null : stName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stId=").append(stId);
        sb.append(", stTable=").append(stTable);
        sb.append(", stColumn=").append(stColumn);
        sb.append(", stName=").append(stName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}