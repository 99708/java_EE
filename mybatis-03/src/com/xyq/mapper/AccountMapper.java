package com.xyq.mapper;

import com.xyq.entity.Account;

public interface AccountMapper {
	/**
	 * 根据id和密码查询账户信息
	 * @param id
	 * @param pwd
	 * @return
	 */
	Account getAccountByIdPwd(int id, String pwd);
	/**
	 * 根据id和姓名查询账户信息
	 * @param id
	 * @param name
	 * @return
	 */
	Account getAccountByIdName(int id, String name);
	/**
	 * 更新用户信息表
	 * @param outac
	 * @param inac
	 * @return
	 */
	int updateAccountMoney(Account account);
}
