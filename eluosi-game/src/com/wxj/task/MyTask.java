package com.wxj.task;

import java.util.TimerTask;

import com.wxj.domain.entity.Cell;
import com.wxj.domain.entity.Model;
import com.wxj.domain.entity.Wall;
/**  
* @ClassName: MyTask  
* @Description: TODO
* @author: wxj  
* @date: 2019年1月11日
* @Tel:18772118541
* @email:18772118541@163.com
*/
public class MyTask extends TimerTask {
	Model model = new Model(new Cell(0,3),new Cell(0,4),new Cell(0,5),new Cell(0,6));
	public static boolean stop = false;
	@Override
	public void run() {
		boolean gameOver = getGameOver();
		if(stop) {
			model = getModel();
			stop = false;
		}
		Wall.printWall(model);
		model.drop(model);
		System.out.println("========================");
		if(gameOver) {
			System.exit(0);
		}
	}
	/**  
	* @Title: getGameOver  
	* @Description: TODO
	* @return   
	* @date:2019-01-11 15:19
	*/
	private boolean getGameOver() {
		boolean flg = false;
		if(Wall.minHight0 <=0 ||
				Wall.minHight1<=0||
				Wall.minHight2<=0||
				Wall.minHight3<=0||
				Wall.minHight4<=0||
				Wall.minHight5<=0||
				Wall.minHight6<=0||
				Wall.minHight7<=0||
				Wall.minHight8<=0||
				Wall.minHight9<=0
				) {
			flg = true;
		}
		return flg;
	}
	/**  
	* @Title: getEntity  
	* @Description: TODO 拿到方块
	* @return   
	* @date:2019-01-11 12:33
	*/
	private Model getModel() {
		int mark = Wall.nxtModel;
		Model result = null;
		if(mark == 0) {//横
			result = new Model(new Cell(0,3),new Cell(0,4),new Cell(0,5),new Cell(0,6));
		}else if(mark == 1) {//竖
			result = new Model(new Cell(0,5),new Cell(-1,5),new Cell(-2,5),new Cell(-3,5));
		}else if(mark == 2) {//山
			result = new Model(new Cell(0,4),new Cell(0,5),new Cell(0,6),new Cell(-1,5));
		}else if(mark == 3) {//左山
			result = new Model(new Cell(0,5),new Cell(-1,5),new Cell(-1,4),new Cell(-2,5));
		}else if(mark == 4) {//右山
			result = new Model(new Cell(0,4),new Cell(-1,4),new Cell(-2,4),new Cell(-1,5));
		}else if(mark == 5) {//下山
			result = new Model(new Cell(0,4),new Cell(-1,3),new Cell(-1,4),new Cell(-1,5));
		}else if(mark == 6) {//J
			result = new Model(new Cell(0,4),new Cell(0,5),new Cell(-1,5),new Cell(-2,5));
		}else if(mark == 7) {//L
			result = new Model(new Cell(0,4),new Cell(0,5),new Cell(-1,4),new Cell(-2,4));
		}else if(mark == 8) {//田
			result = new Model(new Cell(0,4),new Cell(0,5),new Cell(-1,4),new Cell(-1,5));
		}else if(mark == 9) {//H
			result = new Model(new Cell(0,4),new Cell(-1,4),new Cell(-1,3),new Cell(-2,3));
		}else if(mark == 10) {//S
			result = new Model(new Cell(0,4),new Cell(0,5),new Cell(-1,5),new Cell(-1,6));
		}else if(mark == 11) {//Z
			result = new Model(new Cell(-1,4),new Cell(-1,5),new Cell(0,5),new Cell(0,6));
		}
		Wall.nxtModel = (int)(Math.random()*12);
		return result;
	}

}
