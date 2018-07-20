package com.yhhz.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.yhhz.mapper.AskforleaveMapper;

import com.yhhz.pojo.Askforleave;
import com.yhhz.service.AskforleaveService;
import com.yhhz.util.IdUtil;
import com.yhhz.util.JedisClient;
import com.yhhz.util.JsonUtils;
import com.yhhz.util.Page;





/*** <p>Title:AskforleaveServiceImpl </p>
* <p>Description: </p>
* <p>Company:悦航合展 </p> 
* @author:Alan
* @date:2018年4月26日
 */
/*请假出差申请*/
@Service
@Transactional
public class AskforleaveServiceImpl  implements AskforleaveService{

	@Autowired
	private AskforleaveMapper askforleaveDao;
	
	@Autowired
	private JedisClient jedisClient;
	
	@Value("${CONTENT_LIST}")
	private String CONTENT_LIST;
	
	
	
	
	/*增添申请假条*/
	public Integer addAskforleave(Askforleave askforleave) {
	
		return askforleaveDao.insertSelective(askforleave);
	}

	/*更改申请*/
	public Integer updateAskforleave(Askforleave askforleave) {
		
		return askforleaveDao.updateByPrimaryKeySelective(askforleave);
	}

	
	/*删除申请*/
	public Integer deleteAskforleave(Integer askForLeaveId) {
		
		return askforleaveDao.deleteByPrimaryKey(askForLeaveId);
	}
 

	//根据姓名查询
	@Override
	public List<Askforleave> selectAskforleaveByNa(String name) {
		

		List<Askforleave> askforleaveList =askforleaveDao.selectByName(name);
		return askforleaveList;
	}


	//根据时间查询
	@Override
	public List<Askforleave> selectAskforleaveByDate(String startDate, String endDate) {
	
		List<Askforleave> askforleaveList =askforleaveDao.selectAskforleaveByDate(startDate, endDate);
		return askforleaveList;
	}

	/*查询分页总数*/
	@Override
	public int selectCountByCondition(String startDate, String endDate) {
		// TODO Auto-generated method stub
		int i=askforleaveDao.selectCountByCondition(startDate, endDate);
		return i;
	}

	/*分页查询*/
	@Override
	public List<Askforleave> selectAskforleaveByCondition(String startDate, String endDate,Page page) {
		List<Askforleave> askforleaveList =askforleaveDao.selectAskforleaveByCondition(startDate,endDate,page.getStartRow(),page.getEndRow());
		return askforleaveList;
	}

	
	
	/*根据自己id查询总数*/
	@Override
	public int selectCountMyAskforleave(String startDate, String endDate, long uid) {
		
		int i=askforleaveDao.selectCountByAskforleave(startDate, endDate,uid);
		return i;
	}

	/*分页查询自己的请假记录*/
	@Override
	public List<Askforleave> selectMyAskforleaveByCondition(String startDate, String endDate,long uid,Page page) {
		// TODO Auto-generated method stub
		
		try {
			//如果缓存中有直接响应结果
			String json = jedisClient.hget(CONTENT_LIST, uid + "");
			if (StringUtils.isNotBlank(json)) {
				List<Askforleave> askforleaveList = JsonUtils.jsonToList(json, Askforleave.class);
				return askforleaveList;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//如果没有查询数据库
		List<Askforleave> askforleaveList =askforleaveDao.selectMyAskforleaveByCondition(startDate,endDate,uid,page.getStartRow(),page.getEndRow());
		//把结果添加到缓存
		try {
			jedisClient.hset(CONTENT_LIST, uid + "", JsonUtils.objectToJson(askforleaveList));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return askforleaveList;
		
		
		/*
		List<Askforleave> askforleaveList =askforleaveDao.selectMyAskforleaveByCondition(startDate,endDate,uid,page.getStartRow(),page.getEndRow());
		return askforleaveList;*/
	}

 

	
	
	
}
