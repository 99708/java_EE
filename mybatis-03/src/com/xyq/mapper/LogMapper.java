package com.xyq.mapper;

import java.util.List;

import com.xyq.entity.Log;

public interface LogMapper {
	/**
	 * 插入日志信息
	 * @param log
	 * @return
	 */
	int inserLog(Log log);
	/**
	 * 查询总记录数
	 * @return
	 */
	int getCount();
	/**
	 * 分页查询log信息
	 * @param startPage
	 * @param pageSize
	 * @return
	 */
	List<Log> pageLog(int startPage, int pageSize);
	
}
