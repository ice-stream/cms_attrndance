package com.yhhz.mapper;

import com.yhhz.pojo.CmsRole;

public interface CmsRoleMapper {
    int deleteByPrimaryKey(Long rId);

    int insert(CmsRole record);

    int insertSelective(CmsRole record);

    CmsRole selectByPrimaryKey(Long rId);

    int updateByPrimaryKeySelective(CmsRole record);

    int updateByPrimaryKey(CmsRole record);
}