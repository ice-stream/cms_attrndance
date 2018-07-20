package com.yhhz.service;

import java.util.List;

import com.yhhz.pojo.Askforleave;
import com.yhhz.pojo.Travel;
import com.yhhz.util.Page;

public interface TravelSv {

	       //申请出差
			Integer addTravel(Travel travel);
			
			//更改出差
			Integer updateTravel(Travel travel);
			
			//删除出差
			Integer deleteTravel(Integer travelId);	
			
		 
			/*根据姓名*/
			List<Travel> selectTravelByName(String name);

			//根据条件获取总记录数
			int selectCountByCondition(String startDate, String endDate);

			//根据条件添加查申请条
			List<Travel> selectTravelByCondition(String startDate, String endDate, Page page);

			/*分页总数*/
			int selectCountMyTravel(String startDate, String endDate, long uid);

			/*分页查询*/
			List<Travel> selectMyTravelByCondition(String startDate, String endDate, long uid, Page page);

	
	
	
	
	
}
