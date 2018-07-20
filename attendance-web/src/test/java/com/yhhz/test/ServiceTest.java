package com.yhhz.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;



import com.yhhz.mapper.AskforleaveMapper;
import com.yhhz.mapper.AttendanceCount;
import com.yhhz.mapper.CmsUserMapper;
import com.yhhz.mapper.OverTimeMapper;
import com.yhhz.mapper.UserAttendanceMapper;
import com.yhhz.pojo.Askforleave;
import com.yhhz.pojo.CmsUser;
import com.yhhz.pojo.OverTime;
import com.yhhz.pojo.UserAttendance;
import com.yhhz.service.AttendanceCountSv;
import com.yhhz.util.IdUtil;
import com.yhhz.vo.AttendanceCountVo;
import com.yhhz.vo.AttendanceInfo;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;





/*@RunWith(SpringJUnit3ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext-dao.xml",
        "classpath:spring/applicationContext-service.xml"})*/
public class ServiceTest {

//	 //要测试的service
//    @Autowired
//    AskforleaveMapper askforleaveDao;
//    
//    @Autowired
//    AttendanceCount AttendanceCountDao;
//    
//
//   @Autowired
//   OverTimeMapper overTimeDao;
//   
//   @Autowired
//   CmsUserMapper userMapper;
//   
//   
	
	
	@Autowired
    UserAttendanceMapper attendanceDao;
	
	@Autowired
    CmsUserMapper userMapper;;
	
	
//    @Test
//  public void selectAskforleaveByNa() {
//		// TODO Auto-generated method stub
//
//	    String name="admin";
//	    List<AttendanceCountVo> list=AttendanceCountDao.selectAttendanceCount(name);
//		System.out.println(list);
//	
//	}
//    
//    
//    @Test
//	public void selectUserByUserName() {
//    	String username="manage"; 
//    	String password="123";
//    	
//		// TODO Auto-generated method stub
//	        CmsUser user= userMapper.selectUserByUserName(username, password);
//	        System.out.println(user.getUid());
//		
//	}
//    
//    
//    
//    
//    
////    @Test
////    public void selectAskforleaveByNas() {
////  		// TODO Auto-generated method stub
////
////  	    String name="admin";
////  	    List<AttendanceInfo> list=attendanceCountSv.slectAttendanceInfo(name);
////  		for(Object obj:list) {
////  			AttendanceInfo a=(AttendanceInfo)obj;
////  			System.out.println(a.getIsLate());
////  		}
////  	
////  	}
//    
//    @Test
//    public void update() {
//  		// TODO Auto-generated method stub
//    	OverTime overTime=new OverTime();
//    	overTime.setOvertimeId(125);
//    	overTime.setCheckType(1);
//    	int i=overTimeDao.updateByPrimaryKeySelective(overTime);
//    	System.out.println(i);
//  	
//  	}
    
    
//    //测试查询
//    @Test
//    public void selectAskforleaveByNa() {
//		// TODO Auto-generated method stub
//
//	    String name="admin";
//		List<AskforLeave> askforleaveList =askforleaveDao.selectByName(name);
//		System.out.println(askforleaveList);
//	
//	}
//    
    
//    @Test
//    public void addTest() {
//		// TODO Auto-generated method stub
//		
//		IdUtil idUtil=new  IdUtil();
//		Askforleave askforleave=new Askforleave();
//		Integer askforleaveid=idUtil.genItemId();
//		askforleave.setAskForLeaveId(askforleaveid);
//		
//	
//		
//		
//		int i= askforleaveDao.insertSelective(askforleave);
//		System.out.println(i);
//	}

//    @Test
//    public void selectAskforleaveByDate() {
//    	
//        String startDate="";
//        String endDate="";
//        Integer type=1;
//        
//		List<Askforleave> askforleaveList =askforleaveDao.selectAskforleaveByDate(startDate, endDate, type);
//		System.out.println(askforleaveList);
//    }	
	
	
	/*
	@Test
	public void updateAttendance() {
		// TODO Auto-generated method stub
		  Date date = new Date();//获得系统时间.
	      SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
	        String nowTime = sdf.format(date);
	        
//	        long uid=1;
//	        UserAttendance attendance=attendanceDao.selectAttendanceByUserId(1);
	        UserAttendance attendance=new UserAttendance();
	        attendance.setAttendancedate(nowTime);
	        attendance.setSiginBackTime(nowTime);
	        
		int i= attendanceDao.updateByPrimaryKey(attendance);
		System.out.println(i);
	}

	
	@Test
	public void  testJedis() throws Exception{
		
		
		
		Jedis jedis = new  Jedis("127.0.0.1",6379);
		
		jedis.set("123", "1234");
		String string=jedis.get("123");
		System.out.println(string);
		jedis.close();
		
	}
	

	@Test
	public void testJedisPool() throws Exception {
		//创建一个连接池对象，两个参数host、port
		JedisPool jedisPool = new JedisPool("127.0.0.1", 6379);
		//从连接池获得一个连接，就是一个jedis对象。
		Jedis jedis = jedisPool.getResource();
		//使用jedis操作redis
		String string = jedis.get("123");
		System.out.println(string);
		//关闭连接，每次使用完毕后关闭连接。连接池回收资源。
		jedis.close();
		//关闭连接池。
		jedisPool.close();
	}
	
	*/
	/*@Test
	public void queryUserByName() {
		
		CmsUser user=new CmsUser();
		// TODO Auto-generated method stub
       List<CmsUser> userList = userMapper.queryUserByName("admin");
		
		if ( userList != null && !userList.isEmpty() ) {
			CmsUser user1= userList.get(0);
			System.out.println(user1.getuPassword());
		}
		
	}*/
	
	
	
}
