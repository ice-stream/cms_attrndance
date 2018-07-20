package com.yhhz.service;

import java.util.List;

import com.yhhz.pojo.Askforleave;
import com.yhhz.pojo.CmsUser;
import com.yhhz.pojo.UserAttendance;
import com.yhhz.util.Page;

public interface AttendanceSv {

	  //添加考勤日志信息
		Integer addAttendance(UserAttendance attendance);
		
		//更新申请条信息
		Integer updateAttendance(UserAttendance attendance);
		
		//删除申请条信息
		Integer deleteAttendance(Integer attendanceid);	
		
		
		UserAttendance selectAttendanceByUserId(long uid);
		
		
		//根据姓名来查询
		List<UserAttendance> selectAttendanceByName(String name);

		/*查询考勤日志信息总数*/
		int selectCountByCondition(String startDate, String endDate, String name);

		/*分页查询考勤日志*/
		List<UserAttendance> selectAttendanceByCondition(String startDate, String endDate, String name, Page page);
		
	
		  /**根据用户名密码查找用户 **/
		  CmsUser selectUserByUserName(String username,String password);

		  /*查询总数*/
		int selectCountAttendance(String startDate, String endDate, long uid);

		/*根据id查询*/
		List<UserAttendance> selectAttendanceById(String startDate, String endDate, long uid, Page page);
	
		
		
	
	
}
