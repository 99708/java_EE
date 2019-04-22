package com.xyq.mapper;

import org.apache.ibatis.annotations.Insert;

import com.xyq.entity.Upload;

/**
 * 上传处理
 * @author: 997 
 * @date:   2018年11月19日 下午10:04:44   
 */
public interface UploadMapper {
	
	/**
	 * 添加上传文件信息
	 * @param: @param upload
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	@Insert("insert into upload values(defualt, #{uid}, #{oldname}, #{newname}, #{type}, now())")
	int insUploadInfo(Upload upload);
}
