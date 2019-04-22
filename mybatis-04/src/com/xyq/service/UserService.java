package com.xyq.service;

import java.io.IOException;
import java.util.List;

import com.xyq.entity.User;

public interface UserService {
	List<User> findUserByNamePhone(String uname, String uphone)throws IOException;
}
