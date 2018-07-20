package com.yhhz.util;

public class Page {
	private final int pageSize = 3;		//页大小
	private int pageIndex = 0;		//当前页号
	private int totalPageCount = 0;	//总页数
	private int record = 0;			//总记录数
	private Integer nextPage;		//下一页
	private Integer prePage;		//上一页
	
	public int getPageIndex() {
		return pageIndex;
	}
	
	//得到开始记录数
	public int getStartRow() {
		return (this.pageIndex-1)*pageSize;
	}
	
	//得到结束记录数
	public int getEndRow() {
		return pageSize;
	}
	
	//当前页
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
		
		//上一页
		setPrePage();
	}
	
	public int getTotalPageCount() {
		return totalPageCount;
	}
	
	//总页数
	public void setTotalPageCount() {
		this.totalPageCount = (this.record+pageSize-1)/pageSize;
		//下一页
		setNextPage();
	}
	
	public int getRecord() {
		return record;
	}
	
	//总记录数
	public void setRecord(int record) {
		this.record = record;
		//设置总页数
		setTotalPageCount();
	}
	
	public Integer getNextPage() {
		return nextPage;
	}
	
	//设置下一页
	public void setNextPage() {
		this.nextPage = this.pageIndex<this.totalPageCount?this.pageIndex+1:this.pageIndex;
	}
	
	public Integer getPrePage() {
		return prePage;
	}
	
	//设置上一页
	public void setPrePage() {
		this.prePage = this.pageIndex-1<1?1:this.pageIndex-1;
	}
	
	public int getPageSize() {
		return pageSize;
	}

	@Override
	public String toString() {
		return "Page [pageSize=" + pageSize + ", pageIndex=" + pageIndex + ", totalPageCount=" + totalPageCount
				+ ", record=" + record + ", nextPage=" + nextPage + ", prePage=" + prePage + "]";
	}
	
	
}
