package com.yhhz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yhhz.pojo.OverTime;

public interface OverTimeMapper {
    int deleteByPrimaryKey(Integer overtimeId);

    int insert(OverTime record);

    int insertSelective(OverTime record);

    OverTime selectByPrimaryKey(Integer overtimeId);

    int updateByPrimaryKeySelective(OverTime record);

    int updateByPrimaryKey(OverTime record);

    
    /*根据姓名查询*/
	List<OverTime> selectOverTimeByName(@Param("name")String name);

    /*条件查询*/
	int selectCountByCondition(@Param("startDate")String startDate, @Param("endDate")String endDate);
 
   /*分页查询*/
	List<OverTime> selectOverTimeByCondition(@Param("startDate")String startDate,@Param("endDate") String endDate, @Param("startRow") int startRow,@Param("endRow") int endRow);

	/*个人查询总数*/
	int selectCountOverTime(@Param("startDate")String startDate,@Param("endDate") String endDate, @Param("uid")long uid);

	/*个人分页查询*/
	List<OverTime> selectOverMyTimeByCondition(@Param("startDate")String startDate,@Param("endDate") String endDate, @Param("uid") long uid, @Param("startRow") int startRow,@Param("endRow") int endRow);
}