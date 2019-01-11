package com.wxj.domain.entity;

import java.util.ArrayList;
import java.util.List;

/**  
* @ClassName: Wall  
* @Description: TODO ǽ��
* @author: wxj  
* @date: 2019��1��11��
* @Tel:18772118541
* @email:18772118541@163.com
*/
public class Wall {
	public static List<Cell> list = new ArrayList<Cell>();
	public static int minHight0 = 19;
	public static int minHight1 = 19;
	public static int minHight2 = 19;
	public static int minHight3 = 19;
	public static int minHight4 = 19;
	public static int minHight5 = 19;
	public static int minHight6 = 19;
	public static int minHight7 = 19;
	public static int minHight8 = 19;
	public static int minHight9 = 19;
	public static int nxtModel = (int)(Math.random()*12);
	/**  
	* @Title: printWall  
	* @Description: TODO ��ӡ������
	* @date:2019-01-11 09:22
	*/
	public static void printWall(Model model) {
		for(int i =0 ; i< 20 ;i++) {
			System.out.print("||");
			for(int j =0 ; j< 10 ;j++) {
				boolean flg = printWallList(i,j);
				if((i==model.getCe0().getRow() && j==model.getCe0().getCol()) || 
						(i==model.getCe1().getRow() && j==model.getCe1().getCol()) || 
						(i==model.getCe2().getRow() && j==model.getCe2().getCol()) || 
						(i==model.getCe3().getRow() && j==model.getCe3().getCol())|| flg) {
					System.out.print(" E");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("||");
			System.out.println();
		}
	}
	
	/**  
	* @Title: printWallList  
	* @Description: TODO ��ӡ�Ѿ����ڵ�ǽ��
	* @param i
	* @param j
	* @return   
	* @date:2019-01-11 13:48
	*/
	private static boolean printWallList(int i, int j) {
		boolean flg = false;
		for (int s = 0; s < list.size() ; s++) {
			if(j == list.get(s).getCol() && i == list.get(s).getRow()){
				flg = true;
			}
		}
		return flg;
	}
}
