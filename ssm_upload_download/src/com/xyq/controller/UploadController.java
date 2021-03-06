package com.xyq.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xyq.entity.Email;
import com.xyq.entity.Upload;
import com.xyq.service.EmailService;
import com.xyq.service.UploadService;

@Controller
public class UploadController {
	
	@Resource
	private UploadService uploadService;
	@Resource
	private EmailService emailService;
	
	@RequestMapping("send")
	public String sendEmail(Email email, Upload upload) {
		int num = uploadService.insUploadInfo(upload);
		num += emailService.insEmail(email);
		if(num == 2) {
			return "result";
		}else {
			return "error";
		}
		
	}
}
