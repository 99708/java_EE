package com.xyq.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.xyq.entity.Account;

public interface AccountMapper {

	/**
	 * 根据id获取账户信息
	 * @param aid
	 * @return
	 */
	@Select("select * from money where aid = #{0}")
	Account getAccountById(int aid);
	
	/**
	 * 根据用户id和密码查找账户信息
	 * @param aid
	 * @param apwd
	 * @return
	 */
	@Select("select * from money where aid = #{0} and apwd = #{1}")
	Account getAccountByIdPwd(int aid, String apwd);
	
	/**
	 * 根据用户id和姓名查询用户信息
	 * @param aid
	 * @param aname
	 * @return
	 */
	@Select("select * from money where aid = #{0} and aname = #{1}")
	Account getAccountByIdName(int aid, String aname);
	
	/**
	 * 根据用户id和用户密码和用户金额查询用户信息
	 * @param aid
	 * @param apwd
	 * @param money
	 * @return
	 */
	@Select("select * from money where aid = #{0} and apwd = #{1} and money >= #{2}")
	Account getAccountByIdPwdMoney(int aid, String apwd, double money);
	
	/**
	 * 转账
	 * @param aid
	 * @param money
	 * @return
	 */
	@Update("update money set money = money + #{1} where aid = #{0}")
	int transferAccount(int aid, double money);
	
}
