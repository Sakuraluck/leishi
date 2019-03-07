package com.wxj.job;

import java.text.SimpleDateFormat;
import java.util.Date;

/**  
* @ClassName: TestJob  
* @Description: TODO 测试job
* @author: wxj  
* @date: 2019年3月6日
* @Tel:18772118541
* @email:18772118541@163.com
*/
public class TestJob {
	public void test() {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("测试job:"+simple.format(new Date()));
	}
}
