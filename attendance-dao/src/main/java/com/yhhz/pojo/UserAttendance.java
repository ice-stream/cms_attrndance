package com.yhhz.pojo;

import org.springframework.format.annotation.DateTimeFormat;

public class UserAttendance {
    private Integer attendanceId;

    private Long userId;

    private String userName;

    private String attendancedate;

    private String siginTime;

    private String siginBackTime;

    private Integer isLate;

    private Integer isLeaveEarly;

    private Integer isVacation;

    private String addnessInfo;

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
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

    public String getAttendancedate() {
        return attendancedate;
    }

    public void setAttendancedate(String attendancedate) {
        this.attendancedate = attendancedate;
    }

    public String getSiginTime() {
        return siginTime;
    }

    public void setSiginTime(String siginTime) {
        this.siginTime = siginTime;
    }

    public String getSiginBackTime() {
        return siginBackTime;
    }

    public void setSiginBackTime(String siginBackTime) {
        this.siginBackTime = siginBackTime;
    }

    public Integer getIsLate() {
        return isLate;
    }

    public void setIsLate(Integer isLate) {
        this.isLate = isLate;
    }

    public Integer getIsLeaveEarly() {
        return isLeaveEarly;
    }

    public void setIsLeaveEarly(Integer isLeaveEarly) {
        this.isLeaveEarly = isLeaveEarly;
    }

    public Integer getIsVacation() {
        return isVacation;
    }

    public void setIsVacation(Integer isVacation) {
        this.isVacation = isVacation;
    }

    public String getAddnessInfo() {
        return addnessInfo;
    }

    public void setAddnessInfo(String addnessInfo) {
        this.addnessInfo = addnessInfo == null ? null : addnessInfo.trim();
    }
}