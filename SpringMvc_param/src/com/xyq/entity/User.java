package com.xyq.entity;

/**
 * 用户信息实体类
 * @author Dell
 *
 */
public class User {
	private int age;//用户年龄
	private String name;//用户姓名
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}
	
}
