package com.xyq.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xyq.entity.Upload;
import com.xyq.mapper.UploadMapper;
import com.xyq.service.UploadService;

@Service
public class UploadServiceImpl implements UploadService {

	@Resource
	private UploadMapper uploadmapper;
	
	@Override
	public int insUploadInfo(Upload upload) {
		return uploadmapper.insUploadInfo(upload);
	}

}
