package com.yhhz.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import com.yhhz.pojo.ActiveUser;



@Controller
public class UserControl {

	@RequestMapping(value="login",produces="text/json;charset=UTF-8")
	@ResponseBody
	public String login(String username ,String password, Map<String,Object> map)throws Exception{
		
		
		       Subject subject=SecurityUtils.getSubject();
		    UsernamePasswordToken token=new UsernamePasswordToken(username,password.toCharArray());
	
		    try {
		    	subject.login(token);
		    	
		    	map.put("token",  subject.getSession().getId());
		    	map.put("status", 200);
		    	
		    	ActiveUser activeUser = (ActiveUser) SecurityUtils.getSubject().getPrincipal();
		    	  System.out.println(activeUser.getUserName());
		    	  System.out.println(activeUser.getUserId());
		    	map.put("user", activeUser);
		    	String userName=activeUser.getUserName();
		    	map.put("userName", userName);
			} catch (IncorrectCredentialsException e) {
				//密码错误
				map.put("status", 500);
				
			} catch (Exception e) {
				//账号不存在
				map.put("status", 400);
			}
					
			return JSON.toJSONString(map);    
		
	}
	
	   @RequestMapping(value = "/unauth",produces="text/json;charset=UTF-8")  
	    @ResponseBody  
	    public Object unauth() {  
	        Map<String, Object> map = new HashMap<String, Object>();  
	        map.put("code", 911);  
	        map.put("msg", "无权限");
	        System.out.println(map);
	        return map;  
	    }  
	
	
	
	
}
