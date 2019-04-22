package com.xyq.entity;

import java.util.List;

public class Teacher {
	private int tid;
	private String tname;
	private List<Student> ls;
	
	public Teacher(int tid, String tname, List<Student> ls) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.ls = ls;
	}
	public Teacher() {
		super();
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public List<Student> getLs() {
		return ls;
	}
	public void setLs(List<Student> ls) {
		this.ls = ls;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", ls=" + ls + "]";
	}
	
	
	
	
	
}
