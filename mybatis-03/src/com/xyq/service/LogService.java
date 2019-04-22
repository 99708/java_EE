package com.xyq.service;

import java.io.IOException;

import com.xyq.entity.Page;

public interface LogService {
	/**
	 * 分页查询日志表信息
	 * @param pn
	 * @param ps
	 * @return
	 * @throws IOException 
	 */
	Page pageLog(int pn, int ps) throws IOException;
}
