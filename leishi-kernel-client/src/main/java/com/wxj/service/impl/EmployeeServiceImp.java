package com.wxj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxj.dao.EmployeeMapper;
import com.wxj.domain.entity.Employee;
import com.wxj.service.EmployeeService;
import com.wxj.util.ResultObject;

/**  
* @ClassName: EmployeeServiceImp  
* @Description: TODO 员工管理服务实现类
* @author: wxj  
* @date: 2018-12-26 22:28
* @Tel:18772118541
* @email:18772118541@163.com
*/
@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;
	@Override
	public ResultObject query(Employee emp) {
		List<Employee> selectEmployee = employeeMapper.selectEmployee(emp);
		ResultObject result = new ResultObject(selectEmployee.get(0));
		return result;
	}
	
}
