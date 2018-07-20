package com.yhhz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yhhz.pojo.UserRetroactive;

public interface UserRetroactiveMapper {
    int deleteByPrimaryKey(Integer userRetroactiveId);

    int insert(UserRetroactive record);

    int insertSelective(UserRetroactive record);

    UserRetroactive selectByPrimaryKey(Integer userRetroactiveId);

    int updateByPrimaryKeySelective(UserRetroactive record);

    int updateByPrimaryKey(UserRetroactive record);

	List<UserRetroactive> selectByName(@Param("name") String name);

	
	int selectCountByCondition(@Param("startDate") String startDate,@Param("endDate") String endDate);

	/*分页查询补签*/
	List<UserRetroactive> selectRetroactiveByCondition(@Param("startDate") String startDate, @Param("endDate") String endDate,@Param("startRow") int startRow, @Param("endRow") int endRow);

	int selectMyCountByCondition(@Param("startDate") String startDate,@Param("endDate") String endDate,@Param("uid") long uid);

	List<UserRetroactive> selectMyRetroactiveByCondition(@Param("startDate") String startDate,@Param("endDate") String endDate, @Param("uid")long uid, @Param("startRow") int startRow,
			@Param("endRow") int endRow);
    
    
}