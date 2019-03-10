package com.wxj.controller.work;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxj.domain.vo.KeyValueVo;
import com.wxj.service.work.WorkService;
import com.wxj.util.ResultObject;

/**  
* @ClassName: WorkController  
* @Description: TODO 工地管理controller
* @author: wxj  
* @date: 2019年3月10日
* @Tel:18772118541
* @email:18772118541@163.com
*/
@Controller
@RequestMapping("work")
public class WorkController {
	@Autowired
	private WorkService workService;
	/**  
	* @Title: getWorkDict  
	* @Description: TODO 在添加员工的时候要给这个员工分配对应的工地，所以这里提供一个查询工地信息的接口
	* @return   
	* @date:2019-03-10 14:53
	*/
	@RequestMapping(value="/getWorkDict",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject getWorkDict() {
		List<KeyValueVo> lsit = workService.getWorkDict();
		return new ResultObject(lsit);
	}
}
