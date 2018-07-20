package com.yhhz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhhz.mapper.ClassPeriodMapper;
import com.yhhz.mapper.CmsUserMapper;
import com.yhhz.pojo.Askforleave;
import com.yhhz.pojo.ClassPeriod;
import com.yhhz.pojo.CmsUser;
import com.yhhz.service.ClassPeriodSv;
import com.yhhz.util.IdUtil;
import com.yhhz.util.Page;

@Service
public class ClassPeriodImpl implements ClassPeriodSv {

	
	@Autowired
	private ClassPeriodMapper classPeriodDao;
	@Autowired
	private CmsUserMapper userDao;
	
	public Integer addClassperiod(ClassPeriod classPeriod) {
		// TODO Auto-generated method stub
		String userName=classPeriod.getUserName();
		CmsUser user=userDao.selectUserByName(userName);
		long uid=user.getUid();
		classPeriod.setUserId(uid);
		return classPeriodDao.insertSelective(classPeriod);
	}

	public Integer updateClassperiod(ClassPeriod classPeriod) {
		// TODO Auto-generated method stub
		return classPeriodDao.updateByPrimaryKeySelective(classPeriod);
	}

	public Integer deleteClassperiod(Integer classPeriodid) {
		// TODO Auto-generated method stub
		return classPeriodDao.deleteByPrimaryKey(classPeriodid);
	}

	public List<ClassPeriod> selectClassperiodByCondition(String name) {
		List<ClassPeriod> classperiodList =classPeriodDao.selectByName(name);
		return classperiodList;
		
	}

	/*根据id查询总数*/
	@Override
	public int selectCountMyClass(String startDate, String endDate, long uid) {
		int i=classPeriodDao.selectCountByUid(startDate, endDate,uid);
		return i;
		
	}

	@Override
	public List<ClassPeriod> selectMyClassByCondition(String startDate, String endDate, long uid, Page page) {
		List<ClassPeriod> classperiodList =classPeriodDao.selectMyClassByCondition(startDate,endDate,uid,page.getStartRow(),page.getEndRow());
		return classperiodList;
	}

	@Override
	public int selectCountClass(String startDate, String endDate) {
		int i=classPeriodDao.selectCountByDate(startDate, endDate);
		return i;
	}

	@Override
	public List<ClassPeriod> selectClassByDate(String startDate, String endDate, Page page) {
		List<ClassPeriod> classperiodList =classPeriodDao.selectClassByDate(startDate,endDate,page.getStartRow(),page.getEndRow());
		return classperiodList;
	}



}
