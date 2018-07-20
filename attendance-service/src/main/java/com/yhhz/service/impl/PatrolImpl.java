package com.yhhz.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhhz.mapper.PatrolMapper;
import com.yhhz.pojo.Line;
import com.yhhz.pojo.Patrol;

import com.yhhz.service.PatrolSv;
import com.yhhz.util.IdUtil;
import com.yhhz.util.Page;

@Service
public class PatrolImpl  implements PatrolSv{

	@Autowired
	private PatrolMapper patrolDao;
	
	
	public Integer addPatrol(Patrol patrol) {

		  Date date = new Date();//获得系统时间.
	      SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
	        String nowTime = sdf.format(date);
	        patrol.setPatDate(nowTime);
		return patrolDao.insertSelective(patrol);
	}

	public Integer updatePatrol(Patrol patrol) {
		  Date date = new Date();//获得系统时间.
	      SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
	        String nowTime = sdf.format(date);
	         long uid=patrol.getUserId();
	         Patrol patrols=patrolDao.selectByUserId(uid);
	        patrols.setPatDate(nowTime);
		return patrolDao.updateByPrimaryKey(patrols);
	}

	public Integer deletePatrol(Integer patrolid) {
		// TODO Auto-generated method stub
		return patrolDao.deleteByPrimaryKey(patrolid);
	}


	
	//根据姓名来查询
	@Override
	public List<Patrol> selectPatrolByName(String name) {
		// TODO Auto-generated method stub
		List<Patrol> patrolList=patrolDao.selectByName(name);
		return patrolList;
	}


	/*根据日期查询*/
	@Override
	public int selectCountByCondition(String startDate, String endDate) {
		int i=patrolDao.selectCountByCondition(startDate, endDate);
		return i;
	}

	/*分页查询*/
	@Override
	public List<Patrol> selectPatrolByCondition(String startDate, String endDate, Page page) {
		List<Patrol> list=patrolDao.selectLineByCondition(startDate, endDate,page.getStartRow(),page.getEndRow());
		return list;
	}

	@Override
	public Patrol selectPatrolByuserId(long uid) {

		Patrol patrol=patrolDao.selectByUserId(uid);
		return patrol;
	}



}
