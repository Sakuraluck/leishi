package com.wxj.domain.entity;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
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

	@Override
	public String toString() {
		return "Cell [row=" + row + ", col=" + col + "]";
	}

	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public Cell() {
	}
	public void drop() {
		row++;
		if(row>=19) {
			row = 19;
		}
	}
	/**
	 * @Title: getColLimit
	 * @Description: TODO
	 * @param cell
	 * @return
	 * @date:2019-01-11 12:23
	 */
	


	/**
	 * @Title: moveLeft
	 * @Description: TODO 格式左移
	 * @date:2019-01-11 09:17
	 */
	public void moveLeft() {
		col--;
		if (col < 0) {
			col = 0;
		}
	}

	/**
	 * @Title: moveLeftByN
	 * @Description: TODO 格子左移n格位置
	 * @param n
	 * @date:2019-01-11 09:18
	 */
	public void moveLeftByN(int n) {
		col = col - n;
		if (col < 0) {
			col = 0;
		}
	}

	/**
	 * @Title: moveRight
	 * @Description: TODO 格子右移
	 * @date:2019-01-11 09:19
	 */
	public void moveRight() {
		col++;
		if (col > 9) {
			col = 9;
		}
	}

	/**
	 * @Title: moveRightByN
	 * @Description: TODO 格子右移n格
	 * @param n
	 * @date:2019-01-11 09:20
	 */
	public void moveRightByN(int n) {
		col = col + n;
		if (col > 9) {
			col = 9;
		}
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
