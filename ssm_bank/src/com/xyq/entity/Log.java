package com.xyq.entity;

public class Log {
	private int tid;//转账账号
	private int aid;//入账账号
	private double money;//转账金额
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Log(int tid, int aid, double money) {
		super();
		this.tid = tid;
		this.aid = aid;
		this.money = money;
	}
	public Log() {
		super();
	}
	@Override
	public String toString() {
		return "Log [tid=" + tid + ", aid=" + aid + ", money=" + money + "]";
	}
	
	
}
