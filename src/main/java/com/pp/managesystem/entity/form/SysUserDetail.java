package com.pp.managesystem.entity.form;

import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@ToString
public class SysUserDetail implements Serializable {
    private Integer uId;

    private String uUsername;

    private String uCode;

    private String uPassword;

    private String uPhone;

    private String uCompany;

    private String uCompanyDetail;//公司名

    private String uPosition;

    private Map<String, List<Map<String,String>>> positionList;//职位数组

    private String uPositionDetail;//职位名

    private Long uTimeStart;

    private Long uTimeEnd;

    private String uNickCode;

    public Map<String, List<Map<String, String>>> getPositionList() {
        return positionList;
    }

    public void setPositionList(Map<String, List<Map<String, String>>> positionList) {
        this.positionList = positionList;
    }

    public String getuNickCode() {
        return uNickCode;
    }

    public void setuNickCode(String uNickCode) {
        this.uNickCode = uNickCode;
    }

    private static final long serialVersionUID = 1L;

    public String getuCompanyDetail() {
        return uCompanyDetail;
    }

    public void setuCompanyDetail(String uCompanyDetail) {
        this.uCompanyDetail = uCompanyDetail;
    }

    public String getuPositionDetail() {
        return uPositionDetail;
    }

    public void setuPositionDetail(String uPositionDetail) {
        this.uPositionDetail = uPositionDetail;
    }

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

}
