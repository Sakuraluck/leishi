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

	/**
	 * @Title: drop
	 * @Description: TODO 格子下落
	 * @date:2019-01-11 09:16
	 */
	public void drop(Cell[] arr) {
		sortCell(arr);
		for (Cell cell : arr) {
			cell.setRow(cell.getRow() + 1);
			int colLimit = 0;
			if (cell.getRow() > colLimit) {
				cell.setRow(colLimit);
				MyTask.stop = true;
				fd(arr);
				Wall.list.add(arr[0]);
				Wall.list.add(arr[1]);
				Wall.list.add(arr[2]);
				Wall.list.add(arr[3]);
				return;
			}
		}
	}

	/**
	 * @Title: sortCell
	 * @Description: TODO
	 * @param arr
	 * @date:2019-01-11 13:04
	 */
	private void sortCell(Cell[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length - 1 - i; i++) {
				if (arr[j].getRow() < arr[j + 1].getRow()) {
					Cell temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * @Title: getColLimit
	 * @Description: TODO
	 * @param cell
	 * @return
	 * @date:2019-01-11 12:23
	 */
	

	public void fd(Cell[] arr) {
		//找到每一列最大的那个位置作为最后记录的位置
		Map<Integer,Integer> cellMap = new HashMap<Integer,Integer>();
		for (Cell cell : arr) {
			if(!cellMap.containsKey(cell.getCol())) {
				cellMap.put(cell.getCol(),cell.getRow());
			}else {
				Integer row = cellMap.get(cell.getCol());
				if(row<cell.getRow()) {
					cellMap.put(cell.getCol(),cell.getRow());
				}
			}
		}
		
		Set<Entry<Integer,Integer>> entrySet = cellMap.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			if (key == 0) {
				Wall.minHight0 = value;
			} else if (key == 1) {
				Wall.minHight1 = value;
			} else if (key == 2) {
				Wall.minHight2 = value;
			} else if (key == 3) {
				Wall.minHight3 = value;
			} else if (key == 4) {
				Wall.minHight4 = value;
			} else if (key == 5) {
				Wall.minHight5 = value;
			} else if (key == 6) {
				Wall.minHight6 = value;
			} else if (key == 7) {
				Wall.minHight7 = value;
			} else if (key == 8) {
				Wall.minHight8 = value;
			} else if (key == 9) {
				Wall.minHight9 = value;
			}
		}
	}

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
