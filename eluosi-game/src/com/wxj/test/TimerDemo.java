package com.wxj.test;

import com.wxj.domain.entity.MyTask;

import java.util.Date;
import java.util.Timer;

/**  
* @ClassName: TimerDemo  
* @Description: TODO
* @author: wxj  
* @date: 2019��1��11��
* @Tel:18772118541
* @email:18772118541@163.com
*/
public class TimerDemo {
	public static void main(String[] args) {
		
        //������ʱ������
        Timer t=new Timer();
        //��3���ִ��MyTask���е�run����
        t.schedule(new MyTask(),new Date(), 100);
    }
}