package com.yhhz.service;

import java.util.List;

import com.yhhz.pojo.UserRetroactive;

import com.yhhz.util.Page;

public interface RetroactiveSv {

	

	//添加申请条信息
	Integer addUserretroactive(UserRetroactive retroactive);
	
	//更新申请条信息
	Integer updateUserretroactive(UserRetroactive retroactive);
	
	//删除申请条信息
	Integer deleteUserretroactive(Integer retroactiveId);	
	
	//根据姓名查询
	List<UserRetroactive> selectRetroactiveByName(String name);

   
	/*根据条件获取总记录数*/
	int selectCountByCondition(String startDate, String endDate);
   
	/*分页查询*/
	List<UserRetroactive> selectUserretroactiveByCondition(String startDate, String endDate, Page page);

	/*个人分页查询总数*/
	int selectMyCountByCondition(String startDate, String endDate, long uid);

	/*个人分页查询*/
	List<UserRetroactive> selectMyUserretroactiveByCondition(String startDate, String endDate, long uid, Page page);
	
	
	
	
}
