package com.yhhz.vo;

public class AttendanceInfo {
	
	private Integer AttendanceInfoId;

	  private  String userName;
	   
	
	
	
	   public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/*迟到时间*/
	   private Integer isLate;
	   
	  /*是否早退*/
	   private Integer isLeaveEarly;
	
	   /*是否假期*/
	   private Integer isVacation;

	public Integer getAttendanceInfoId() {
		return AttendanceInfoId;
	}

	public void setAttendanceInfoId(Integer attendanceInfoId) {
		AttendanceInfoId = attendanceInfoId;
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

	

	
	
	

}
