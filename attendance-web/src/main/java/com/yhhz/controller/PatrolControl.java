package com.yhhz.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.yhhz.pojo.Patrol;
import com.yhhz.pojo.Patrol;

import com.yhhz.service.PatrolSv;
import com.yhhz.util.Page;


@Controller
//巡岗日志表
public class PatrolControl {

	
	@Autowired
	private PatrolSv patrolSv;
	
	/*分页查询*/
	@RequestMapping(value="selectPatrol",produces="text/json;charset=UTF-8")
	@ResponseBody
		public String selectPatrol(String startDate,String endDate,Integer  pageIndex,Map<String,Object> map) {
			
			if(pageIndex==null) {
				 pageIndex=1;
			}
		    Page page = new Page();
		    page.setPageIndex(pageIndex);
			int record =patrolSv.selectCountByCondition(startDate, endDate);
			page.setRecord(record);
			List<Patrol> list = patrolSv.selectPatrolByCondition(startDate, endDate,page);
			map.put("page", page);
			map.put("list",list);
			return JSON.toJSONString(map);
		}
	

	        //删除路线
			@RequestMapping(value="deletePatrol",produces="text/json;charset=UTF-8")
			@ResponseBody
			public String deletePatrol(Integer patrolId,Map<String,Object> map)  {
				
				Integer count = patrolSv.deletePatrol(patrolId);
				map.put("num",count);
				 return JSON.toJSONString(map);
			}
			
	
	

		//增加巡岗日志
		@RequestMapping(value="addPatrol",produces="text/json;charset=UTF-8")
		@ResponseBody
		public String addPatrol(Patrol patrol,Map<String,Object> map)  {
			
			Integer count = patrolSv.addPatrol(patrol);
			map.put("num",count);
			 return JSON.toJSONString(map);
		}
		
 
		  //更改路线
		@RequestMapping(value="dealPatrol",produces="text/json;charset=UTF-8")
		@ResponseBody
		public String dealPatrol(Patrol patrol,Map<String,Object> map)  {
					
			Integer count =patrolSv.updatePatrol(patrol);
			map.put("num",count);
			 return JSON.toJSONString(map);
				}

		 //更改路线
		@RequestMapping(value="getPatrolById",produces="text/json;charset=UTF-8")
		@ResponseBody
		public String getPatrolById(long  uid,Map<String,Object> map)  {
					
			Patrol patrol = patrolSv.selectPatrolByuserId(uid);
			System.out.println(patrol );
			map.put("patrol", patrol);
			 return JSON.toJSONString(patrol);
				}
	
	
	
	
	
}
