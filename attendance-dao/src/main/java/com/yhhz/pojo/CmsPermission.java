package com.yhhz.pojo;

import java.util.Date;

public class CmsPermission {
    private Long pId;

    private String percode;

    private String pName;

    private Date pCreatedate;

    private Date pModifydate;

    private String url;

    private Integer pIsdelete;

    private Integer pParentid;

    private Long pVersions;

    private String pAuthor;

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public String getPercode() {
        return percode;
    }

    public void setPercode(String percode) {
        this.percode = percode == null ? null : percode.trim();
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public Date getpCreatedate() {
        return pCreatedate;
    }

    public void setpCreatedate(Date pCreatedate) {
        this.pCreatedate = pCreatedate;
    }

    public Date getpModifydate() {
        return pModifydate;
    }

    public void setpModifydate(Date pModifydate) {
        this.pModifydate = pModifydate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getpIsdelete() {
        return pIsdelete;
    }

    public void setpIsdelete(Integer pIsdelete) {
        this.pIsdelete = pIsdelete;
    }

    public Integer getpParentid() {
        return pParentid;
    }

    public void setpParentid(Integer pParentid) {
        this.pParentid = pParentid;
    }

    public Long getpVersions() {
        return pVersions;
    }

    public void setpVersions(Long pVersions) {
        this.pVersions = pVersions;
    }

    public String getpAuthor() {
        return pAuthor;
    }

    public void setpAuthor(String pAuthor) {
        this.pAuthor = pAuthor == null ? null : pAuthor.trim();
    }
}