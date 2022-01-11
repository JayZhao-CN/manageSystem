package com.pp.managesystem.entity;

import lombok.Data;

@Data
public class SysShowTableBase {
    private String column_name;
    private String data_type;
    private String COLUMN_COMMENT;
}
