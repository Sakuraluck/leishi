/**
 * 
 */
package com.wxj.domain.entity;

/**  
* @ClassName: Cell  
* @Description: TODO 格式类
* @author: wxj  
* @date: 2019年1月11日
* @Tel:18772118541
* @email:18772118541@163.com
*/
public class Cell {
	/** 行号 */
	private int row;
	/** 列号 */
	private int col;
	/** 图片 */
	private String picture;
	
	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}
	public Cell() {
	}

	/**  
	* @Title: drop  
	* @Description: TODO 格子下落
	* @date:2019-01-11 09:16
	*/
	public void drop() {
		row++;
	}
	
	/**  
	* @Title: moveLeft  
	* @Description: TODO   格式左移
	* @date:2019-01-11 09:17
	*/
	public void moveLeft() {
		col--;
	}
	
	/**  
	* @Title: moveLeftByN  
	* @Description: TODO 格子左移n格位置
	* @param n   
	* @date:2019-01-11 09:18
	*/
	public void moveLeftByN(int n) {
		col = col -n;
	}
	
	/**  
	* @Title: moveRight  
	* @Description: TODO   格子右移
	* @date:2019-01-11 09:19
	*/
	public void moveRight() {
		col ++;
	}
	
	/**  
	* @Title: moveRightByN  
	* @Description: TODO 格子右移n格
	* @param n   
	* @date:2019-01-11 09:20
	*/
	public void moveRightByN(int n) {
		col = col+n;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
}
