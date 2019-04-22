package com.xyq.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xyq.entity.Account;
import com.xyq.service.AccountService;
import com.xyq.service.impl.AccountServiceImpl;

/**
 * Servlet implementation class MoneyServlet
 */
@WebServlet("/moneyServlet.servlet")
public class MoneyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请编码格式
		req.setCharacterEncoding("utf-8");
		//设置响应编码格式
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//获取请求数据
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		double money = Double.parseDouble(req.getParameter("money"));
		int inId = Integer.parseInt(req.getParameter("inId"));
		String pwd = req.getParameter("pwd");
		
		Account outac = new Account();
		outac.setId(id);
		outac.setPwd(pwd);
		outac.setMoney(money);
		
		Account inac = new Account();
		inac.setId(inId);
		inac.setName(name);
		inac.setMoney(money);
		//处理请求
		//调用service层方法
		AccountService accountService = new AccountServiceImpl();
		int num = accountService.account(outac, inac);
		//响应请求
		if(num == 2){
			resp.sendRedirect(req.getContextPath()+"/log.jsp");
		}else {
			HttpSession session = req.getSession();
			session.setAttribute("flag", num);
			resp.sendRedirect(req.getContextPath()+"/error.jsp");
		}
	}

}
