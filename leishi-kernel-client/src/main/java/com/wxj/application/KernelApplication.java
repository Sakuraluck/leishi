package com.wxj.application;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**  
* @ClassName: KernelApplication  
* @Description: TODO 核心控制模块启动类
* @author: wxj  
* @date: 2018-09-12 12:31
* @Tel:18772118541
* @email:18772118541@163.com
*/
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootConfiguration
@ComponentScan(basePackages = {"com.wxj.controller","com.wxj.servie","com.wxj.dao"})
public class KernelApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(KernelApplication.class).run(args);
	}
}
