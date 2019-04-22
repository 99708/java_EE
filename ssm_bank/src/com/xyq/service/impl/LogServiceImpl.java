package com.xyq.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xyq.entiry.Page;
import com.xyq.entity.Log;
import com.xyq.mapper.LogMapper;
import com.xyq.service.LogService;

@Service
public class LogServiceImpl implements LogService{

	@Resource
	private LogMapper logMapper;
	@Override
	public Page pageLog(int numPage, int pageSize) {
		int startPage = (numPage - 1)*pageSize;
		List<Log> logList = logMapper.pageLog(startPage, pageSize);
		int count = logMapper.getCount();
		int pageCount = (int) Math.ceil(count*1.0/pageSize);
		Page page = new Page(numPage, pageSize, pageCount, logList);
		return page;
	}

}
