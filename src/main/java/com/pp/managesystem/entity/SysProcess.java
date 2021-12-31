package com.pp.managesystem.entity;

import java.io.Serializable;

public class SysProcess implements Serializable {
    private Integer prcId;

    private String prcCode;

    private String prcA;

    private Long prcAt;

    private String prcAr;

    private String prcB;

    private Long prcBt;

    private String prcBr;

    private String prcC;

    private Long prcCt;

    private String prcCr;

    private String prcD;

    private Long prcDt;

    private String prcDr;

    private String prcE;

    private Long prcEt;

    private String prcFr;

    private String prcG;

    private Long prcGt;

    private String prcHr;

    private String prcI;

    private Long prcIt;

    private String prcIr;

    private String prcJ;

    private Long prcJt;

    private String prcJr;

    private static final long serialVersionUID = 1L;

    public Integer getPrcId() {
        return prcId;
    }

    public void setPrcId(Integer prcId) {
        this.prcId = prcId;
    }

    public String getPrcCode() {
        return prcCode;
    }

    public void setPrcCode(String prcCode) {
        this.prcCode = prcCode == null ? null : prcCode.trim();
    }

    public String getPrcA() {
        return prcA;
    }

    public void setPrcA(String prcA) {
        this.prcA = prcA == null ? null : prcA.trim();
    }

    public Long getPrcAt() {
        return prcAt;
    }

    public void setPrcAt(Long prcAt) {
        this.prcAt = prcAt;
    }

    public String getPrcAr() {
        return prcAr;
    }

    public void setPrcAr(String prcAr) {
        this.prcAr = prcAr == null ? null : prcAr.trim();
    }

    public String getPrcB() {
        return prcB;
    }

    public void setPrcB(String prcB) {
        this.prcB = prcB == null ? null : prcB.trim();
    }

    public Long getPrcBt() {
        return prcBt;
    }

    public void setPrcBt(Long prcBt) {
        this.prcBt = prcBt;
    }

    public String getPrcBr() {
        return prcBr;
    }

    public void setPrcBr(String prcBr) {
        this.prcBr = prcBr == null ? null : prcBr.trim();
    }

    public String getPrcC() {
        return prcC;
    }

    public void setPrcC(String prcC) {
        this.prcC = prcC == null ? null : prcC.trim();
    }

    public Long getPrcCt() {
        return prcCt;
    }

    public void setPrcCt(Long prcCt) {
        this.prcCt = prcCt;
    }

    public String getPrcCr() {
        return prcCr;
    }

    public void setPrcCr(String prcCr) {
        this.prcCr = prcCr == null ? null : prcCr.trim();
    }

    public String getPrcD() {
        return prcD;
    }

    public void setPrcD(String prcD) {
        this.prcD = prcD == null ? null : prcD.trim();
    }

    public Long getPrcDt() {
        return prcDt;
    }

    public void setPrcDt(Long prcDt) {
        this.prcDt = prcDt;
    }

    public String getPrcDr() {
        return prcDr;
    }

    public void setPrcDr(String prcDr) {
        this.prcDr = prcDr == null ? null : prcDr.trim();
    }

    public String getPrcE() {
        return prcE;
    }

    public void setPrcE(String prcE) {
        this.prcE = prcE == null ? null : prcE.trim();
    }

    public Long getPrcEt() {
        return prcEt;
    }

    public void setPrcEt(Long prcEt) {
        this.prcEt = prcEt;
    }

    public String getPrcFr() {
        return prcFr;
    }

    public void setPrcFr(String prcFr) {
        this.prcFr = prcFr == null ? null : prcFr.trim();
    }

    public String getPrcG() {
        return prcG;
    }

    public void setPrcG(String prcG) {
        this.prcG = prcG == null ? null : prcG.trim();
    }

    public Long getPrcGt() {
        return prcGt;
    }

    public void setPrcGt(Long prcGt) {
        this.prcGt = prcGt;
    }

    public String getPrcHr() {
        return prcHr;
    }

    public void setPrcHr(String prcHr) {
        this.prcHr = prcHr == null ? null : prcHr.trim();
    }

    public String getPrcI() {
        return prcI;
    }

    public void setPrcI(String prcI) {
        this.prcI = prcI == null ? null : prcI.trim();
    }

    public Long getPrcIt() {
        return prcIt;
    }

    public void setPrcIt(Long prcIt) {
        this.prcIt = prcIt;
    }

    public String getPrcIr() {
        return prcIr;
    }

    public void setPrcIr(String prcIr) {
        this.prcIr = prcIr == null ? null : prcIr.trim();
    }

    public String getPrcJ() {
        return prcJ;
    }

    public void setPrcJ(String prcJ) {
        this.prcJ = prcJ == null ? null : prcJ.trim();
    }

    public Long getPrcJt() {
        return prcJt;
    }

    public void setPrcJt(Long prcJt) {
        this.prcJt = prcJt;
    }

    public String getPrcJr() {
        return prcJr;
    }

    public void setPrcJr(String prcJr) {
        this.prcJr = prcJr == null ? null : prcJr.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prcId=").append(prcId);
        sb.append(", prcCode=").append(prcCode);
        sb.append(", prcA=").append(prcA);
        sb.append(", prcAt=").append(prcAt);
        sb.append(", prcAr=").append(prcAr);
        sb.append(", prcB=").append(prcB);
        sb.append(", prcBt=").append(prcBt);
        sb.append(", prcBr=").append(prcBr);
        sb.append(", prcC=").append(prcC);
        sb.append(", prcCt=").append(prcCt);
        sb.append(", prcCr=").append(prcCr);
        sb.append(", prcD=").append(prcD);
        sb.append(", prcDt=").append(prcDt);
        sb.append(", prcDr=").append(prcDr);
        sb.append(", prcE=").append(prcE);
        sb.append(", prcEt=").append(prcEt);
        sb.append(", prcFr=").append(prcFr);
        sb.append(", prcG=").append(prcG);
        sb.append(", prcGt=").append(prcGt);
        sb.append(", prcHr=").append(prcHr);
        sb.append(", prcI=").append(prcI);
        sb.append(", prcIt=").append(prcIt);
        sb.append(", prcIr=").append(prcIr);
        sb.append(", prcJ=").append(prcJ);
        sb.append(", prcJt=").append(prcJt);
        sb.append(", prcJr=").append(prcJr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}