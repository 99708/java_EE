package com.xyq.mapper;

import org.apache.ibatis.annotations.Select;

import com.xyq.entity.User;

/**
 * 用户信息处理
 * @ClassName:  UserMapper   
 * @author: 997 
 * @date:   2018年11月19日 下午8:42:26   
 */
public interface UserMapper {
	@Select("select * from t_user where uname = #{0} and pwd = #{1}")
	User selUserInfo(String uname, String pwd);
}
