package com.yhhz.pojo;

import java.util.Date;

public class CmsRole {
    private Long rId;

    private String rName;

    private String rAuthor;

    private String rDescribe;

    private Date rCreatedate;

    private Date rModifydate;

    private Integer rIsdelete;

    private Long rVersions;

    public Long getrId() {
        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public String getrAuthor() {
        return rAuthor;
    }

    public void setrAuthor(String rAuthor) {
        this.rAuthor = rAuthor == null ? null : rAuthor.trim();
    }

    public String getrDescribe() {
        return rDescribe;
    }

    public void setrDescribe(String rDescribe) {
        this.rDescribe = rDescribe == null ? null : rDescribe.trim();
    }

    public Date getrCreatedate() {
        return rCreatedate;
    }

    public void setrCreatedate(Date rCreatedate) {
        this.rCreatedate = rCreatedate;
    }

    public Date getrModifydate() {
        return rModifydate;
    }

    public void setrModifydate(Date rModifydate) {
        this.rModifydate = rModifydate;
    }

    public Integer getrIsdelete() {
        return rIsdelete;
    }

    public void setrIsdelete(Integer rIsdelete) {
        this.rIsdelete = rIsdelete;
    }

    public Long getrVersions() {
        return rVersions;
    }

    public void setrVersions(Long rVersions) {
        this.rVersions = rVersions;
    }
}