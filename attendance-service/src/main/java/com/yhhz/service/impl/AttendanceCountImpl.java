package com.yhhz.service.impl;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhhz.mapper.AttendanceCount;
import com.yhhz.service.AttendanceCountSv;
import com.yhhz.vo.AttendanceCountVo;
import com.yhhz.vo.AttendanceInfo;
import com.yhhz.vo.AttendanceVar;


/*** <p>Title:AttendanceCountImpl </p>
* <p>Description: </p>
* <p>Company:悦航合展 </p> 
* @author:Alan
* @date:2018年4月25日
 */

@Service
@Transactional
public class AttendanceCountImpl  implements AttendanceCountSv{

	@Autowired					
	AttendanceCount AttendanceCountDao;	
	//统计
	/*请假出差统计*/

	@Override
	public List<AttendanceCountVo> selectAttendanceCount(String startDate, String endDate, long uid) {

		List<AttendanceCountVo> list=AttendanceCountDao.selectAttendanceCount(startDate,  endDate, uid);
		
		return list;
	}

	@Override
	public List<AttendanceInfo> slectAttendanceInfo(String name) {
		   List<AttendanceInfo> list=AttendanceCountDao.slectAttendanceInfo(name);
		return list;
	}

	/*查询所有的字段*/
	@Override
	public List<AttendanceVar> slectAttendanceVar(String startDate, String endDate, long uid) {
		// TODO Auto-generated method stub
		
		 List<AttendanceVar> list=AttendanceCountDao.slectAttendanceVar(startDate, endDate, uid);
		 DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
		 for(AttendanceVar attendanceVar:list) {
			Date askforEndDate;
			Date  askforStartDate;
			Date overTimeStartDate;
			Date  overTimeEndDate;
			
			Date travelStartDate;
			Date travelEndDate;
			Date siginTime;
			Date siginBackTime;
			
			try {
				askforEndDate = format.parse(attendanceVar.getAskforEndDate());
				askforStartDate =format.parse(attendanceVar.getAskforStartDate());
				int askforLeaveCount=(int) ((askforEndDate.getTime()-askforStartDate.getTime())/(24*60*60*1000));
				
				overTimeEndDate = format.parse(attendanceVar.getOverTimeEndDate());
				overTimeStartDate =format.parse(attendanceVar.getOverTimeStartDate());
				int overTimeCount=(int) ((overTimeStartDate.getTime()-overTimeEndDate.getTime())/(24*60*60*1000));
				
				travelEndDate = format.parse(attendanceVar.getTravelEndDate());
				travelStartDate =format.parse(attendanceVar.getTravelStartDate());
				int travelCount=(int) ((travelEndDate .getTime()-travelStartDate.getTime())/(24*60*60*1000));
				
				siginBackTime = format.parse(attendanceVar.getSiginBackTime());
				siginTime =format.parse(attendanceVar.getSiginTime());
				int attendanceCount=(int) ((siginBackTime.getTime()-siginTime.getTime())/(24*60*60*1000));
				
				
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			 
		 }
		 
		return list;
	}
	
}
