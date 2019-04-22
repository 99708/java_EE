package com.xyq.entity;

public class Student {
	private int sid;
	private String sname;
	private int sage;
	private Teacher teacher;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Student(int sid, String sname, int sage, Teacher teacher) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.teacher = teacher;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", teacher=" + teacher + "]";
	}
	
	
}
