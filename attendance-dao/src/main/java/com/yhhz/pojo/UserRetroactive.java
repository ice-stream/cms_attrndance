package com.yhhz.pojo;

import org.springframework.format.annotation.DateTimeFormat;

public class UserRetroactive {
    private Integer userRetroactiveId;

    private Integer userClassesChildRecordId;

    private String signInTime;

    private Boolean toAndFrom;

    private String userName;

    private Long operationUserId;

    private Integer signInWayId;

    private String operatingTime;

    private Long checkmanId;

    private String checkTime;

    private Integer checkStateId;

    private String applyForReason;

    private String remark;

    public Integer getUserRetroactiveId() {
        return userRetroactiveId;
    }

    public void setUserRetroactiveId(Integer userRetroactiveId) {
        this.userRetroactiveId = userRetroactiveId;
    }

    public Integer getUserClassesChildRecordId() {
        return userClassesChildRecordId;
    }

    public void setUserClassesChildRecordId(Integer userClassesChildRecordId) {
        this.userClassesChildRecordId = userClassesChildRecordId;
    }

    public String getSignInTime() {
        return signInTime;
    }

    public void setSignInTime(String signInTime) {
        this.signInTime = signInTime;
    }

    public Boolean getToAndFrom() {
        return toAndFrom;
    }

    public void setToAndFrom(Boolean toAndFrom) {
        this.toAndFrom = toAndFrom;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Long getOperationUserId() {
        return operationUserId;
    }

    public void setOperationUserId(Long operationUserId) {
        this.operationUserId = operationUserId;
    }

    public Integer getSignInWayId() {
        return signInWayId;
    }

    public void setSignInWayId(Integer signInWayId) {
        this.signInWayId = signInWayId;
    }

    public String getOperatingTime() {
        return operatingTime;
    }

    public void setOperatingTime(String operatingTime) {
        this.operatingTime = operatingTime;
    }

    public Long getCheckmanId() {
        return checkmanId;
    }

    public void setCheckmanId(Long checkmanId) {
        this.checkmanId = checkmanId;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public Integer getCheckStateId() {
        return checkStateId;
    }

    public void setCheckStateId(Integer checkStateId) {
        this.checkStateId = checkStateId;
    }

    public String getApplyForReason() {
        return applyForReason;
    }

    public void setApplyForReason(String applyForReason) {
        this.applyForReason = applyForReason == null ? null : applyForReason.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}