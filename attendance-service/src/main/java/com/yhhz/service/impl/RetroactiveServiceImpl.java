package com.yhhz.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhhz.mapper.UserRetroactiveMapper;

import com.yhhz.pojo.UserRetroactive;
import com.yhhz.service.RetroactiveSv;
import com.yhhz.util.IdUtil;
import com.yhhz.util.Page;

/*** <p>Title:RetroactiveServiceImpl </p>
* <p>Description: </p>
* <p>Company:悦航合展 </p> 
* @author:Alan
* @date:2018年4月26日
 */
@Service
@Transactional
public class RetroactiveServiceImpl implements RetroactiveSv{

	/*补签操作*/
	
	@Autowired
	private UserRetroactiveMapper retroactiveDao;
	
	public Integer addUserretroactive(UserRetroactive retroactive) {

		return retroactiveDao.insertSelective(retroactive);
	}

	//修改补签
	public Integer updateUserretroactive(UserRetroactive retroactive) {
		
		return retroactiveDao.updateByPrimaryKeySelective(retroactive);
	}

	/*删除补签*/
	public Integer deleteUserretroactive(Integer retroactiveId) {
		
		return retroactiveDao.deleteByPrimaryKey(retroactiveId);
	}

	
	//根据姓名来查询补签信息
	@Override
	public List<UserRetroactive> selectRetroactiveByName(String name) {
		 List<UserRetroactive> retroactiveList=retroactiveDao.selectByName(name);
		return retroactiveList;
	}


	/*根据日期查询总数*/
	@Override
	public int selectCountByCondition(String startDate, String endDate) {
		// TODO Auto-generated method stub
		int i=retroactiveDao.selectCountByCondition(startDate,endDate);
		return i;
	}

	/*分页查询*/
	@Override
	public List<UserRetroactive> selectUserretroactiveByCondition(String startDate, String endDate, Page page) {
		List<UserRetroactive> list=retroactiveDao.selectRetroactiveByCondition(startDate,endDate,page.getStartRow(),page.getEndRow());
		return list;
	}

	/*个人分页查询总数*/
	@Override
	public int selectMyCountByCondition(String startDate, String endDate, long uid) {
		int i=retroactiveDao.selectMyCountByCondition(startDate,endDate,uid);
		return i;
	}

	/*个人分页查询*/
	@Override
	public List<UserRetroactive> selectMyUserretroactiveByCondition(String startDate, String endDate, long uid,
			Page page) {
		List<UserRetroactive> list=retroactiveDao.selectMyRetroactiveByCondition(startDate,endDate,uid,page.getStartRow(),page.getEndRow());
		return list;
	}

	
	

	

}
