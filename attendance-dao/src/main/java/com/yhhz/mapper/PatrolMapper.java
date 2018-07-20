package com.yhhz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yhhz.pojo.Patrol;

public interface PatrolMapper {
    int deleteByPrimaryKey(Integer patrolId);

    int insert(Patrol record);

    int insertSelective(Patrol record);

    Patrol selectByPrimaryKey(Integer patrolId);

    int updateByPrimaryKeySelective(Patrol record);

    int updateByPrimaryKey(Patrol record);

	List<Patrol> selectByName(@Param("name") String name);

	int selectCountByCondition(@Param("startDate") String startDate,@Param("endDate") String endDate);

	List<Patrol> selectLineByCondition(@Param("startDate") String startDate,@Param("endDate") String endDate,@Param("startRow") int startRow, @Param("endRow") int endRow);

	
	Patrol selectByUserId(@Param("uid")long uid);
}