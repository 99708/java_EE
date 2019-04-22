package com.xyq.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xyq.entity.Flower;

public class Test {
	public static void main(String[] args) throws IOException {
		//获取配置文件流对象
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		//创建SqlSessionFactory工厂对象
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		//获得session对象
		SqlSession session = factory.openSession();
		//查询一条数据
		Flower flower = session.selectOne("com.xyq.mapper.flowerMapper.selF", 1);
		System.out.println(flower);
		
		//多个参数查找
		Flower flower2 = new Flower();
		flower2.setId(1);
		flower2.setName("君子兰");
		Flower flower3 = session.selectOne("com.xyq.mapper.flowerMapper.selF2", flower2);
		System.out.println(flower3);
	}
}
