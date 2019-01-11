package com.wxj.domain.entity;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
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
	 * @Description: TODO ��ʽ����
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
	 * @Description: TODO ��������n��λ��
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
	 * @Description: TODO ��������
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
	 * @Description: TODO ��������n��
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
