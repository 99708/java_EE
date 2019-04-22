package com.xyq.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {
	public static void main(String[] args) throws IOException {
		//获取配置文件流对象
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		//创建SQLSessionFactory对象
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		//获取SQLSession对象
		SqlSession session = factory.openSession();
		//使用session进行查询
		List<Object> list = session.selectList("com.xyq.mapper.flowerMapper.selF");
		System.out.println(list);
	}
}
