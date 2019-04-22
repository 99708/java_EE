package com.xyq.entity;

import java.util.List;

public class Page {
	private int pageNum;
	private int pageCount;
	private int pageSize;
	private int pages;
	private int startPage;
	List<Log> ll;
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public List<Log> getLl() {
		return ll;
	}
	public void setLl(List<Log> ll) {
		this.ll = ll;
	}
	public Page(int pageNum, int pageCount, int pageSize, int pages, int startPage, List<Log> ll) {
		super();
		this.pageNum = pageNum;
		this.pageCount = pageCount;
		this.pageSize = pageSize;
		this.pages = pages;
		this.startPage = startPage;
		this.ll = ll;
	}
	public Page() {
		super();
	}
	@Override
	public String toString() {
		return "Page [pageNum=" + pageNum + ", pageCount=" + pageCount + ", pageSize=" + pageSize + ", pages=" + pages
				+ ", startPage=" + startPage + ", ll=" + ll + "]";
	}
	
	
}
