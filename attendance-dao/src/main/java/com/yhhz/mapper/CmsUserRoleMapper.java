package com.yhhz.mapper;

import com.yhhz.pojo.CmsUserRole;

public interface CmsUserRoleMapper {
    int deleteByPrimaryKey(Long urId);

    int insert(CmsUserRole record);

    int insertSelective(CmsUserRole record);

    CmsUserRole selectByPrimaryKey(Long urId);

    int updateByPrimaryKeySelective(CmsUserRole record);

    int updateByPrimaryKey(CmsUserRole record);
}