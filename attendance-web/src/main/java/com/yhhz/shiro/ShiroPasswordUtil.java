package com.yhhz.shiro;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 *  统一密码加密工具类
 * @author zoujinyin
 *
 */
public class ShiroPasswordUtil {

	/**
	 *  获取加盐并且循环多次散列值的密码
	 * 
	 * @author zoujinyin
	 * 
	 */
	public static String getShiroPassword(String password, String salt, int hashCount) {
		return new Md5Hash(password, salt, hashCount).toString();
	}
	
	
}
