package com.yhhz.service;

import java.util.List;

import com.yhhz.pojo.Askforleave;
import com.yhhz.util.Page;

/*** <p>Title:AskforleaveService </p>
* <p>Description: </p>
* <p>Company:悦航合展 </p> 
* @author:Alan
* @date:2018年4月26日
 */

public interface AskforleaveService {

	//添加申请条信息
	Integer addAskforleave(Askforleave askforleave);
	
	//更新申请条信息
	Integer updateAskforleave(Askforleave askforleave);
	
	//删除申请条信息
	Integer deleteAskforleave(Integer askForLeaveId);	
	
 
	/*根据姓名*/
	List<Askforleave> selectAskforleaveByNa(String name);


    /*根据日期类型查询*/
	List<Askforleave> selectAskforleaveByDate(String startDate, String endDate);

	
	//根据条件获取总记录数
	int selectCountByCondition(String startDate, String endDate);

	//根据条件添加查申请条
	List<Askforleave> selectAskforleaveByCondition(String startDate, String endDate,  Page page);

	//根据自己id查询
	int selectCountMyAskforleave(String startDate, String endDate, long uid);

	/*根据自己分页查询*/
	List<Askforleave> selectMyAskforleaveByCondition(String startDate, String endDate,long uid,Page page);

	
	

}
