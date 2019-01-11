/**
 * 
 */
package com.wxj.domain.entity;

/**  
* @ClassName: Cell  
* @Description: TODO ��ʽ��
* @author: wxj  
* @date: 2019��1��11��
* @Tel:18772118541
* @email:18772118541@163.com
*/
public class Cell {
	/** �к� */
	private int row;
	/** �к� */
	private int col;
	/** ͼƬ */
	private String picture;
	
	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}
	public Cell() {
	}

	/**  
	* @Title: drop  
	* @Description: TODO ��������
	* @date:2019-01-11 09:16
	*/
	public void drop() {
		row++;
	}
	
	/**  
	* @Title: moveLeft  
	* @Description: TODO   ��ʽ����
	* @date:2019-01-11 09:17
	*/
	public void moveLeft() {
		col--;
	}
	
	/**  
	* @Title: moveLeftByN  
	* @Description: TODO ��������n��λ��
	* @param n   
	* @date:2019-01-11 09:18
	*/
	public void moveLeftByN(int n) {
		col = col -n;
	}
	
	/**  
	* @Title: moveRight  
	* @Description: TODO   ��������
	* @date:2019-01-11 09:19
	*/
	public void moveRight() {
		col ++;
	}
	
	/**  
	* @Title: moveRightByN  
	* @Description: TODO ��������n��
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
