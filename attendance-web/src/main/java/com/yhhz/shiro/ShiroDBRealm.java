package com.yhhz.shiro;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.yhhz.pojo.ActiveUser;
import com.yhhz.pojo.CmsPermission;
import com.yhhz.pojo.CmsUser;
import com.yhhz.service.UserService;



/**
 * 自定义realm
 * @author Administrator
 *
 */

public class ShiroDBRealm extends AuthorizingRealm
{
	 //注入service
        @Autowired
		private UserService userService;
        
        

		// 设置realm的名称
		@Override
		public void setName(String name) {
			super.setName("ShiroDBRealm");
		}

		//realm的认证方法，从数据库查询用户信息
		@Override
		protected AuthenticationInfo doGetAuthenticationInfo(
				AuthenticationToken token) throws AuthenticationException {
			
			// token是用户输入的用户名和密码 
			// 第一步从token中取出用户名
			//从 token中获取用户名和密码
			UsernamePasswordToken userToken=(UsernamePasswordToken) token;
			String username=userToken.getUsername();
			String password=String.valueOf(userToken.getPassword());
        
			//与数据库进行比较
			CmsUser user=userService.queryUserByName(username);

			//判断是否存在，
			if (user == null) 
			{
				return null;
			}
			// 从数据库查询到密码
			String dbPassword=user.getuPassword();
			if (!password.equals(dbPassword))
			{
				throw new IncorrectCredentialsException();
				
			}
			
			
			
			// 如果查询到返回认证信息AuthenticationInfo
			
			ActiveUser activeUser=new ActiveUser();
			activeUser.setUserId(user.getUid());
			activeUser.setUserName(user.getuUsername());
			//..

			AuthenticationInfo info = new SimpleAuthenticationInfo(activeUser, password, getName());
			return info;
		}
		
		

		// 用于授权
		@Override
		protected AuthorizationInfo doGetAuthorizationInfo(
				PrincipalCollection principals) {
			
			//从 principals获取主身份信息
			//将getPrimaryPrincipal方法返回值转为真实身份类型（在上边的doGetAuthenticationInfo认证通过填充到SimpleAuthenticationInfo中身份类型），
			ActiveUser activeUser =  (ActiveUser) principals.getPrimaryPrincipal();
			
			//根据身份信息获取权限信息
			//从数据库获取到权限数据
			List<CmsPermission> permissionList = null;
			try {
				permissionList = userService.findPermissionListByUserId(activeUser.getUserId());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//单独定一个集合对象 
			List<String> permissions = new ArrayList<String>();
			if(permissionList!=null){
				for(CmsPermission cmsPermission:permissionList){
					//将数据库中的权限标签 符放入集合
					permissions.add(cmsPermission.getPercode());
				}
			}
			
			
		/*	List<String> permissions = new ArrayList<String>();
			permissions.add("user:create");//用户的创建
			permissions.add("item:query");//商品查询权限
			permissions.add("item:add");//商品添加权限
			permissions.add("item:edit");//商品修改权限
	*/		//....
			
			//查到权限数据，返回授权信息(要包括 上边的permissions)
			SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
			//将上边查询到授权信息填充到simpleAuthorizationInfo对象中
			simpleAuthorizationInfo.addStringPermissions(permissions);

			return simpleAuthorizationInfo;
		}
		
		//清除缓存
		public void clearCached() {
			PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
			super.clearCache(principals);
		}

	
}
