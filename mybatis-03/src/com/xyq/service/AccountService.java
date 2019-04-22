package com.xyq.service;

import java.io.IOException;

import com.xyq.entity.Account;

public interface AccountService {
	
	/**
	 * 转账账户和密码不匹配
	 */
	int ACCOUNT_OUT_ID_PWD_ERROR = 1;
	
	/**
	 * 余额不足
	 */
	int ACCOUNT_MONERY_ERROT = 3;
	/**
	 * 入账账户和姓名不匹配
	 */
	int ACCOUNT_IN_ID_NAME_ERROR = 5;
	/**
	 * 转账失败
	 */
	int ACCOUNT_ERROR = 7;
	/**
	 * 转账成功
	 */
	int ACCOUNT_SUCCESS = 2;
	
	/**
	 * 转账操作
	 * @param outac
	 * @param inac
	 * @return
	 * @throws IOException 
	 */
	int account(Account outac, Account inac) throws IOException ;
}
