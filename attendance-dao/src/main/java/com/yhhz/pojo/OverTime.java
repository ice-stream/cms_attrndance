package com.yhhz.pojo;

import org.springframework.format.annotation.DateTimeFormat;

public class OverTime {
    private Integer overtimeId;

    private String userName;

    private String startDate;

    private String endDate;

    private Long operationUserId;

    private String operatingTime;

    private String checkTime;

    private String remark;

    private Integer checkType;

    private String writeBack;

    private Byte workNo;

    public Integer getOvertimeId() {
        return overtimeId;
    }

    public void setOvertimeId(Integer overtimeId) {
        this.overtimeId = overtimeId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Long getOperationUserId() {
        return operationUserId;
    }

    public void setOperationUserId(Long operationUserId) {
        this.operationUserId = operationUserId;
    }

    public String getOperatingTime() {
        return operatingTime;
    }

    public void setOperatingTime(String operatingTime) {
        this.operatingTime = operatingTime;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCheckType() {
        return checkType;
    }

    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }

    public String getWriteBack() {
        return writeBack;
    }

    public void setWriteBack(String writeBack) {
        this.writeBack = writeBack == null ? null : writeBack.trim();
    }

    public Byte getWorkNo() {
        return workNo;
    }

    public void setWorkNo(Byte workNo) {
        this.workNo = workNo;
    }

	@Override
	public String toString() {
		return "OverTime [overtimeId=" + overtimeId + ", userName=" + userName + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", operationUserId=" + operationUserId + ", operatingTime=" + operatingTime
				+ ", checkTime=" + checkTime + ", remark=" + remark + ", checkType=" + checkType + ", writeBack="
				+ writeBack + ", workNo=" + workNo + "]";
	}
}