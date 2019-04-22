package com.xyq.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.xyq.entity.User;
import com.xyq.service.UserService;

public class UserServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	
	@Override
	public void init() throws ServletException {
		//获取applicationcontext对象
		ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		userService = (UserService) ac.getBean("userService");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请求编码格式
		req.setCharacterEncoding("utf-8");
		//设置响应编码格式
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//获取请求信息
		String uname = req.getParameter("uname");
		String pwd = req.getParameter("pwd");
		//处理请求信息
		User user = userService.findUserByNamePwd(uname, pwd);
		//响应处理结果
		if(user != null) {
			resp.sendRedirect(req.getContextPath()+"/success.jsp");
		}
	}
}
