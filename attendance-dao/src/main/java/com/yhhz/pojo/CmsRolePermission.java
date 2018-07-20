package com.yhhz.pojo;

import java.util.Date;

public class CmsRolePermission {
    private Long rpId;

    private Long rId;

    private Long pId;

    private String rpAuthor;

    private Date rpCreatedat;

    private Date rpModifydate;

    private Long rpVersios;

    public Long getRpId() {
        return rpId;
    }

    public void setRpId(Long rpId) {
        this.rpId = rpId;
    }

    public Long getrId() {
        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public String getRpAuthor() {
        return rpAuthor;
    }

    public void setRpAuthor(String rpAuthor) {
        this.rpAuthor = rpAuthor == null ? null : rpAuthor.trim();
    }

    public Date getRpCreatedat() {
        return rpCreatedat;
    }

    public void setRpCreatedat(Date rpCreatedat) {
        this.rpCreatedat = rpCreatedat;
    }

    public Date getRpModifydate() {
        return rpModifydate;
    }

    public void setRpModifydate(Date rpModifydate) {
        this.rpModifydate = rpModifydate;
    }

    public Long getRpVersios() {
        return rpVersios;
    }

    public void setRpVersios(Long rpVersios) {
        this.rpVersios = rpVersios;
    }
}