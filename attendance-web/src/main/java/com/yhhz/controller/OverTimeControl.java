package com.yhhz.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import com.yhhz.pojo.OverTime;
import com.yhhz.pojo.UserRetroactive;
import com.yhhz.service.OverTimeSv;
import com.yhhz.util.Page;

/*** <p>Title:OverTimeControl </p>
* <p>Description: </p>
* <p>Company:悦航合展 </p> 
* @author:Alan
* @date:2018年5月4日
 */

@Controller
public class OverTimeControl {
	
	@Autowired
	private  OverTimeSv overTimeSv;
	
	  /*分页查询*/
		@RequestMapping(value="selectOverTime",produces="text/json;charset=UTF-8")
		@ResponseBody
			public String selectOverTime(String startDate,String endDate,Integer  pageIndex,Map<String,Object> map) {
				
				if(pageIndex==null) {
					 pageIndex=1;
				}
			    Page page = new Page();
			    page.setPageIndex(pageIndex);
				int record =overTimeSv.selectCountByCondition(startDate, endDate);
				page.setRecord(record);
				List<OverTime> list = overTimeSv.selectOverTimeByCondition(startDate, endDate,page);
				map.put("page", page);
				map.put("list",list);
				
				return JSON.toJSONString(map);
			}
		
		/*个人分页查询*/
		@RequestMapping(value="selectMyOverTime",produces="text/json;charset=UTF-8")
		@ResponseBody
			public String selectMyOverTime(String startDate,String endDate,Integer  pageIndex,long uid,Map<String,Object> map) {
			     if(pageIndex==null) {
				 pageIndex=1;
			     }
		       Page page = new Page();
		       page.setPageIndex(pageIndex);
				int record=overTimeSv.selectCountOverTime(startDate, endDate,uid);
				System.out.println(uid);
				page.setRecord(record);
				List<OverTime> list = overTimeSv.selectMyOverTimeByCondition(startDate, endDate,uid,page);
				 map.put("page", page);
			     map.put("list",list);
				return JSON.toJSONString(map);
			     
			}
		
	
		        //删除加班信息
				@RequestMapping(value="deleteOverTime",produces="text/json;charset=UTF-8")
				@ResponseBody
				public String deleteOverTime(Integer overtimeId,Map<String,Object> map)  {
					
					Integer count = overTimeSv.deleteOverTime(overtimeId);
					map.put("num",count);
					 return JSON.toJSONString(map);
				}
				
		
		

			//加班申请
			@RequestMapping(value="addOverTime",produces="text/json;charset=UTF-8")
			@ResponseBody
			public String addOverTime(OverTime overTime,Map<String,Object> map)  {
				 Date date = new Date();//获得系统时间.
			      SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
			      String nowTime = sdf.format(date);
			      overTime.setOperatingTime(nowTime);
			      overTime.setCheckType(0);
				
				
				Integer count = overTimeSv.addOverTime(overTime);
				map.put("num",count);
				 return JSON.toJSONString(map);
			}
			
           /*姓名查询*/
			@RequestMapping(value="selectOverTimeByName",produces="text/json;charset=UTF-8")
			@ResponseBody
		   public String selectOverTimeByName(String name,Map<String,Object> map){
					
				  List<OverTime> list = overTimeSv.selectOverTimeByName(name);
					return JSON.toJSONString(list);
				}
			
			
			  //处理加班信息
			@RequestMapping(value="dealOverTime",produces="text/json;charset=UTF-8")
			@ResponseBody
			public String dealOverTime(OverTime overTime,Map<String,Object> map)  {
					
				 Date date = new Date();//获得系统时间.
			      SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
			        String nowTime = sdf.format(date);
			        overTime.setCheckTime(nowTime);  
				overTime.setCheckType(1);
				Integer count =overTimeSv.updateOverTime(overTime);
				
				map.put("num",count);
				 return JSON.toJSONString(map);
					}
	
	

}
