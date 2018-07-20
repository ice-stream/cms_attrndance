package com.yhhz.vo;

import org.springframework.format.annotation.DateTimeFormat;


public class AttendanceVar {
	
	private Integer attendanceVarId;
	
     private String userName;
	
    private Long userId;
    private String attendancedate;
	
	private String askforStartDate;
	
	private String askforEndDate;
	
	private String overTimeStartDate;
	
	private String overTimeEndDate;
	
	private String travelStartDate;	
	private String travelEndDate;
	
	private String siginTime;
	
	private String siginBackTime;

    private Integer isLate;

    private Integer isLeaveEarly;

    private Integer isVacation;



	public Integer getAttendanceVarId() {
		return attendanceVarId;
	}

	public void setAttendanceVarId(Integer attendanceVarId) {
		this.attendanceVarId = attendanceVarId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAttendancedate() {
		return attendancedate;
	}

	public void setAttendancedate(String attendancedate) {
		this.attendancedate = attendancedate;
	}

	public String getAskforStartDate() {
		return askforStartDate;
	}

	public void setAskforStartDate(String askforStartDate) {
		this.askforStartDate = askforStartDate;
	}

	public String getAskforEndDate() {
		return askforEndDate;
	}

	public void setAskforEndDate(String askforEndDate) {
		this.askforEndDate = askforEndDate;
	}

	public String getOverTimeStartDate() {
		return overTimeStartDate;
	}

	public void setOverTimeStartDate(String overTimeStartDate) {
		this.overTimeStartDate = overTimeStartDate;
	}

	public String getOverTimeEndDate() {
		return overTimeEndDate;
	}

	public void setOverTimeEndDate(String overTimeEndDate) {
		this.overTimeEndDate = overTimeEndDate;
	}

	public String getTravelEndDate() {
		return travelEndDate;
	}
	

	public void setTravelEndDate(String travelEndDate) {
		this.travelEndDate = travelEndDate;
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

	public String getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(String travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	@Override
	public String toString() {
		return "AttendanceVar [attendanceVarId=" + attendanceVarId + ", userName=" + userName + ", userId=" + userId
				+ ", attendancedate=" + attendancedate + ", askforStartDate=" + askforStartDate + ", askforEndDate="
				+ askforEndDate + ", overTimeStartDate=" + overTimeStartDate + ", overTimeEndDate=" + overTimeEndDate
				+ ", travelStartDate=" + travelStartDate + ", travelEndDate=" + travelEndDate + ", siginTime="
				+ siginTime + ", siginBackTime=" + siginBackTime + ", isLate=" + isLate + ", isLeaveEarly="
				+ isLeaveEarly + ", isVacation=" + isVacation + "]";
	}

	

    
	
    
	

}
