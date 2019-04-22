package com.xyq.entity;

public class Log {
	private int outid;
	private int inid;
	private double money;
	public int getOutid() {
		return outid;
	}
	public void setOutid(int outid) {
		this.outid = outid;
	}
	public int getInid() {
		return inid;
	}
	public void setInid(int inid) {
		this.inid = inid;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Log(int outid, int inid, double money) {
		super();
		this.outid = outid;
		this.inid = inid;
		this.money = money;
	}
	public Log() {
		super();
	}
	@Override
	public String toString() {
		return "Log [outid=" + outid + ", inid=" + inid + ", money=" + money + "]";
	}
	
	
}
