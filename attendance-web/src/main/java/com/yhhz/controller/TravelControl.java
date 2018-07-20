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
import com.yhhz.pojo.Askforleave;
import com.yhhz.pojo.Travel;
import com.yhhz.service.TravelSv;
import com.yhhz.util.Page;

/*** <p>Title:TravelControl </p>
* <p>Description: </p>
* <p>Company:悦航合展 </p> 
* @author:Alan
* @date:2018年5月4日
 */
@Controller
public class TravelControl {

	
	@Autowired
	private  TravelSv travelSv;
	
	  /*分页查询*/
		@RequestMapping(value="selectTravel",produces="text/json;charset=UTF-8")
		@ResponseBody
			public String selectTravel(String startDate,String endDate,Integer  pageIndex,Map<String,Object> map) {
				
				if(pageIndex==null) {
					 pageIndex=1;
				}
			    Page page = new Page();
			    page.setPageIndex(pageIndex);
				int record =travelSv.selectCountByCondition(startDate, endDate);
				System.out.println(record);
				page.setRecord(record);
				List<Travel> list = travelSv.selectTravelByCondition(startDate, endDate,page);
				map.put("page", page);
				map.put("list",list);
				
				return JSON.toJSONString(map);
			}
		
	
		        //删除加班信息
				@RequestMapping(value="deleteTravel",produces="text/json;charset=UTF-8")
				@ResponseBody
				public String deleteTravel(Integer travelId,Map<String,Object> map)  {
					
					Integer count= travelSv.deleteTravel(travelId);
					map.put("num",count);
					 return JSON.toJSONString(map);
				}
				
		
		

			//加班申请
			@RequestMapping(value="addTravel",produces="text/json;charset=UTF-8")
			@ResponseBody
			public String addTravel(Travel travel,Map<String,Object> map)  {
				
				 Date date = new Date();//获得系统时间.
			      SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
			      String nowTime = sdf.format(date);
			      travel.setOperatingTime(nowTime);
			      travel.setCheckType(0);
				
				Integer count= travelSv.addTravel(travel);
				map.put("num",count);
				 return JSON.toJSONString(map);
			}
			
           /*姓名查询*/
			@RequestMapping(value="selectTravelByName",produces="text/json;charset=UTF-8")
			@ResponseBody
		   public String selectTravelByName(String name,Map<String,Object> map){
					
				  List<Travel> list = travelSv.selectTravelByName(name);
					return JSON.toJSONString(list);
				}
			
			
			  //处理加班信息
			@RequestMapping(value="dealTravel",produces="text/json;charset=UTF-8")
			@ResponseBody
			public String dealTravel(Travel travel,Map<String,Object> map)  {
				
				 Date date = new Date();//获得系统时间.
			      SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd");
			        String nowTime = sdf.format(date);
			        travel.setCheckTime(nowTime);
				travel.setCheckType(1);
				Integer count=travelSv.updateTravel(travel);
				map.put("num",count);
				 return JSON.toJSONString(map);
					}
			

			/*	查询所有*/
			@RequestMapping(value="selectMyTravel",produces="text/json;charset=UTF-8")
			@ResponseBody
				public String selectMyTravel(String startDate,String endDate,Integer pageIndex,long uid,Map<String,Object> map) {
					
				if(pageIndex==null) {
					 pageIndex=1;
				}
			    Page page = new Page();
			    page.setPageIndex(pageIndex);
				int record =travelSv.selectCountMyTravel(startDate, endDate,uid);
				System.out.println(uid);
				page.setRecord(record);
				List<Travel> list = travelSv.selectMyTravelByCondition(startDate, endDate, uid,page);
				map.put("page", page);
				map.put("list",list);
				return JSON.toJSONString(map);
				}
			
			
			
			
			
			
			
			
			
			
	
}
