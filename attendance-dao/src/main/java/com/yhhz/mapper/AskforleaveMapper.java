package com.yhhz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yhhz.pojo.Askforleave;

public interface AskforleaveMapper {
    int deleteByPrimaryKey(Integer askForLeaveId);

    int insert(Askforleave record);

    int insertSelective(Askforleave record);

    Askforleave selectByPrimaryKey(Integer askForLeaveId);

    int updateByPrimaryKeySelective(Askforleave record);

    int updateByPrimaryKey(Askforleave record);
    
    

    //根据姓名查询
	List<Askforleave> selectByName(@Param("name")String name);

	//根据日期类型查询
	List<Askforleave> selectAskforleaveByDate(@Param("startDate")String startDate, @Param("endDate")String endDate);

	
	/*查询分页总数*/
	int selectCountByCondition(@Param("startDate") String startDate, @Param("endDate") String endDate);

	/*查询请假*/
	List<Askforleave> selectAskforleaveByCondition(@Param("startDate") String startDate,@Param("endDate") String endDate,  @Param("startRow")int startRow,

			@Param("endRow")int endRow);
	
    /*查询自己请假总数*/
	int selectCountByAskforleave(@Param("startDate") String startDate,@Param("endDate") String endDate,@Param("uid") long uid);
	
    
	/*分页查询自己请假*/
	List<Askforleave> selectMyAskforleaveByCondition(@Param("startDate") String startDate,@Param("endDate") String endDate, @Param("uid")long uid, @Param("startRow") int startRow,
			@Param("endRow") int endRow);
  
    
}