package com.yhhz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yhhz.pojo.Travel;

public interface TravelMapper {
    int deleteByPrimaryKey(Integer travelId);

    int insert(Travel record);

    int insertSelective(Travel record);

    Travel selectByPrimaryKey(Integer travelId);

    int updateByPrimaryKeySelective(Travel record);

    int updateByPrimaryKey(Travel record);

    
	List<Travel> selectTravelByName(@Param("name") String name);

	int selectCountByCondition(@Param("startDate") String startDate, @Param("endDate") String endDate);

	List<Travel> selectTravelByCondition(@Param("startDate") String startDate,@Param("endDate") String endDate, @Param("startRow")int startRow,

			@Param("endRow")int endRow);

	/*查询总数*/
	int selectCountMyTravel(@Param("startDate") String startDate,@Param("endDate") String endDate,@Param("uid") long uid);

	/*分页查询*/
	List<Travel> selectMyTravelByCondition(@Param("startDate")String startDate, @Param("endDate") String endDate,@Param("uid") long uid, @Param("startRow") int startRow,@Param("endRow") int endRow);
}