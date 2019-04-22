package com.xyq.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.xyq.entity.Page;
import com.xyq.service.LogService;
import com.xyq.service.impl.LogServiceImpl;

/**
 * Servlet implementation class LogServlet
 */
@WebServlet("/logServlet.servlet")
public class LogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请编码格式
		req.setCharacterEncoding("utf-8");
		//设置响应编码格式
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//获取请求数据
		int pn = Integer.parseInt(req.getParameter("pageNum"));
		int ps = Integer.parseInt(req.getParameter("pageSize"));
		//调动service层方法
		LogService logService = new LogServiceImpl();
		Page pageLog = logService.pageLog(pn, ps);
		//转换成json
		Gson gson = new Gson();
		String logJson = gson.toJson(pageLog);
		//响应处理结果
		resp.getWriter().write(logJson);
	}

}
