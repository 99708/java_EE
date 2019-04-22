package com.xyq.service;

import com.xyq.entity.User;

public interface UserService {
	User findUserByNamePwd(String uname, String pwd);
}
