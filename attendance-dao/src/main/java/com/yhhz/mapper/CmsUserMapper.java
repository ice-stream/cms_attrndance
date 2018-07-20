package com.yhhz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yhhz.pojo.CmsPermission;
import com.yhhz.pojo.CmsUser;

public interface CmsUserMapper {
    int deleteByPrimaryKey(Long uid);

    int insert(CmsUser record);

    int insertSelective(CmsUser record);

    CmsUser selectByPrimaryKey(Long uid);

    int updateByPrimaryKeySelective(CmsUser record);

    int updateByPrimaryKey(CmsUser record);

	CmsUser selectUserByUserName(@Param("username")String username, @Param("password")String password);
	
	
	CmsUser selectUserByName(@Param("userame")String userName);

	List<CmsPermission> findPermissionListByUserId(@Param("userid") Long userid);

	List<CmsUser> queryUserByName(@Param("username")String username);
	
	
}