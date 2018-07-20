package com.yhhz.mapper;

import com.yhhz.pojo.CmsRolePermission;

public interface CmsRolePermissionMapper {
    int deleteByPrimaryKey(Long rpId);

    int insert(CmsRolePermission record);

    int insertSelective(CmsRolePermission record);

    CmsRolePermission selectByPrimaryKey(Long rpId);

    int updateByPrimaryKeySelective(CmsRolePermission record);

    int updateByPrimaryKey(CmsRolePermission record);
}