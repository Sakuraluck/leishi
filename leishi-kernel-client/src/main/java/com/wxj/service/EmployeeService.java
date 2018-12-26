package com.wxj.service;

import com.wxj.domain.entity.Employee;
import com.wxj.util.ResultObject;

public interface EmployeeService {

	/**  
	* @Title: query  
	* @Description: TODO 查询
	* @param emp
	* @return   
	* @return ResultObject
	* @date:2018-12-26 22:30
	*/
	ResultObject query(Employee emp);

}
