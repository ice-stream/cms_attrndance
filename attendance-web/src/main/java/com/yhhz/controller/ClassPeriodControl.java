package com.yhhz.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.yhhz.pojo.ClassPeriod;
import com.yhhz.pojo.CmsUser;
import com.yhhz.pojo.OverTime;
import com.yhhz.pojo.Patrol;
import com.yhhz.service.ClassPeriodSv;
import com.yhhz.util.Page;

@Controller
public class ClassPeriodControl {

	
	@Autowired
	private ClassPeriodSv classPeriodSv;
	

	//根据姓名查询
	@RequestMapping(value="selectClassByName",produces="text/json;charset=UTF-8")
	@ResponseBody
    public String selectClssByName(String name,Map<String,Object> map){
		List<ClassPeriod> classPeriodlList = classPeriodSv.selectClassperiodByCondition(name);
		return JSON.toJSONString(classPeriodlList);
		}
	
	
	     //添加班次
		@RequestMapping(value="addClass",produces="text/json;charset=UTF-8")
		@ResponseBody
		public String addClass(ClassPeriod classPeriod,Map<String,Object> map)  {
		
			
		
			Integer count = classPeriodSv.addClassperiod(classPeriod);
			map.put("num",count);
			 return JSON.toJSONString(map);
		}
		
		
		  //删除班次信息
			@RequestMapping(value="deleteClass",produces="text/json;charset=UTF-8")
			@ResponseBody
			public String deleteClass(Integer classPeriodid,Map<String,Object> map) {
				
				 Integer count = classPeriodSv.deleteClassperiod(classPeriodid);
				 map.put("num",count);
				 return JSON.toJSONString(map);
			
			}
	
			
			
			  //更改班次
			@RequestMapping(value="updateClass",produces="text/json;charset=UTF-8")
			@ResponseBody
			public String updateClass(ClassPeriod classPeriod,Map<String,Object> map)  {
				

				Integer count = classPeriodSv.updateClassperiod(classPeriod);
				map.put("num",count);
				 return JSON.toJSONString(map);
			}

	
			
			/*	查询所有*/
			@RequestMapping(value="selectMyClass",produces="text/json;charset=UTF-8")
			@ResponseBody
				public String selectMyClass(String startDate,String endDate,Integer pageIndex,long uid,Map<String,Object> map) {
					
				if(pageIndex==null) {
					 pageIndex=1;
				}
			    Page page = new Page();
			    page.setPageIndex(pageIndex);
				int record =classPeriodSv.selectCountMyClass(startDate, endDate,uid);
				System.out.println(uid);
				page.setRecord(record);
				List<ClassPeriod> list = classPeriodSv.selectMyClassByCondition(startDate, endDate, uid,page);
				map.put("page", page);
				map.put("list",list);
				return JSON.toJSONString(map);
				}
			
			 /*	日期类型*/
			@RequestMapping(value="selectClass",produces="text/json;charset=UTF-8")
			@ResponseBody
				public String selectClass(String startDate,String endDate,Integer pageIndex,Map<String,Object> map) {
				if(pageIndex==null) {
					 pageIndex=1;
				}
			    Page page = new Page();
			    page.setPageIndex(pageIndex);
			    int record =classPeriodSv.selectCountClass(startDate, endDate);
				page.setRecord(record);
				List<ClassPeriod> list = classPeriodSv.selectClassByDate(startDate, endDate,page);	
				map.put("page", page);
				map.put("list",list);
				
				return JSON.toJSONString(map);
				}
				
			
			
			
			
			
	
}
