package com.pp.managesystem.entity.form;

import lombok.Data;

@Data
public class SysUserForm {
    private Integer uId;

    private String uUsername;

    private String uCode;

    private String uPassword;

    private String uPhone;

    private String uCompany;

    private String uCompanyName;

    private String uPosition;

    private String uPositionName;

    private Long uTimeStart;

    private Long uTimeEnd;

    private Integer uToken;
}
