package com.yhhz.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.yhhz.pojo.Askforleave;
import com.yhhz.pojo.CmsPermission;
import com.yhhz.service.AskforleaveService;
import com.yhhz.util.Page;

/*** <p>Title:AskforleaveControl </p>
* <p>Description: </p>
* <p>Company:悦航合展 </p> 
* @author:Alan
* @date:2018年4月25日
 */
@Controller
public class AskforleaveControl {

	@Autowired
	private AskforleaveService askforleaveSv;
	
	
	
	/*分页查询*/
	@RequestMapping(value="selectAskforleave",produces="text/json;charset=UTF-8")
	@ResponseBody
	@RequiresPermissions("attendance:person")
		public String selectAskforleave(String startDate,String endDate,Integer pageIndex,Map<String,Object> map) {
			
	
		  
			if(pageIndex==null) {
				 pageIndex=1;
			}
		    Page page = new Page();
		    page.setPageIndex(pageIndex);
			int record =askforleaveSv.selectCountByCondition(startDate, endDate);
	
			page.setRecord(record);
			List<Askforleave> list = askforleaveSv.selectAskforleaveByCondition(startDate, endDate, page);
			map.put("page", page);
			map.put("list",list);
			return JSON.toJSONString(map);
		}
	
	
	
	
	/*	查询所有*/
	@RequestMapping(value="selectMyAskforleave",produces="text/json;charset=UTF-8")
	@ResponseBody
	@RequiresPermissions("attendance:person")
		public String selectMyAskforleave(String startDate,String endDate,Integer pageIndex,long uid,Map<String,Object> map) {
			
		if(pageIndex==null) {
			 pageIndex=1;
		}
	    Page page = new Page();
	    page.setPageIndex(pageIndex);
		int record =askforleaveSv.selectCountMyAskforleave(startDate, endDate,uid);
		System.out.println(uid);
		page.setRecord(record);
		List<Askforleave> list = askforleaveSv.selectMyAskforleaveByCondition(startDate, endDate, uid,page);
		map.put("page", page);
		map.put("list",list);
		return JSON.toJSONString(map);
		}
	
	
	
	
	
     /*	日期类型*/
	@RequestMapping(value="selectAskforleaves",produces="text/json;charset=UTF-8")
	@ResponseBody
	
		public String selectAskforleaves(String startDate,String endDate,Map<String,Object> map) {
			
			List<Askforleave> list = askforleaveSv.selectAskforleaveByDate(startDate, endDate);	
		
			return JSON.toJSONString(list);
		}
	

		//添加申请请假信息
		@RequestMapping(value="addAskforleave",produces="text/json;charset=UTF-8")
		@ResponseBody
		@RequiresPermissions("attendance:person")
		public String addAskforleave(Askforleave askforleave,Map<String,Object> map)  {
			
			 Date date = new Date();//获得系统时间.
		      SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
		      String nowTime = sdf.format(date);
			askforleave.setOperatingTime(nowTime);
			askforleave.setCheckType(0);
			Integer count = askforleaveSv.addAskforleave(askforleave);
			
			 map.put("num",count);
			 return JSON.toJSONString(map);
		}

	   //删除申请信息
		@RequestMapping(value="deleteAskforleave",produces="text/json;charset=UTF-8")
		@ResponseBody
		@RequiresPermissions("attendance:person")
		public String deleteAskforleave(Integer askForLeaveId,Map<String,Object> map) {
			
			 Integer count = askforleaveSv.deleteAskforleave(askForLeaveId);
			 map.put("num",count);
			 return JSON.toJSONString(map);
		
		}
			
		/*根据姓名查询*/
		@RequestMapping(value="selectAskforleaveByName",produces="text/json;charset=UTF-8")
		@ResponseBody
	   public String selectAskforleaveByName(String name,Map<String,Object> map){
				
			List<Askforleave> askforleaveList = askforleaveSv.selectAskforleaveByNa(name);
			return JSON.toJSONString(askforleaveList);
			}
		

        /*处理请假信息*/
		@RequestMapping(value="dealAskforleave",produces="text/json;charset=UTF-8")
		@ResponseBody
		@RequiresPermissions("attendance:manage")
		public String dealAskforleave(Askforleave askforleave,Map<String,Object> map)  {
	
			  Date date = new Date();//获得系统时间.
		      SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
		        String nowTime = sdf.format(date);
		        askforleave.setCheckTime(nowTime);
		
			askforleave.setCheckType(1);
			Integer count = askforleaveSv.updateAskforleave(askforleave);
			map.put("num",count);
			 return JSON.toJSONString(map);
		}

  	
	
	
}
