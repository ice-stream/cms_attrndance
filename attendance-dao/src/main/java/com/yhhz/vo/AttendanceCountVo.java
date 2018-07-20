package com.yhhz.vo;

/*** <p>Title:AttendanceCount </p>
* <p>Description: </p>
* <p>Company:悦航合展 </p> 
* @author:Alan
* @date:2018年5月5日
 */
public class AttendanceCountVo {
	
	   private Integer attendanceCountId;

	   
	   
	   
	   private  String userName;
	   
	

	/*请假时间*/
	   private Integer askforLeaveCount;
	   
	   
	  /*加班时间*/
	   private Integer overTimeCount;
	
	   /*出差时间*/
	   private Integer travelCount;
	   
	   /*出勤时间*/
	   private Integer attendanceCount;
	   
	   /*迟到时间*/
	   private Integer lateCount;
	   
	  /*是否早退*/
	   private Integer leaveEarlyCount;
	
	   /*是否假期*/
	   private Integer vacationCount;
	   
	   
	   public Integer getLateCount() {
		return lateCount;
	}

	public void setLateCount(Integer lateCount) {
		this.lateCount = lateCount;
	}

	public Integer getLeaveEarlyCount() {
		return leaveEarlyCount;
	}

	public void setLeaveEarlyCount(Integer leaveEarlyCount) {
		this.leaveEarlyCount = leaveEarlyCount;
	}

	public Integer getVacationCount() {
		return vacationCount;
	}

	public void setVacationCount(Integer vacationCount) {
		this.vacationCount = vacationCount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	   
	   
	   

	public Integer getAttendanceCountId() {
		return attendanceCountId;
	}

	public void setAttendanceCountId(Integer attendanceCountId) {
		this.attendanceCountId = attendanceCountId;
	}

	public Integer getAskforLeaveCount() {
		return askforLeaveCount;
	}

	public void setAskforLeaveCount(Integer askforLeaveCount) {
		this.askforLeaveCount = askforLeaveCount;
	}

	public Integer getOverTimeCount() {
		return overTimeCount;
	}

	public void setOverTimeCount(Integer overTimeCount) {
		this.overTimeCount = overTimeCount;
	}

	public Integer getTravelCount() {
		return travelCount;
	}

	public void setTravelCount(Integer travelCount) {
		this.travelCount = travelCount;
	}

	public Integer getAttendanceCount() {
		return attendanceCount;
	}

	public void setAttendanceCount(Integer attendanceCount) {
		this.attendanceCount = attendanceCount;
	}

	@Override
	public String toString() {
		return "AttendanceCountVo [attendanceCountId=" + attendanceCountId + ", userName=" + userName
				+ ", askforLeaveCount=" + askforLeaveCount + ", overTimeCount=" + overTimeCount + ", travelCount="
				+ travelCount + ", attendanceCount=" + attendanceCount + ", lateCount=" + lateCount
				+ ", leaveEarlyCount=" + leaveEarlyCount + ", vacationCount=" + vacationCount + "]";
	}
	   
	   
	   
	   
	   
	   
	   
}
