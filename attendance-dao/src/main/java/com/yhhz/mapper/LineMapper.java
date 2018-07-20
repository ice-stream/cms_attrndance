package com.yhhz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yhhz.pojo.Line;

public interface LineMapper {
    int deleteByPrimaryKey(Integer lineId);

    int insert(Line record);

    int insertSelective(Line record);

    Line selectByPrimaryKey(Integer lineId);

    int updateByPrimaryKeySelective(Line record);

    int updateByPrimaryKey(Line record);
 
    //根据姓名查询
	List<Line> selectByName(@Param("name")String name);

	List<Line> selectLineByCondition(@Param("startDate") String startDate,@Param("endDate") String endDate,@Param("startRow") int startRow,@Param("endRow") int endRow);

	int selectCountByCondition(@Param("startDate")String startDate,@Param("endDate") String endDate);
}