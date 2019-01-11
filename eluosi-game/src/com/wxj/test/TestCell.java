package com.wxj.test;
import com.wxj.domain.entity.Cell;
/**  
* @ClassName: TestCell  
* @Description: TODO
* @author: wxj  
* @date: 2019年1月11日
* @Tel:18772118541
* @email:18772118541@163.com
*/
public class TestCell {
	public static void main(String[] args) {
		Cell cell = new Cell(3,5);
		printWall(cell);
		cell.drop();
		System.out.println("下落后");
		printWall(cell);
	}

	/**  
	* @Title: printWall  
	* @Description: TODO 打印出背景
	* @date:2019-01-11 09:22
	*/
	private static void printWall(Cell cell) {
		for(int i =0 ; i< 20 ;i++) {
			for(int j =0 ; j< 10 ;j++) {
				if(i==cell.getRow() && j==cell.getCol()) {
					System.out.print("*");
				}else {
					System.out.print("+");
				}
			}
			System.out.println();
		}
	}
}
