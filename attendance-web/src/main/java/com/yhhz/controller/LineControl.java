package com.yhhz.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import com.yhhz.pojo.Line;
import com.yhhz.pojo.Patrol;
import com.yhhz.pojo.Line;
import com.yhhz.service.LineSv;
import com.yhhz.util.Page;

@Controller
public class LineControl {

	@Autowired
	private LineSv lineSv;
	
	  /*分页查询*/
		@RequestMapping(value="selectLine",produces="text/json;charset=UTF-8")
		@ResponseBody
			public String selectLine(String startDate,String endDate,Integer  pageIndex,Map<String,Object> map) {
				
				if(pageIndex==null) {
					 pageIndex=1;
				}
			    Page page = new Page();
			    page.setPageIndex(pageIndex);
				int record =lineSv.selectCountByCondition(startDate, endDate);
				page.setRecord(record);
				List<Line> list = lineSv.selectLineByCondition(startDate, endDate,page);
				map.put("page", page);
				map.put("list",list);
				return JSON.toJSONString(map);
			}
		
	
		        //删除路线
				@RequestMapping(value="deleteLine",produces="text/json;charset=UTF-8")
				@ResponseBody
				public String deleteLine(Integer lineId,Map<String,Object> map)  {
					
					Integer count = lineSv.deleteLine(lineId);
					map.put("num",count);
					 return JSON.toJSONString(map);
				}
				
		
		

			//增加路线
			@RequestMapping(value="addLine",produces="text/json;charset=UTF-8")
			@ResponseBody
			public String addLine(Line line,Map<String,Object> map)  {
				 Date date = new Date();//获得系统时间.
			      SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd");
			        String nowTime = sdf.format(date);
			        line.setLineDate(nowTime );
				Integer count = lineSv.addLine(line);
				map.put("num",count);
				 return JSON.toJSONString(map);
			}
			
     
			  //更改路线
			@RequestMapping(value="dealLine",produces="text/json;charset=UTF-8")
			@ResponseBody
			public String dealLine(Line line,Map<String,Object> map)  {
						
				Integer count =lineSv.updateLine(line);
				map.put("num",count);
				return JSON.toJSONString(map);
	
			}
           
	
	
	
	
	
	
}
