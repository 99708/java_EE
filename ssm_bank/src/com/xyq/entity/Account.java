package com.xyq.entity;

public class Account {
	private int aid;
	private String aname;
	private double money;
	private String apwd;
	
	public Account(int aid, String aname, double money, String apwd) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.money = money;
		this.apwd = apwd;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", aname=" + aname + ", money=" + money + ", apwd=" + apwd + "]";
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getApwd() {
		return apwd;
	}
	public void setApwd(String apwd) {
		this.apwd = apwd;
	}
	
}
