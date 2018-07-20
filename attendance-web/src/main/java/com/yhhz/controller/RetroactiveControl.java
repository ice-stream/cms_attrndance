package com.yhhz.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import com.yhhz.pojo.Patrol;
import com.yhhz.pojo.UserRetroactive;
import com.yhhz.service.AskforleaveService;
import com.yhhz.service.RetroactiveSv;
import com.yhhz.util.Page;

/*** <p>Title:RetroactiveControl </p>
* <p>Description: </p>
* <p>Company:悦航合展 </p> 
* @author:Alan
* @date:2018年4月26日
 */
@Controller
public class RetroactiveControl {

	@Autowired
	private RetroactiveSv retroactiveSv;

    /*分页查询*/
	@RequestMapping(value="selectRetroactive",produces="text/json;charset=UTF-8")
	@ResponseBody
		public String selectRetroactive(String startDate,String endDate,Integer  pageIndex,Map<String,Object> map) {
			
			if(pageIndex==null) {
				 pageIndex=1;
			}
		    Page page = new Page();
		    page.setPageIndex(pageIndex);
			int record =retroactiveSv.selectCountByCondition(startDate, endDate);
			page.setRecord(record);
			List<UserRetroactive> list = retroactiveSv.selectUserretroactiveByCondition(startDate, endDate,page);
			map.put("page", page);
			map.put("list",list);
			
			return JSON.toJSONString(map);
		}
	
	   /*个人补签查询*/
	
	 /*分页查询*/
		@RequestMapping(value="selectMyRetroactive",produces="text/json;charset=UTF-8")
		@ResponseBody
			public String selectMyRetroactive(String startDate,String endDate,long uid,Integer  pageIndex,Map<String,Object> map) {
				
				if(pageIndex==null) {
					 pageIndex=1;
				}
			    Page page = new Page();
			    page.setPageIndex(pageIndex);
				int record =retroactiveSv.selectMyCountByCondition(startDate, endDate,uid);
				page.setRecord(record);
				List<UserRetroactive> list = retroactiveSv.selectMyUserretroactiveByCondition(startDate, endDate,uid,page);
				map.put("page", page);
				map.put("list",list);
				
				return JSON.toJSONString(map);
			}
	
	
	
	
	
	
	
	
	
	        //删除补签信息
			@RequestMapping(value="deleteRetroactive",produces="text/json;charset=UTF-8")
			@ResponseBody
			public String deleteRetroactive(Integer userRetroactiveId,Map<String,Object> map)  {
				
				
				Integer count = retroactiveSv.deleteUserretroactive(userRetroactiveId);
				map.put("num",count);
				 return JSON.toJSONString(map);
			}
			
	
	

		//添加补签信息
		@RequestMapping(value="addRetroactive",produces="text/json;charset=UTF-8")
		@ResponseBody
		public String addRetroactive(UserRetroactive retroactive,Map<String,Object> map)  {
			
			 Date date = new Date();//获得系统时间.
		      SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd");
		        String nowTime = sdf.format(date);
		        retroactive.setOperatingTime(nowTime);
			
			retroactive.setCheckStateId(0);
			Integer count = retroactiveSv.addUserretroactive(retroactive);
			map.put("num",count);
			 return JSON.toJSONString(map);
		}
		
	
		
		
		//处理表单信息
				@RequestMapping(value="dealRetroactive",produces="text/json;charset=UTF-8")
				@ResponseBody
				public String dealRetroactive(UserRetroactive retroactive,Map<String,Object> map)  {
					 Date date = new Date();//获得系统时间.
				      SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd");
				        String nowTime = sdf.format(date);
				        retroactive.setCheckTime(nowTime);
				        retroactive.setCheckStateId(1);
					Integer count = retroactiveSv.updateUserretroactive(retroactive);
					map.put("num",count);
					 return JSON.toJSONString(map);
				}
		
		
		
	
}
