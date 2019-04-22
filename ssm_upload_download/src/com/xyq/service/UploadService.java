package com.xyq.service;

import com.xyq.entity.Upload;

public interface UploadService {
	
	/**
	 * 添加上传文件信息
	 * @param: @param upload
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insUploadInfo(Upload upload);
}
