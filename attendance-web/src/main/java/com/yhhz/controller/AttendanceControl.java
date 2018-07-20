package com.yhhz.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.yhhz.pojo.Askforleave;
import com.yhhz.pojo.CmsUser;
import com.yhhz.pojo.UserAttendance;

import com.yhhz.service.AttendanceSv;
import com.yhhz.util.Page;

/*** <p>Title:AttendanceControl </p>
* <p>Description: </p>
* <p>Company:悦航合展 </p> 
* @author:Alan
* @date:2018年4月25日
 */
@Controller
public class AttendanceControl {

	
	
	
	
	/*考勤日志功能*/
	@Autowired
	private AttendanceSv attendanceSv;
	
	
	/*登录*/
	@RequestMapping(value="attendance/login",produces="text/json;charset=UTF-8")
	@ResponseBody
	public String login(String username,String password,Map<String,Object> map) {
		CmsUser user = attendanceSv.selectUserByUserName(username, password);
		if(user!=null){
			System.out.println(user.getUid());
				  map.put("user",user);
				  map.put("status", 200);
				  return JSON.toJSONString(map);
			}else {
				//账号不存在
				  map.put("status", 400);
				 return JSON.toJSONString(map);
						
			}		
					
	}
	


	//添加考勤日志信息
	@RequestMapping("addAttendance")
	@ResponseBody
	public String addAttendance(UserAttendance attendance,Map<String,Object> map)  {
		
		
		Integer count = attendanceSv.addAttendance(attendance);
		map.put("num",count);
		 return JSON.toJSONString(map);
	}
	
	
	    //更新考勤日志信息
		@RequestMapping("updateAttendance")
		@ResponseBody
		public String updateAttendance(UserAttendance attendance,Map<String,Object> map)  {
			
			Long uid=attendance.getUserId();
			System.out.println(uid);
			UserAttendance attendance1=attendanceSv.selectAttendanceByUserId(uid);
			attendance.setAttendanceId(attendance1.getAttendanceId());
			Integer count = attendanceSv.updateAttendance(attendance);
			System.out.println(count);
			map.put("num",count);
			 return JSON.toJSONString(map);
		}
		
	
	
	
	
	
	//删除信息
		@RequestMapping(value="deleteAttendance",produces="text/json;charset=UTF-8")
		@ResponseBody
		public String deleteAttendance(Integer attendanceid,Map<String,Object> map) {
			
			 Integer count = attendanceSv.deleteAttendance(attendanceid);
			 map.put("num",count);
			 return JSON.toJSONString(map);
		
		}
		
	//根据姓名查询我的考勤日志
		@RequestMapping(value="selectAttendanceByName",produces="text/json;charset=UTF-8")
		@ResponseBody
	 public String selectAttendanceByName(String name,Map<String,Object> map){
				
	
	
		List<UserAttendance> attendanceList = attendanceSv.selectAttendanceByName(name);

				return JSON.toJSONString(attendanceList);
			}
		
		
		
		//分页查询我的考勤日志
				@RequestMapping(value="selectMyAttendance",produces="text/json;charset=UTF-8")
				@ResponseBody
			 public String selectMyAttendance(String startDate,String endDate,Integer pageIndex,long uid,Map<String,Object> map){
						
					if(pageIndex==null) {
						 pageIndex=1;
					}
				    Page page = new Page();
				    page.setPageIndex(pageIndex);
					int record =attendanceSv.selectCountAttendance(startDate, endDate,uid);
					page.setRecord(record);
					List<UserAttendance> list = attendanceSv.selectAttendanceById(startDate, endDate,uid,page);
					map.put("page", page);
					map.put("list",list);
					return JSON.toJSONString(map);
					}
				
		
		
	
	
	
	
}
