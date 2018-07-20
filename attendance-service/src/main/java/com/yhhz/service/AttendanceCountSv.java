package com.yhhz.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yhhz.vo.AttendanceCountVo;
import com.yhhz.vo.AttendanceInfo;
import com.yhhz.vo.AttendanceVar;


public interface AttendanceCountSv {
	 /**根据姓名查询统计的时间**/
	List<AttendanceCountVo> selectAttendanceCount(String startDate, String endDate, long uid);
	
	
	List<AttendanceInfo> slectAttendanceInfo(String name);
	
	List<AttendanceVar> slectAttendanceVar( String startDate, String endDate, long uid);

	
}
