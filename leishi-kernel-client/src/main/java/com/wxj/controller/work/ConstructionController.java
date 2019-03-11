package com.wxj.controller.work;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxj.domain.entity.work.Construction;
import com.wxj.domain.vo.KeyValueVo;
import com.wxj.service.work.WorkService;
import com.wxj.util.PageUtils;
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
public class ConstructionController {
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
	/**  
	* @Title: add  
	* @Description: TODO 工地信息添加
	* @return   
	* @date:2019-03-10 14:58
	*/
	@RequestMapping(value="/add",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject add(Construction workAre) {
		workAre.setUpdateUser("1");
		workAre.setCreateUser("1");
		int  i = workService.add(workAre);
		return new ResultObject(i+"条");
	}
	/**  
	* @Title: remove  
	* @Description: TODO remove the contrustion site
	* @param workAre
	* @return   
	* @date:2019-03-11 09:33
	*/
	@RequestMapping(value="/remove",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject remove(Construction workAre) {
		int  i = workService.remove(workAre);
		return new ResultObject(i+"条");
	}
	/**  
	* @Title: modify  
	* @Description: TODO modify site info
	* @param workAre
	* @return   
	* @date:2019-03-11 09:50
	*/
	@RequestMapping(value="/modify",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject modify(Construction workAre) {
		int  i = workService.modify(workAre);
		return new ResultObject(i+"条");
	}
	
	/**  
	* @Title: query  
	* @Description: TODO query site info
	* @param workAre
	* @return   
	* @date:2019-03-11 10:00
	*/
	@RequestMapping(value="/query",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject query(Construction workAre,PageUtils<Construction> page) {
		page = workService.query(workAre,page);
		return new ResultObject(page);
	}
}
