package com.xyq.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xyq.entity.Account;
import com.xyq.service.AccountService;

@Controller
public class AccountController {
	
	@Resource
	private AccountService accountServicei;
	
	@RequestMapping("getAccountById")
	public void getAccountById(int aid, HttpServletResponse resp) throws IOException {
		Account account = accountServicei.getAccountById(aid);
		sendRequest(account, resp);
	}
	
	private void sendRequest(Account account, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/json");
		if(account != null) {
			resp.getWriter().println(true);
		}else {
			resp.getWriter().println(false);
		}
	}
	
	@RequestMapping("getAccountByIdPwd")
	public void getAccountByIdPwd(int aid, String apwd, HttpServletResponse resp) throws IOException {
		Account account = accountServicei.getAccountByIdPwd(aid, apwd);
		sendRequest(account, resp);
	}
	
	@RequestMapping("getAccountByIdName")
	public void getAccountByIdName(int inId, String aname, HttpServletResponse resp) throws IOException {
		Account account = accountServicei.getAccountByIdName(inId, aname);
		sendRequest(account, resp);
	}

	@RequestMapping("getAccountByIdPwdMoney")
	public void getAccountByIdPwdMoney(int aid, String apwd, double money, HttpServletResponse resp) throws IOException {
		Account account = accountServicei.getAccountByIdPwdMoney(aid, apwd, money);
		sendRequest(account, resp);
	}

	@RequestMapping("transferAccount")
	public String String (int aid, int inId, double money) {
		int aum = accountServicei.transferAccount(aid, inId, money);
		if(aum == 3) {
			return "/log";
		}else {
			return "redirect:/index.jsp";
		}
		
	}

}
