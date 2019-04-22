package com.xyq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.xyq.entity.Log;

public interface LogMapper {
	/**
	 * 分页查询
	 * @param startPage
	 * @param pageSize
	 * @return
	 */
	@Select("select * from log limit #{0}, #{1}")
	List<Log> pageLog(int startPage, int pageSize);
	/**
	 * 查询总的记录数
	 * @return
	 */
	@Select("select count(*) from log")
	int getCount();
	/**
	 * 插入转账记录
	 * @param tid
	 * @param aid
	 * @param money
	 * @return
	 */
	@Insert("insert into log values(#{0}, #{1}, #{2})")
	int insertLog(int tid, int aid, double money);
}
