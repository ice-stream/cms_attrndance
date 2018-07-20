package com.yhhz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhhz.mapper.LineMapper;
import com.yhhz.pojo.Line;

import com.yhhz.service.LineSv;
import com.yhhz.util.IdUtil;
import com.yhhz.util.Page;

/*** <p>Title:LineImpl </p>
* <p>Description: </p>
* <p>Company:悦航合展 </p> 
* @author:Alan
* @date:2018年5月4日
 */
@Service
public class LineImpl implements LineSv{

	@Autowired
	private LineMapper lineDao;
	
	
	public Integer addLine(Line line) {
		// TODO Auto-generated method stub

//		IdUtil idUtil=new  IdUtil();
//		Integer lineid=idUtil.genItemId();
//		line.setLineId(lineid);
	 	
		return lineDao.insertSelective(line);
	}

	public Integer updateLine(Line line) {
		// TODO Auto-generated method stub
		return lineDao.updateByPrimaryKeySelective(line);
		
	}

	public Integer deleteLine(Integer lineid) {
		// TODO Auto-generated method stub
		return lineDao.deleteByPrimaryKey(lineid);
	}

	
	//根据姓名来查询路线
	@Override
	public List<Line> selectLineByName(String name) {
		// TODO Auto-generated method stub
	
		List<Line> lineList=lineDao.selectByName(name);
		return lineList;
	}

	
	/*分页查询*/
	@Override
	public List<Line> selectLineByCondition(String startDate, String endDate, Page page) {
		// TODO Auto-generated method stub
		
		List<Line> list=lineDao.selectLineByCondition(startDate, endDate,page.getStartRow(),page.getEndRow());
		return list;
	}

	@Override
	public int selectCountByCondition(String startDate, String endDate) {
		// TODO Auto-generated method stub
		int i=lineDao.selectCountByCondition(startDate, endDate);
		return i;
	}

	
	

}
