package com.pp.managesystem.entity;

import java.io.Serializable;

public class SysUser implements Serializable {
    private Integer uId;

    private String uUsername;

    private String uCode;

    private String uPassword;

    private String uPhone;

    private String uCompany;

    private String uPosition;

    private Long uTimeStart;

    private Long uTimeEnd;

    private Integer uToken;

    public SysUser() {
    }

    public SysUser(String uUsername, Integer uToken) {
        this.uUsername = uUsername;
        this.uToken = uToken;
    }

    public Integer getuToken() {
        return uToken;
    }

    public void setuToken(Integer uToken) {
        this.uToken = uToken;
    }

    private static final long serialVersionUID = 1L;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getuCode() {
        return uCode;
    }

    public void setuCode(String uCode) {
        this.uCode = uCode == null ? null : uCode.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuCompany() {
        return uCompany;
    }

    public void setuCompany(String uCompany) {
        this.uCompany = uCompany == null ? null : uCompany.trim();
    }

    public String getuPosition() {
        return uPosition;
    }

    public void setuPosition(String uPosition) {
        this.uPosition = uPosition == null ? null : uPosition.trim();
    }

    public Long getuTimeStart() {
        return uTimeStart;
    }

    public void setuTimeStart(Long uTimeStart) {
        this.uTimeStart = uTimeStart;
    }

    public Long getuTimeEnd() {
        return uTimeEnd;
    }

    public void setuTimeEnd(Long uTimeEnd) {
        this.uTimeEnd = uTimeEnd;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "uId=" + uId +
                ", uUsername='" + uUsername + '\'' +
                ", uCode='" + uCode + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uPhone='" + uPhone + '\'' +
                ", uCompany='" + uCompany + '\'' +
                ", uPosition='" + uPosition + '\'' +
                ", uTimeStart=" + uTimeStart +
                ", uTimeEnd=" + uTimeEnd +
                ", uToken=" + uToken +
                '}';
    }
}