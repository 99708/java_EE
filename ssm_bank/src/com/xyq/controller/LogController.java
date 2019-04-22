package com.xyq.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.xyq.entiry.Page;
import com.xyq.service.LogService;

@Controller
public class LogController {
	
	@Resource
	private LogService logServiceImpl;
	
	@RequestMapping("pageLog")
	public void pageLog(int pageNum, int pageSize, HttpServletResponse resp) throws IOException {
		Page pageLog = logServiceImpl.pageLog(pageNum, pageSize);
		resp.getWriter().write(new Gson().toJson(pageLog));
	}

}
