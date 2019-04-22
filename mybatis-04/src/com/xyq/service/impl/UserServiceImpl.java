package com.xyq.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xyq.entity.User;
import com.xyq.mapper.UserMapper;
import com.xyq.service.UserService;

public class UserServiceImpl implements UserService{

	
	@Override
	public List<User> findUserByNamePhone(String uname, String uphone) throws IOException {
		//获取SQLSession对象
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		//获取mapper实例化对象
		UserMapper userMapper = session.getMapper(UserMapper.class);
		return userMapper.getUserByNamePhone(uname, uphone);
	}

}
