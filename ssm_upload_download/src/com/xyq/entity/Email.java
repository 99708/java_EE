package com.xyq.entity;

public class Email {
	
	private int eid;
	private String title;
	private String sendtime;
	private int senduid;
	private int reciveuid;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSendtime() {
		return sendtime;
	}
	public void setSendtime(String sendtime) {
		this.sendtime = sendtime;
	}
	public int getSenduid() {
		return senduid;
	}
	public void setSenduid(int senduid) {
		this.senduid = senduid;
	}
	public int getReciveuid() {
		return reciveuid;
	}
	public void setReciveuid(int reciveuid) {
		this.reciveuid = reciveuid;
	}
	public Email(int eid, String title, String sendtime, int senduid, int reciveuid) {
		super();
		this.eid = eid;
		this.title = title;
		this.sendtime = sendtime;
		this.senduid = senduid;
		this.reciveuid = reciveuid;
	}
	public Email() {
		super();
	}
	@Override
	public String toString() {
		return "Email [eid=" + eid + ", title=" + title + ", sendtime=" + sendtime + ", senduid=" + senduid
				+ ", reciveuid=" + reciveuid + "]";
	}
	
	
}
