package com.xyq.entity;

public class User {
	private int uid;
	private String uname;
	private String uphone;
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
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public User(int uid, String uname, String uphone) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uphone = uphone;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uphone=" + uphone + "]";
	}
	
	
	
}
