package com.yhhz.pojo;

import java.util.Date;

public class CmsUser {
    private Long uid;

    private String uName;

    private String uUsername;

    private String uPassword;

    private Long uPhone;

    private String uIdcord;

    private String uSex;

    private Long uAge;

    private String uEmail;

    private Date uCreatedate;

    private Date uModifydate;

    private Integer uState;

    private Long uVersions;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public Long getuPhone() {
        return uPhone;
    }

    public void setuPhone(Long uPhone) {
        this.uPhone = uPhone;
    }

    public String getuIdcord() {
        return uIdcord;
    }

    public void setuIdcord(String uIdcord) {
        this.uIdcord = uIdcord == null ? null : uIdcord.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public Long getuAge() {
        return uAge;
    }

    public void setuAge(Long uAge) {
        this.uAge = uAge;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public Date getuCreatedate() {
        return uCreatedate;
    }

    public void setuCreatedate(Date uCreatedate) {
        this.uCreatedate = uCreatedate;
    }

    public Date getuModifydate() {
        return uModifydate;
    }

    public void setuModifydate(Date uModifydate) {
        this.uModifydate = uModifydate;
    }

    public Integer getuState() {
        return uState;
    }

    public void setuState(Integer uState) {
        this.uState = uState;
    }

    public Long getuVersions() {
        return uVersions;
    }

    public void setuVersions(Long uVersions) {
        this.uVersions = uVersions;
    }
}