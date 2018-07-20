package com.yhhz.mapper;

import com.yhhz.pojo.CmsPermission;

public interface CmsPermissionMapper {
    int deleteByPrimaryKey(Long pId);

    int insert(CmsPermission record);

    int insertSelective(CmsPermission record);

    CmsPermission selectByPrimaryKey(Long pId);

    int updateByPrimaryKeySelective(CmsPermission record);

    int updateByPrimaryKey(CmsPermission record);
}