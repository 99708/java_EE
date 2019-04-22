package com.xyq.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.xyq.entity.User;

public class MyRound implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		User user = null;
		Object[] arguments = mi.getArguments();
		System.out.println(arguments[0]+"要登录系统");
		if(arguments.length == 2) {
			user = (User) mi.proceed();
			if(user != null) {
				System.out.println(user.getUname()+"登录了");
			}else {
				System.out.println("用户名或密码错误");
			}
		}else {
			System.out.println("用户名或密码不能为空");
		}
		
		return user;
	}

}
