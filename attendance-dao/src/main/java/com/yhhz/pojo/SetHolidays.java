package com.yhhz.pojo;

import org.springframework.format.annotation.DateTimeFormat;

public class SetHolidays {
    private Integer holidaysId;

    private String holidayName;

    private String startDate;

    private String endDate;

    private Integer userPositionId;

    private String remark;

    public Integer getHolidaysId() {
        return holidaysId;
    }

    public void setHolidaysId(Integer holidaysId) {
        this.holidaysId = holidaysId;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName == null ? null : holidayName.trim();
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

    public Integer getUserPositionId() {
        return userPositionId;
    }

    public void setUserPositionId(Integer userPositionId) {
        this.userPositionId = userPositionId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}