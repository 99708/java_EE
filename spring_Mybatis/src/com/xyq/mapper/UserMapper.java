package com.xyq.mapper;

import com.xyq.entity.User;

public interface UserMapper {
	User getUserByNamePwd(String name, String pwd);
}
