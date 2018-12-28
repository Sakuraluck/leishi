package com.wxj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wxj.domain.entity.Employee;
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
	@RequestMapping(value = "/query", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject query(PageUtils<Employee> page, Employee employee) {
		page = employeeService.queryByPage(page,employee);
		ResultObject result = new ResultObject(page);
		return result;
	}
}
