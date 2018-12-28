package com.wxj.dao;

import java.util.List;
import java.util.Map;

import com.wxj.domain.entity.Employee;
/**
* @ClassName:  EmployeeMapper
* @Description:TODO
* @Modified:第一版本
* @author: wxj
* @date:2018-12-26 21:33:48
* @email: 18772118541@163.com
*/
public interface EmployeeMapper{
	/**
	 *查询Employee对象
	 *@param Employee 查询条件，通配
	 *@return List<Employee>
	 */
	public List<Employee> selectEmployee(Employee Employee);
	/**
	 *插入Employee对象
	 *@param Employee 插入数据
	 *@return
	 */
	public void insertEmployee(Employee Employee);
	/**
	 *删除Employee对象
	 *@param Employee 删除条件，通配
	 *@return
	 */
	public void deleteEmployee(Employee Employee);
	/**  
	* @Title: selectEmployeeCount  
	* @Description: TODO 条件查询总条数
	* @param parmMap
	* @return   
	* @date:2018-12-28 15:55
	*/
	public int selectEmployeeCount(Map<String, Object> parmMap);
	/**  
	* @Title: selectEmployeeByPage  
	* @Description: TODO
	* @param parmMap
	* @return   
	* @date:2018-12-28 16:00
	*/
	public List<Employee> selectEmployeeByPage(Map<String, Object> parmMap);
}