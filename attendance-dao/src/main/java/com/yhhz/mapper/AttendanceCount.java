package com.yhhz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yhhz.vo.AttendanceCountVo;
import com.yhhz.vo.AttendanceInfo;
import com.yhhz.vo.AttendanceVar;





public interface AttendanceCount {

	 /**根据查询统计的时间信息**/
	List<AttendanceCountVo> selectAttendanceCount(@Param("startDate") String startDate,@Param("endDate") String endDate,@Param("uid") long uid);
	
	
	List<AttendanceInfo> slectAttendanceInfo(@Param("name") String name);
	
	
	List<AttendanceVar> slectAttendanceVar(@Param("startDate") String startDate,@Param("endDate") String endDate,@Param("uid") long uid);
	

}
