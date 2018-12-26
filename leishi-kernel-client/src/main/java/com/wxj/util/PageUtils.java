package com.wxj.util;

import java.util.List;

/**  
* @ClassName: PageUtils  
* @Description: TODO 分页工具类
* @author: wxj  
* @date: 2018-12-26 22:40
* @Tel:18772118541
* @email:18772118541@163.com
*/
public class PageUtils<T> {
	/** 当前页 **/
	private Integer pageIndex = 1;
	/** 总页数 **/
	private Integer totalPage;
	/** 数据总条数 **/
	private Integer totalCount;
	/** 开始位置 **/
	private Integer begin;
	/**页面大小 **/
	private Integer pageSize;
	/** 任意数据的集合 **/
	private List<T> list;
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		initBegin();
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
		initTotalPage();
	}
	public Integer getBegin() {
		return begin;
	}
	public void setBegin(Integer begin) {
		this.begin = begin;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		initTotalPage();
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	/**  
	* @Title: initBegin  
	* @Description: TODO  计算初始化开始位置 
	* @return void
	* @date:2018-12-26 22:50
	*/
	public void initBegin(){
		 this.begin = (this.pageIndex -1)*this.pageSize;
	}
	
	/**  
	* @Title: initTotalPage  
	* @Description: TODO  计算总页数 
	* @return void
	* @date:2018-12-26 22:50
	*/
	public void initTotalPage(){
		if(this.totalCount % this.pageSize == 0){
			this.totalPage = this.totalCount / this.pageSize;
		}else{
			this.totalPage = (this.totalCount / this.pageSize) +1;
		}
	}
}
