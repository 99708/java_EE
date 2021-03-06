package com.xyq.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xyq.entity.Account;
import com.xyq.mapper.AccountMapper;
import com.xyq.mapper.LogMapper;
import com.xyq.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService{

	@Resource
	private AccountMapper accountMappera;
	@Resource
	private LogMapper logMapper;
	
	@Override
	public Account getAccountById(int aid) {
		return accountMappera.getAccountById(aid);
	}

	@Override
	public Account getAccountByIdPwd(int aid, String apwd) {
		return accountMappera.getAccountByIdPwd(aid, apwd);
	}

	@Override
	public Account getAccountByIdName(int aid, String aname) {
		return accountMappera.getAccountByIdName(aid, aname);
	}

	@Override
	public Account getAccountByIdPwdMoney(int aid, String apwd, double money) {
		return accountMappera.getAccountByIdPwdMoney(aid, apwd, money);
	}

	@Override
	public int transferAccount(int aid, int inId, double money) {
		int i = accountMappera.transferAccount(aid, -money);
		i += accountMappera.transferAccount(inId, money);
		i += logMapper.insertLog(aid, inId, money);
		return i;
	}

}
