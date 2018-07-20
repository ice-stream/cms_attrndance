package com.yhhz.service;

import java.util.List;

import com.yhhz.pojo.Patrol;
import com.yhhz.util.Page;

public interface PatrolSv {

	    //添加申请条信息
		Integer addPatrol(Patrol patrol);
		
		//更新申请条信息
		Integer updatePatrol(Patrol patrol);
		
		//删除申请条信息
		Integer deletePatrol(Integer patrolid);	
		

		//根据姓名来查询
		List<Patrol> selectPatrolByName(String name);

		
		int selectCountByCondition(String startDate, String endDate);

		List<Patrol> selectPatrolByCondition(String startDate, String endDate, Page page);
		
		Patrol  selectPatrolByuserId(long uid);

	
	
	
}
