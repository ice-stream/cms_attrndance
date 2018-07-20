package com.yhhz.service;

import java.util.List;

import com.yhhz.pojo.Line;
import com.yhhz.util.Page;

public interface LineSv {

	
	

	   //添加申请条信息
		Integer addLine(Line line);
		
		//更新申请条信息
		Integer updateLine(Line line);
		
		//删除申请条信息
		Integer deleteLine(Integer lineid);	
		
		//根据条件添加查申请条
		List<Line> selectLineByCondition(String startDate,String endDate,Page page);


		//根据姓名查询路线
		 List<Line> selectLineByName(String name);

		int selectCountByCondition(String startDate, String endDate); 
		
	
	
	
	
	
}
