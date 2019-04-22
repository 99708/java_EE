package com.xyq.entity;

public class Account {
	private int id;
	private String name;
	private double money;
	private String pwd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Account(int id, String name, double money, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
		this.pwd = pwd;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", money=" + money + ", pwd=" + pwd + "]";
	}
}
