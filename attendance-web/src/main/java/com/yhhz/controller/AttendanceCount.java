package com.yhhz.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.yhhz.service.AttendanceCountSv;
import com.yhhz.vo.AttendanceCountVo;
import com.yhhz.vo.AttendanceInfo;



@Controller
public class AttendanceCount {
	
	@Autowired
	private AttendanceCountSv attendanceCountSv;
	
	/*根据id查询统计*/
	@RequestMapping(value="selectCountAskforleave",produces="text/json;charset=UTF-8")
	@ResponseBody
   public String selectCountAskforleave(String startDate, String endDate, long uid,Map<String,Object> map){
			
		System.out.println(uid);
		List<AttendanceCountVo>  list=attendanceCountSv.selectAttendanceCount(startDate,endDate,uid);
		
		System.out.println(list);
		map.put("list", list);
		return JSON.toJSONString(map);
		}
//	
//	/*根据姓名查询统计*/
//	@RequestMapping(value="selectCountAttendanceByName",produces="text/json;charset=UTF-8")
//	@ResponseBody
//   public String selectCountAttendanceByName(String name){
//			
//		List<AttendanceInfo>  list=attendanceCountSv.slectAttendanceInfo(name);
//		return JSON.toJSONString(list);
//		}
//	
	
	

}
