package com.yhhz.pojo;

import org.springframework.format.annotation.DateTimeFormat;

public class Patrol {
    private Integer patrolId;

    private Long userId;

    private String userName;

    private String patDate;

    private String addnessInfo;

    public Integer getPatrolId() {
        return patrolId;
    }

    public void setPatrolId(Integer patrolId) {
        this.patrolId = patrolId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPatDate() {
        return patDate;
    }

    public void setPatDate(String patDate) {
        this.patDate = patDate;
    }

    public String getAddnessInfo() {
        return addnessInfo;
    }

    public void setAddnessInfo(String addnessInfo) {
        this.addnessInfo = addnessInfo == null ? null : addnessInfo.trim();
    }
}