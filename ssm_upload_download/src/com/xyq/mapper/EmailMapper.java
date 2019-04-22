package com.xyq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.xyq.entity.Email;
import com.xyq.entity.User;

/**
 * 邮件处理
 * @ClassName:  EmailMapper   
 * @author: 997 
 * @date:   2018年11月19日 下午9:33:28   
 *
 */
public interface EmailMapper {
	/**
	 * 插入邮件信息
	 * @param: @param email
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	@Insert("insert into email values(default, #{title}, #{sendtime}, #{senduid}, #{reciveuid})")
	int insEmail(Email email);
	
	/**
	 * 查询用户的收件信息
	 * @param: @param user
	 * @param: @return      
	 * @return: List<Email>      
	 * @throws
	 */
	@Select("select * from email where reciveuid = #{uid}")
	List<Email> selEmailByUid(User user);
}
