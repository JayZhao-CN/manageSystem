package com.pp.managesystem.entity;

import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@ToString
public class SysUser implements Serializable {
    private Integer uId;

    private String uUsername;

    private String uCode;

    private String uPassword;

    private String uPhone;

    private String uCompany;

    private String uPosition;

    private List<String> uPositions;

    private Long uTimeStart;

    private Long uTimeEnd;

    private Integer uToken;

    private String uNickCode;

    public String getuNickCode() {
        return uNickCode;
    }

    public void setuNickCode(String uNickCode) {
        this.uNickCode = uNickCode;
    }

    public SysUser() {
    }

    public SysUser(Integer uId, String uUsername, String uCode, String uPassword, String uPhone, String uCompany, String uPosition, Long uTimeStart, Long uTimeEnd, Integer uToken, String uNickCode) {
        this.uId = uId;
        this.uUsername = uUsername;
        this.uCode = uCode;
        this.uPassword = uPassword;
        this.uPhone = uPhone;
        this.uCompany = uCompany;
        this.uPosition = uPosition;
        this.uTimeStart = uTimeStart;
        this.uTimeEnd = uTimeEnd;
        this.uToken = uToken;
        this.uNickCode = uNickCode;
    }

    public List<String> getuPositions() {
        return uPositions;
    }

    public void setuPositions(List<String> uPositions) {
        this.uPositions = uPositions;
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
                ", uNickCode='" + uNickCode + '\'' +
                '}';
    }
}