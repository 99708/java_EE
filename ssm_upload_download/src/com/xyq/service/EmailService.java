package com.xyq.service;

import java.util.List;

import com.xyq.entity.Email;
import com.xyq.entity.User;

public interface EmailService {
	/**
	 * 邮件处理
	 * @param: @param email
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insEmail(Email email);
	
	/**
	 * 查询用户的收件信息
	 * @param: @param user
	 * @param: @return      
	 * @return: List<Email>      
	 * @throws
	 */
	List<Email> selEmailByUid(User user);
}
