package com.wxj.controller.employee;

import java.util.List;

import org.bouncycastle.jcajce.provider.digest.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxj.domain.entity.Employee;
import com.wxj.domain.vo.KeyValueVo;
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
	@RequestMapping(value = "/query", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
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
		ResultObject result = new ResultObject(employeeService.add(employee));
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
	@RequestMapping(value = "/salaryGrade", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject querySalaryGrade() {
		List<KeyValueVo> list = employeeService.querySalaryGrade();
		ResultObject result = new ResultObject(list);
		return result;
	}
	/**  
	* @Title: verifyID  
	* @Description: TODO 校验是否有重复的身份证号
	* @return   
	* @date:2019-01-20 18:29
	*/
	@RequestMapping(value = "/verifyID", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject verifyID(String identity) {
		boolean flg = employeeService.verifyID(identity);
		ResultObject result = new ResultObject(flg);
		return result;
	}
	/**  
	* @Title: login  
	* @Description: TODO 登录
	* @param employee
	* @return   
	* @date:2019-03-07 15:35
	*/
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject login(Employee employee) {
		boolean flg = employeeService.login(employee);
		ResultObject result = new ResultObject(flg);
		return result;
	}
	
	/**  
	* @Title: resetPassowrd  
	* @Description: TODO 重置密码
	* @param employee
	* @return   
	* @date:2019-03-07 15:50
	*/
	@RequestMapping(value = "/resetPassowrd", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject resetPassowrd(Employee employee) {
		
		boolean flg = employeeService.resetPassowrd(employee);
		ResultObject result = new ResultObject(flg);
		return result;
	}
	
	/**  
	* @Title: mofifyPassword  
	* @Description: TODO 修改密码
	* @param employee
	* @return   
	* @date:2019-03-07 16:07
	*/
	@RequestMapping(value = "/mofifyPassword", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject mofifyPassword(Employee employee,String newPassword) {
		ResultObject result = new ResultObject();
		boolean flg;
		try {
			flg = employeeService.mofifyPassword(employee,newPassword);
			result.setObj(flg);
		} catch (Exception e) {
			result.setObj(false);
			result.setObj(e.getMessage());
		}
		return result;
	}
}
