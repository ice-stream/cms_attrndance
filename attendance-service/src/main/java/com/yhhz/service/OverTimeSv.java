package com.yhhz.service;

import java.util.List;

import com.yhhz.pojo.OverTime;
import com.yhhz.util.Page;

public interface OverTimeSv {

	   //申请加班
		Integer addOverTime(OverTime overTime);
		
		//更改加班
		Integer updateOverTime(OverTime overTime);
		
		//删除加班
		Integer deleteOverTime(Integer overtimeId);	
		
	 
		/*根据姓名*/
		List<OverTime> selectOverTimeByName(String name);

		//根据条件获取总记录数
		int selectCountByCondition(String startDate, String endDate);

		//根据条件添加查申请条
		List<OverTime> selectOverTimeByCondition(String startDate, String endDate, Page page);

		//个人分页查询总数
		int selectCountOverTime(String startDate, String endDate, long uid);
    
		/*个人分页查询*/
		List<OverTime> selectMyOverTimeByCondition(String startDate, String endDate,  long uid,Page page);

	
	
	
}
