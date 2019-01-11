package com.wxj.domain.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.wxj.task.MyTask;

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
	public void moveLeft(Model model) {
		model.getCe0().moveLeft();
		model.getCe1().moveLeft();
		model.getCe2().moveLeft();
		model.getCe3().moveLeft();
	}
	public void moveRight(Model model) {
		model.getCe0().moveRight();
		model.getCe1().moveRight();
		model.getCe2().moveRight();
		model.getCe3().moveRight();
	}
	public void drop(Model model) {
		int colLimit0 = getColLimit(model.getCe0());
		int colLimit1 = getColLimit(model.getCe1());
		int colLimit2 = getColLimit(model.getCe2());
		int colLimit3 = getColLimit(model.getCe3());
		if(model.getCe3().getRow() >=colLimit3 ||
				model.getCe2().getRow() >=colLimit2 ||
				model.getCe1().getRow() >=colLimit1 ||
				model.getCe0().getRow() >=colLimit0) {
			MyTask.stop = true;
			recordMinCol(model);
			Wall.list.add(model.getCe0());
			Wall.list.add(model.getCe1());
			Wall.list.add(model.getCe2());
			Wall.list.add(model.getCe3());
			return;
		}
		model.getCe0().drop();
		model.getCe1().drop();
		model.getCe2().drop();
		model.getCe3().drop();
	}
	
	/**  
	* @Title: recordMinCol  
	* @Description: TODO 记录第一行最高的位置
	* @param model   
	* @date:2019-01-11 16:09
	*/
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
	/**  
	* @Title: getColLimit  
	* @Description: TODO 获取第一行的最高的那个位置
	* @param cell
	* @return   
	* @date:2019-01-11 16:09
	*/
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
