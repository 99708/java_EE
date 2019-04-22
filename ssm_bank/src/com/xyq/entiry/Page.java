package com.xyq.entiry;

import java.util.List;

import com.xyq.entity.Log;

public class Page {
	private int pageNum;
	private int pageSize;
	private int pageCount;
	private List<Log> logList;
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public List<Log> getLogList() {
		return logList;
	}
	public void setLogList(List<Log> logList) {
		this.logList = logList;
	}
	public Page(int pageNum, int pageSize, int pageCount, List<Log> logList) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.pageCount = pageCount;
		this.logList = logList;
	}
	public Page() {
		super();
	}
	@Override
	public String toString() {
		return "Page [pageNum=" + pageNum + ", pageSize=" + pageSize + ", pageCount=" + pageCount + ", logList="
				+ logList + "]";
	}
	
}
