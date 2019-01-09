package com.wxj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wxj.domain.entity.Employee;
import com.wxj.domain.vo.employee.EmployeeVo;
import com.wxj.service.EmployeeService;
import com.wxj.util.PageUtils;
import com.wxj.util.ResultObject;
/**
 * @ClassName: EmployeeController
 * @Description: TODO 员工管理controller
 * @author: wxj
 * @date: 2018-12-26 21:35
 * @Tel:18772118541
 * @email:18772118541@163.com
 */
@Controller
@RequestMapping(value="/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	/**  
	* @Title: query  
	* @Description: TODO 员工查询
	* @param page
	* @param employee
	* @return   
	* @date:2019-01-01 12:10
	*/
	@RequestMapping(value = "/query", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject query(PageUtils<EmployeeVo> page, Employee employee) {
		page = employeeService.queryByPage(page,employee);
		ResultObject result = new ResultObject(page);
		return result;
	}
	
	/**  
	* @Title: add  
	* @Description: TODO 员工添加
	* @param page
	* @param employee
	* @return   
	* @date:2019-01-01 12:12
	*/
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject add(Employee employee) {
		employeeService.add(employee);
		ResultObject result = new ResultObject();
		return result;
	}
	/**  
	* @Title: modify  
	* @Description: TODO 员工信息更新
	* @param employee
	* @return   
	* @date:2019-01-01 15:46
	*/
	@RequestMapping(value = "/modify", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject modify(Employee employee,String reason) {
		employeeService.modify(employee,reason);
		ResultObject result = new ResultObject();
		return result;
	}
}
