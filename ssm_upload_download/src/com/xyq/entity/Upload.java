package com.xyq.entity;

public class Upload {
	private int upid;
	private String oldname;
	private String newname;
	private String type;
	public int getUpid() {
		return upid;
	}
	public void setUpid(int upid) {
		this.upid = upid;
	}
	public String getOldname() {
		return oldname;
	}
	public void setOldname(String oldname) {
		this.oldname = oldname;
	}
	public String getNewname() {
		return newname;
	}
	public void setNewname(String newname) {
		this.newname = newname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Upload() {
		super();
	}
	public Upload(int upid, String oldname, String newname, String type) {
		super();
		this.upid = upid;
		this.oldname = oldname;
		this.newname = newname;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Upload [upid=" + upid + ", oldname=" + oldname + ", newname=" + newname + ", type=" + type + "]";
	}

}
