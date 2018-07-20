package com.yhhz.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhhz.mapper.CmsUserMapper;
import com.yhhz.mapper.UserAttendanceMapper;
import com.yhhz.pojo.CmsUser;
import com.yhhz.pojo.UserAttendance;
import com.yhhz.service.AttendanceSv;
import com.yhhz.util.IdUtil;
import com.yhhz.util.Page;

@Service
public class AttendanceImpl implements AttendanceSv{

	@Autowired
	private UserAttendanceMapper attendanceDao;
	
	@Autowired
	private CmsUserMapper userMapper;
	
	public Integer addAttendance(UserAttendance attendance) {
 
		  Date date = new Date();//获得系统时间.
	      SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
	        String nowTime = sdf.format(date);
	        attendance.setAttendancedate(nowTime);
	        attendance.setSiginTime(nowTime);
	       
		return attendanceDao.insertSelective(attendance);
	}

	public Integer updateAttendance(UserAttendance attendance) {
		// TODO Auto-generated method stub
		  Date date = new Date();//获得系统时间.
	      SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
	        String nowTime = sdf.format(date);
	   
	        attendance.setAttendancedate(nowTime);
	        attendance.setSiginBackTime(nowTime);
	        
		return attendanceDao.updateByPrimaryKeySelective(attendance);
	}

	public Integer deleteAttendance(Integer attendanceid) {
		// TODO Auto-generated method stub
		return attendanceDao.deleteByPrimaryKey(attendanceid);
	}

	//根据姓名查询用户考勤日志表
	@Override
	public List<UserAttendance> selectAttendanceByName(String name) {
		// TODO Auto-generated method stub

	    
		List<UserAttendance> attendanceList =attendanceDao.selectByName(name);
		return attendanceList;
		
		
	}

	/*分页查询总数*/
	@Override
	public int selectCountByCondition(String startDate, String endDate, String name) {
		// TODO Auto-generated method stub
		int i=attendanceDao.selectCountByCondition(startDate,endDate,name);
		return i;
	}

	@Override
	public List<UserAttendance> selectAttendanceByCondition(String startDate, String endDate, String name, Page page) {
		// TODO Auto-generated method stub
		
		List<UserAttendance> attendanceList =attendanceDao.selectAttendanceByCondition(startDate,endDate,page.getStartRow(),page.getEndRow());
		return attendanceList;
	}

	@Override
	public CmsUser selectUserByUserName(String username, String password) {
		// TODO Auto-generated method stub
		return userMapper.selectUserByUserName(username, password);
		
	}

	
	/*查询总数*/
	@Override
	public int selectCountAttendance(String startDate, String endDate, long uid) {
		
		int i=attendanceDao.selectCountAttendance(startDate, endDate, uid);
		return i;
	}

	/*分页查询*/
	@Override
	public List<UserAttendance> selectAttendanceById(String startDate, String endDate, long uid, Page page) {
		// TODO Auto-generated method stub
		List<UserAttendance> list=attendanceDao.selectAttendanceById(startDate, endDate,uid,page.getStartRow(),page.getEndRow());
		return list;
	}

	/*根据id查询*/
	@Override
	public UserAttendance selectAttendanceByUserId(long uid) {
		// TODO Auto-generated method stub
		UserAttendance  userAttendance=attendanceDao.selectAttendanceByUserId(uid);
		return userAttendance;
	}



}
