package com.xyq.service;

import com.xyq.entity.Account;

public interface AccountService {

	/**
	 * 根据id获取账户信息
	 * @param aid
	 * @return
	 */
	Account getAccountById(int aid);
	
	/**
	 * 根据用户id和密码查找账户信息
	 * @param aid
	 * @param apwd
	 * @return
	 */
	Account getAccountByIdPwd(int aid, String apwd);
	
	/**
	 * 根据用户id和姓名查询用户信息
	 * @param aid
	 * @param aname
	 * @return
	 */
	Account getAccountByIdName(int aid, String aname);
	
	/**
	 * 根据用户id和用户密码和用户金额查询用户信息
	 * @param aid
	 * @param apwd
	 * @param money
	 * @return
	 */
	Account getAccountByIdPwdMoney(int aid, String apwd, double money);
	
	/**
	 * 转账
	 * @param aid
	 * @param money
	 * @return
	 */
	int transferAccount(int aid, int inId, double money);
}
