package com.xyq.service.impl;

import com.xyq.entity.User;
import com.xyq.mapper.UserMapper;
import com.xyq.service.UserService;

public class UserServiceImpl implements UserService{

	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public User findUserByNamePwd(String uname, String pwd) {
		
		return userMapper.getUserByNamePwd(uname, pwd);
	}

}
