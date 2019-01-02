package com.wxj.service;

import com.wxj.domain.entity.Employee;
import com.wxj.domain.vo.employee.EmployeeVo;
import com.wxj.util.PageUtils;
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

	PageUtils<EmployeeVo> queryByPage(PageUtils<EmployeeVo> page,Employee employee);

	/**  
	* @Title: add  
	* @Description: TODO 添加员工
	* @param employee   
	* @date:2019-01-01 13:14
	*/
	void add(Employee employee);

	/**  
	* @Title: modify  
	* @Description: TODO 更新员工贪信息
	* @param employee   
	* @date:2019-01-01 15:47
	*/
	void modify(Employee employee,String reason);

}
