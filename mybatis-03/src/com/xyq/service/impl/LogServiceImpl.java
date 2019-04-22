package com.xyq.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xyq.entity.Log;
import com.xyq.entity.Page;
import com.xyq.mapper.LogMapper;
import com.xyq.service.LogService;

public class LogServiceImpl implements LogService {

	@Override
	public Page pageLog(int pn, int ps) throws IOException {
		//获取SqlSession对象
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		//获取mapper实例化对象
		LogMapper logMapper = session.getMapper(LogMapper.class);
		//进行相关处理
		int pageCount;
		int pages;
		int startPage;
		
		pageCount = logMapper.getCount();
		pages = (int) Math.ceil(pageCount*1.0/ps);
		startPage = (pn - 1)*ps;
		List<Log> logList = logMapper.pageLog(startPage, ps);
		Page page = new Page(pn, pageCount, ps, pages, startPage, logList);
		return page;
	}

}
