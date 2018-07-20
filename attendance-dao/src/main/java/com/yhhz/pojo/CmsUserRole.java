package com.yhhz.pojo;

import java.util.Date;

public class CmsUserRole {
    private Long urId;

    private Long rId;

    private Long uId;

    private String urAuthor;

    private Integer urIsdelete;

    private Date urCreatedate;

    private Date urModifydate;

    private Long urVersions;

    public Long getUrId() {
        return urId;
    }

    public void setUrId(Long urId) {
        this.urId = urId;
    }

    public Long getrId() {
        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getUrAuthor() {
        return urAuthor;
    }

    public void setUrAuthor(String urAuthor) {
        this.urAuthor = urAuthor == null ? null : urAuthor.trim();
    }

    public Integer getUrIsdelete() {
        return urIsdelete;
    }

    public void setUrIsdelete(Integer urIsdelete) {
        this.urIsdelete = urIsdelete;
    }

    public Date getUrCreatedate() {
        return urCreatedate;
    }

    public void setUrCreatedate(Date urCreatedate) {
        this.urCreatedate = urCreatedate;
    }

    public Date getUrModifydate() {
        return urModifydate;
    }

    public void setUrModifydate(Date urModifydate) {
        this.urModifydate = urModifydate;
    }

    public Long getUrVersions() {
        return urVersions;
    }

    public void setUrVersions(Long urVersions) {
        this.urVersions = urVersions;
    }
}