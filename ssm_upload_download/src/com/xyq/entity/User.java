package com.xyq.entity;

/**
 * 用户实体类
 * @ClassName:  User   
 * @Description:TODO(存储用户信息的实体类)   
 * @author: 997 
 * @date:   2018年11月19日 下午8:37:30   
 *
 */
public class User {
	
	private int uid;
	private String uname;
	private String pwd;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public User(int uid, String uname, String pwd) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.pwd = pwd;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", pwd=" + pwd + "]";
	}
	
	
	
}
