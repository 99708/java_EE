package com.xyq.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
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
		//设置编码格式
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//获取请求数据
		String uname = req.getParameter("uname");
		String pwd = req.getParameter("pwd");
		//处理请求数据
		User user = userService.findUserByNamePwd(uname, pwd);
		//响应请求
		if(user != null) {
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			resp.sendRedirect(req.getContextPath()+"/success.jsp");
		}
	}
}
