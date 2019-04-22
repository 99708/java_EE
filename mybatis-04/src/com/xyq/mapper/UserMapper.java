package com.xyq.mapper;

import java.util.List;

import com.xyq.entity.User;

public interface UserMapper {
	List<User> getUserByNamePhone(String uname, String uphone);
}
