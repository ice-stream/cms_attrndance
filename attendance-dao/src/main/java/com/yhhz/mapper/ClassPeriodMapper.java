package com.yhhz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yhhz.pojo.ClassPeriod;

public interface ClassPeriodMapper {
    int deleteByPrimaryKey(Integer classPeriodId);

    int insert(ClassPeriod record);

    int insertSelective(ClassPeriod record);

    ClassPeriod selectByPrimaryKey(Integer classPeriodId);

    int updateByPrimaryKeySelective(ClassPeriod record);

    int updateByPrimaryKey(ClassPeriod record);

    //根据姓名查询
	List<ClassPeriod> selectByName(@Param("name") String name);

	int selectCountByUid(@Param("startDate") String startDate,@Param("endDate") String endDate,@Param("uid") long uid);

	List<ClassPeriod> selectMyClassByCondition(@Param("startDate") String startDate,@Param("endDate") String endDate, @Param("uid")long uid, @Param("startRow") int startRow,
			@Param("endRow") int endRow);

	int selectCountByDate(@Param("startDate")String startDate, @Param("endDate")String endDate);

	List<ClassPeriod> selectClassByDate(@Param("startDate") String startDate,@Param("endDate") String endDate,  @Param("startRow")int startRow,

			@Param("endRow")int endRow);
}