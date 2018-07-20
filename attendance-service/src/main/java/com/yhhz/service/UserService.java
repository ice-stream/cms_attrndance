package com.yhhz.service;

import java.util.List;

import com.yhhz.pojo.CmsPermission;
import com.yhhz.pojo.CmsUser;

public interface UserService {
	
	
 
	
	

	  /**根据用户名密码查找用户 **/
	  CmsUser selectUserByUserName(String username,String password);



	public CmsUser queryUserByName(String username);



	public List<CmsPermission> findPermissionListByUserId(Long userId);
}
