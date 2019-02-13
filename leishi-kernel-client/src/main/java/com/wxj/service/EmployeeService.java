package com.wxj.service;

import java.util.List;

import com.wxj.domain.entity.Employee;
import com.wxj.domain.vo.KeyValueVo;
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
	int add(Employee employee);

	/**  
	* @Title: modify  
	* @Description: TODO 更新员工贪信息
	* @param employee   
	* @date:2019-01-01 15:47
	*/
	void modify(Employee employee,String reason);

	/**  
	* @Title: querySalaryGrade  
	* @Description: TODO 查询薪资等级集合
	* @return   
	* @date:2019-01-20 14:42
	*/
	List<KeyValueVo> querySalaryGrade();

	/**  
	* @Title: verifyID  
	* @Description: TODO 校验身份证号
	* @param identity
	* @return   
	* @date:2019-01-20 18:30
	*/
	boolean verifyID(String identity);

}
