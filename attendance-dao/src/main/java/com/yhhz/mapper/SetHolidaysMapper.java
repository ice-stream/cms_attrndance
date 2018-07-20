package com.yhhz.mapper;

import com.yhhz.pojo.SetHolidays;

public interface SetHolidaysMapper {
    int deleteByPrimaryKey(Integer holidaysId);

    int insert(SetHolidays record);

    int insertSelective(SetHolidays record);

    SetHolidays selectByPrimaryKey(Integer holidaysId);

    int updateByPrimaryKeySelective(SetHolidays record);

    int updateByPrimaryKey(SetHolidays record);
}