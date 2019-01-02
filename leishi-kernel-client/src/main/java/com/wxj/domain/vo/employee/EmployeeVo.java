package com.wxj.domain.vo.employee;

import com.wxj.domain.entity.Employee;

/**  
* @ClassName: EmployeeVo  
* @Description: TODO
* @author: wxj  
* @date: 2019年1月1日
* @Tel:18772118541
* @email:18772118541@163.com
*/
public class EmployeeVo extends Employee {
	private String slary;

	public String getSlary() {
		return slary;
	}

	public void setSlary(String slary) {
		this.slary = slary;
	}

	@Override
	public String toString() {
		return "EmployeeVo [slary=" + slary + "]";
	}
}
