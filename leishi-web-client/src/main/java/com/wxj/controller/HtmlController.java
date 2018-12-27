package com.wxj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**  
* @ClassName: HtmlController  
* @Description: TODO 页面跳转控制类
* @author: wxj  
* @date: 2018-09-09 09:47
* @Tel:18772118541
* @email:18772118541@163.com
*/
@Controller
public class HtmlController {
	@GetMapping(value="/index")
	public String index(){
		return "/index";
	}
}
