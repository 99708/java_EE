package com.xyq.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xyq.entity.User;
import com.xyq.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userServiceImpl;
	
	@RequestMapping("login")
	public String loginUser(String uname, String pwd, HttpServletRequest req) {
		User user = userServiceImpl.selUserInfoService(uname, pwd);
		if(user != null) {
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			return "main";
		}
		return "redirect:login.jsp";
	}
}
