package com.yhhz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhhz.mapper.OverTimeMapper;
import com.yhhz.pojo.Askforleave;
import com.yhhz.pojo.OverTime;
import com.yhhz.service.OverTimeSv;
import com.yhhz.util.Page;

/*** <p>Title:OverTimeImpl </p>
* <p>Description: </p>
* <p>Company:悦航合展 </p> 
* @author:Alan
* @date:2018年5月4日
 */
@Service
public class OverTimeImpl implements OverTimeSv{

	
	@Autowired
	private OverTimeMapper overTimeDao;

	
   /*申请加班	  */     
	@Override
	public Integer addOverTime(OverTime overTime) {
		
		return overTimeDao.insertSelective(overTime);
	}
    /*更改加班  */
	@Override
	public Integer updateOverTime(OverTime overTime) {
		
		return overTimeDao.updateByPrimaryKeySelective(overTime) ;
	}

   /*删除加班*/
	@Override
	public Integer deleteOverTime(Integer overtimeId) {
		
		return overTimeDao.deleteByPrimaryKey(overtimeId);
	}

    /*根据姓名查询加班*/
	@Override
	public List<OverTime> selectOverTimeByName(String name) {
		
		List<OverTime> list=overTimeDao.selectOverTimeByName(name);
		return list;
	}

     /*查询总数*/
	@Override
	public int selectCountByCondition(String startDate, String endDate) {
		int i=overTimeDao.selectCountByCondition(startDate, endDate);
		return i;
	}

	/*分页查询*/
	@Override
	public List<OverTime> selectOverTimeByCondition(String startDate, String endDate, Page page) {
		List<OverTime> overTimeList =overTimeDao.selectOverTimeByCondition(startDate,endDate,page.getStartRow(),page.getEndRow());
		return overTimeList;
	}
	
	/*个人分页查询的总数*/
	@Override
	public int selectCountOverTime(String startDate, String endDate, long uid) {
		// TODO Auto-generated method stub
		int i=overTimeDao.selectCountOverTime(startDate, endDate,uid);
		return i;
	}
	/*分页查询*/
	@Override
	public List<OverTime> selectMyOverTimeByCondition(String startDate, String endDate, long uid,Page page) {
		// TODO Auto-generated method stub
		List<OverTime> overTimeList =overTimeDao.selectOverMyTimeByCondition(startDate,endDate,uid,page.getStartRow(),page.getEndRow());
		return overTimeList;
	}
	

}
