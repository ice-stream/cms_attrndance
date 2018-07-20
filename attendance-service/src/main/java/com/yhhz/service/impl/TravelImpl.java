package com.yhhz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhhz.mapper.TravelMapper;
import com.yhhz.pojo.Askforleave;
import com.yhhz.pojo.Travel;
import com.yhhz.service.TravelSv;
import com.yhhz.util.Page;

/*** <p>Title:TravelImpl </p>
* <p>Description: </p>
* <p>Company:悦航合展 </p> 
* @author:Alan
* @date:2018年5月4日
 */
@Service
public class TravelImpl implements TravelSv{

	
	@Autowired
	private TravelMapper travelDao;
	
	
     /*出差申请*/
	@Override
	public Integer addTravel(Travel travel) {
		
		return travelDao.insertSelective(travel);
	}

   /*更改出差	*/
	@Override
	public Integer updateTravel(Travel travel) {
		
		return travelDao.updateByPrimaryKeySelective(travel); 
	}

   /*删除出差*/
	@Override
	public Integer deleteTravel(Integer travelId) {
		
		return travelDao.deleteByPrimaryKey(travelId);
	}

   /*根据姓名查询*/
	@Override
	public List<Travel> selectTravelByName(String name) {
		
		return travelDao.selectTravelByName(name);
	}

	
   //查询总数	
	@Override
	public int selectCountByCondition(String startDate, String endDate) {
		int i=travelDao.selectCountByCondition(startDate,endDate);
		return 0;
	}

	//分页查询
	@Override
	public List<Travel> selectTravelByCondition(String startDate, String endDate, Page page) {
		
		List<Travel> list=travelDao.selectTravelByCondition(startDate,endDate,page.getStartRow(),page.getEndRow());
		return list;
	}

	
	/*查询总数*/
	@Override
	public int selectCountMyTravel(String startDate, String endDate, long uid) {
		// TODO Auto-generated method stub
		int i=travelDao.selectCountMyTravel(startDate, endDate,uid);
		return i;
	}

	@Override
	public List<Travel> selectMyTravelByCondition(String startDate, String endDate, long uid, Page page) {
		List<Travel> list=travelDao.selectMyTravelByCondition(startDate,endDate,uid,page.getStartRow(),page.getEndRow());
		return list;
	}

}
