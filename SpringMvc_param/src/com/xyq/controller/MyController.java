package com.xyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xyq.entity.User;

/**
 * 控制器类
 * @author Dell
 *
 */
@Controller
public class MyController {

	/**
	 * 单元方法
	 * @return
	 */
	@RequestMapping(value="demo")
	public String demo() {
		System.out.println("无参");
		return "index.jsp";
	}
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value="demo1")
	public String demo1(User user) {
		System.out.println("有参"+user.getAge()+" : "+user.getName());
		return "index.jsp";
	}
}
