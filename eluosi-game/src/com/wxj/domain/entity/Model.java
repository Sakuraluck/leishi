package com.wxj.domain.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**  
* @ClassName: Model  
* @Description: TODO 小格子结合起来的块儿
* @author: wxj  
* @date: 2019年1月11日
* @Tel:18772118541
* @email:18772118541@163.com
*/
public class Model {
	private Cell ce0;
	private Cell ce1;
	private Cell ce2;
	private Cell ce3;
	public Cell getCe0() {
		return ce0;
	}
	public void setCe0(Cell ce0) {
		this.ce0 = ce0;
	}
	public Cell getCe1() {
		return ce1;
	}
	public void setCe1(Cell ce1) {
		this.ce1 = ce1;
	}
	public Cell getCe2() {
		return ce2;
	}
	public void setCe2(Cell ce2) {
		this.ce2 = ce2;
	}
	public Cell getCe3() {
		return ce3;
	}
	public void setCe3(Cell ce3) {
		this.ce3 = ce3;
	}
	public Model(Cell ce0, Cell ce1, Cell ce2, Cell ce3) {
		super();
		this.ce0 = ce0;
		this.ce1 = ce1;
		this.ce2 = ce2;
		this.ce3 = ce3;
	}
	public Model() {
	}
	
	public void drop(Model model) {
		int colLimit0 = getColLimit(ce0);
		int colLimit1 = getColLimit(ce1);
		int colLimit2 = getColLimit(ce2);
		int colLimit3 = getColLimit(ce3);
		if(ce3.getRow() >=colLimit3 ||
				ce2.getRow() >=colLimit2 ||
				ce1.getRow() >=colLimit1 ||
				ce0.getRow() >=colLimit0) {
			MyTask.stop = true;
			recordMinCol(model);
			Wall.list.add(ce0);
			Wall.list.add(ce1);
			Wall.list.add(ce2);
			Wall.list.add(ce3);
			return;
		}
		ce0.setRow(ce0.getRow()+1);
		ce1.setRow(ce1.getRow()+1);
		ce2.setRow(ce2.getRow()+1);
		ce3.setRow(ce3.getRow()+1);
	}
	
	public void recordMinCol(Model model) {
		//找到每一列最大的那个位置作为最后记录的位置
		Map<Integer,Integer> cellMap = new HashMap<Integer,Integer>();
		Cell[] arr = {model.getCe0(),model.getCe1(),model.getCe2(),model.getCe3()};
		for (Cell cell : arr) {
			if(!cellMap.containsKey(cell.getCol())) {
				cellMap.put(cell.getCol(),cell.getRow());
			}else {
				//原来的，如果 小于原来的，那就替换掉原来的
				Integer row = cellMap.get(cell.getCol());
				if(row>cell.getRow()) {
					cellMap.put(cell.getCol(),cell.getRow());
				}
			}
		}
		
		Set<Entry<Integer,Integer>> entrySet = cellMap.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			if (key == 0) {
				Wall.minHight0 = value>Wall.minHight0?Wall.minHight0:value-1;
			} else if (key == 1) {
				Wall.minHight1 = value>Wall.minHight1?Wall.minHight1:value-1;
			} else if (key == 2) {
				Wall.minHight2 = value>Wall.minHight2?Wall.minHight2:value-1;
			} else if (key == 3) {
				Wall.minHight3 = value>Wall.minHight3?Wall.minHight3:value-1;
			} else if (key == 4) {
				Wall.minHight4 = value>Wall.minHight4?Wall.minHight4:value-1;
			} else if (key == 5) {
				Wall.minHight5 = value>Wall.minHight5?Wall.minHight5:value-1;
			} else if (key == 6) {
				Wall.minHight6 = value>Wall.minHight6?Wall.minHight6:value-1;
			} else if (key == 7) {
				Wall.minHight7 = value>Wall.minHight7?Wall.minHight7:value-1;
			} else if (key == 8) {
				Wall.minHight8 = value>Wall.minHight8?Wall.minHight8:value-1;
			} else if (key == 9) {
				Wall.minHight9 = value>Wall.minHight9?Wall.minHight9:value-1;
			}
		}
	}
	private int getColLimit(Cell cell) {
		int limit = 0;
		if (cell.getCol() == 0) {
			limit = Wall.minHight0;
		} else if (cell.getCol() == 1) {
			limit = Wall.minHight1;
		} else if (cell.getCol() == 2) {
			limit = Wall.minHight2;
		} else if (cell.getCol() == 3) {
			limit = Wall.minHight3;
		} else if (cell.getCol() == 4) {
			limit = Wall.minHight4;
		} else if (cell.getCol() == 5) {
			limit = Wall.minHight5;
		} else if (cell.getCol() == 6) {
			limit = Wall.minHight6;
		} else if (cell.getCol() == 7) {
			limit = Wall.minHight7;
		} else if (cell.getCol() == 8) {
			limit = Wall.minHight8;
		} else if (cell.getCol() == 9) {
			limit = Wall.minHight9;
		}
		return limit;
	}
}
