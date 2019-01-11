package com.wxj.test;

import com.wxj.domain.entity.MyTask;

import java.util.Date;
import java.util.Timer;

/**  
* @ClassName: TimerDemo  
* @Description: TODO
* @author: wxj  
* @date: 2019年1月11日
* @Tel:18772118541
* @email:18772118541@163.com
*/
public class TimerDemo {
	public static void main(String[] args) {
		
        //创建定时器对象
        Timer t=new Timer();
        //在3秒后执行MyTask类中的run方法
        t.schedule(new MyTask(),new Date(), 100);
    }
}
