package com.yhhz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yhhz.pojo.UserAttendance;

public interface UserAttendanceMapper {
    int deleteByPrimaryKey(Integer attendanceId);

    int insert(UserAttendance record);

    int insertSelective(UserAttendance record);

    UserAttendance selectByPrimaryKey(Integer attendanceId);

    int updateByPrimaryKeySelective(UserAttendance record);

    int updateByPrimaryKey(UserAttendance record);

    /*查询考勤日志*/
	List<UserAttendance> selectByName(@Param("name") String name);

	int selectCountByCondition(@Param("startDate") String startDate, @Param("endDate") String endDate,@Param("name") String name);

	List<UserAttendance> selectAttendanceByCondition(@Param("startDate") String startDate, @Param("endDate") String endDate,@Param("startRow") int startRow,@Param("endRow") int endRow);

	/*查询总数*/
	int selectCountAttendance(@Param("startDate") String startDate,@Param("endDate")String endDate, @Param("uid")long uid);

     /*分页查询*/
	List<UserAttendance> selectAttendanceById(@Param("startDate") String startDate,@Param("endDate") String endDate, @Param("uid")long uid, @Param("startRow") int startRow,
			@Param("endRow") int endRow);

	/*根据id查询*/
	UserAttendance selectAttendanceByUserId( @Param("uid") long uid);
}