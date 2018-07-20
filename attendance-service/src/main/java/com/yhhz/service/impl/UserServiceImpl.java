package com.yhhz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhhz.mapper.CmsUserMapper;
import com.yhhz.pojo.CmsPermission;
import com.yhhz.pojo.CmsUser;
import com.yhhz.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private CmsUserMapper userMapper;
	
	
	@Override
	public List<CmsPermission> findPermissionListByUserId(Long userid) {
		// TODO Auto-generated method stub
		return userMapper.findPermissionListByUserId(userid);
	}


	@Override
	public CmsUser selectUserByUserName(String username, String password) {
		// TODO Auto-generated method stub
		return userMapper.selectUserByUserName(username, password);
	}


	@Override
	public CmsUser queryUserByName(String username) {
		// TODO Auto-generated method stub
       List<CmsUser> userList = userMapper.queryUserByName(username);
		
		if ( userList != null && !userList.isEmpty() ) {
			return userList.get(0);
		}
		return null;
	}

}
