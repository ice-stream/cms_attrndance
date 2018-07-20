package com.yhhz.service;

import java.util.List;

import com.yhhz.pojo.ClassPeriod;
import com.yhhz.util.Page;




public interface ClassPeriodSv {
	
	
	
	
	//添加申请条信息
			Integer addClassperiod(ClassPeriod classPeriod);
			
			//更新申请条信息
			Integer updateClassperiod(ClassPeriod classPeriod);
			
			//删除申请条信息
			Integer deleteClassperiod(Integer classPeriodid);	
			
			//根据条件添加查申请条
			List<ClassPeriod> selectClassperiodByCondition(String name);

			/*查询总数*/
			int selectCountMyClass(String startDate, String endDate, long uid);

			/*分页查询*/
			List<ClassPeriod> selectMyClassByCondition(String startDate, String endDate, long uid, Page page);

			/*日期查询总数*/
			int selectCountClass(String startDate, String endDate);

			/*分页查询*/
			List<ClassPeriod> selectClassByDate(String startDate, String endDate, Page page);
			
			
			
	
	
	

}
