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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uId=").append(uId);
        sb.append(", uUsername=").append(uUsername);
        sb.append(", uCode=").append(uCode);
        sb.append(", uPassword=").append(uPassword);
        sb.append(", uPhone=").append(uPhone);
        sb.append(", uCompany=").append(uCompany);
        sb.append(", uPosition=").append(uPosition);
        sb.append(", uTimeStart=").append(uTimeStart);
        sb.append(", uTimeEnd=").append(uTimeEnd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}