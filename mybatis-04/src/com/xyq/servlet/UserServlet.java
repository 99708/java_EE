package com.xyq.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.xyq.entity.User;
import com.xyq.service.UserService;
import com.xyq.service.impl.UserServiceImpl;

@WebServlet(value="/userServlet.servlet")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请求编码
		req.setCharacterEncoding("utf-8");
		//设置响应编码
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//获取请求数据
		String uname = req.getParameter("uname");
		String uphone = req.getParameter("uphone");
		//处理请求
		UserService userService = new UserServiceImpl();
		List<User> users = userService.findUserByNamePhone(uname, uphone);
		//响应处理结果
		if(users != null) {
			resp.getWriter().write(new Gson().toJson(users));
		}
	}
}
