package com.yhhz.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ClassPeriod {
    private Integer classPeriodId;

    private Long userId;

    private String userName;

    private String className;

    private String goToWorkTime;

    private String timeFromWork;

    private String startChargeTime;

    private String endChargeTime;

    private Boolean goToWorkChargeNo;

    private Boolean timeFromWorkChargeNo;

    private Boolean calculateLeftEarlyNo;

    private Boolean calculateAbsenceNo;
    
    private String classDate;

    private Integer positionClassesId;

    private Boolean deleteNo;

    public Integer getClassPeriodId() {
        return classPeriodId;
    }

    public void setClassPeriodId(Integer classPeriodId) {
        this.classPeriodId = classPeriodId;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getGoToWorkTime() {
        return goToWorkTime;
    }

    public void setGoToWorkTime(String goToWorkTime) {
        this.goToWorkTime = goToWorkTime;
    }

    public String getTimeFromWork() {
        return timeFromWork;
    }

    public void setTimeFromWork(String timeFromWork) {
        this.timeFromWork = timeFromWork;
    }

    public String getStartChargeTime() {
        return startChargeTime;
    }

    public void setStartChargeTime(String startChargeTime) {
        this.startChargeTime = startChargeTime;
    }

    public String getEndChargeTime() {
        return endChargeTime;
    }

    public void setEndChargeTime(String endChargeTime) {
        this.endChargeTime = endChargeTime;
    }

    public Boolean getGoToWorkChargeNo() {
        return goToWorkChargeNo;
    }

    public void setGoToWorkChargeNo(Boolean goToWorkChargeNo) {
        this.goToWorkChargeNo = goToWorkChargeNo;
    }

    public Boolean getTimeFromWorkChargeNo() {
        return timeFromWorkChargeNo;
    }

    public void setTimeFromWorkChargeNo(Boolean timeFromWorkChargeNo) {
        this.timeFromWorkChargeNo = timeFromWorkChargeNo;
    }

    public Boolean getCalculateLeftEarlyNo() {
        return calculateLeftEarlyNo;
    }

    public void setCalculateLeftEarlyNo(Boolean calculateLeftEarlyNo) {
        this.calculateLeftEarlyNo = calculateLeftEarlyNo;
    }

    public Boolean getCalculateAbsenceNo() {
        return calculateAbsenceNo;
    }

    public void setCalculateAbsenceNo(Boolean calculateAbsenceNo) {
        this.calculateAbsenceNo = calculateAbsenceNo;
    }

    public Integer getPositionClassesId() {
        return positionClassesId;
    }

    public void setPositionClassesId(Integer positionClassesId) {
        this.positionClassesId = positionClassesId;
    }

    public Boolean getDeleteNo() {
        return deleteNo;
    }

    public void setDeleteNo(Boolean deleteNo) {
        this.deleteNo = deleteNo;
    }
}