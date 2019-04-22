package com.xyq.mapper;

import com.xyq.entity.User;

public interface UserMapper {

	/**
	 * 通过密码和姓名查找用户信息
	 * @param uname
	 * @param pwd
	 * @return
	 */
	User getUserByNamePwd(String uname, String pwd);
}
