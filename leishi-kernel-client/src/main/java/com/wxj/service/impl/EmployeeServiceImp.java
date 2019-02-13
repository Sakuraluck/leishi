package com.wxj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxj.dao.EmployeeMapper;
import com.wxj.dao.SalaryRecordMapper;
import com.wxj.domain.entity.Employee;
import com.wxj.domain.entity.SalaryRecord;
import com.wxj.domain.vo.KeyValueVo;
import com.wxj.domain.vo.employee.EmployeeVo;
import com.wxj.service.EmployeeService;
import com.wxj.util.MD5Utils;
import com.wxj.util.MapUtils;
import com.wxj.util.PageUtils;
import com.wxj.util.ResultObject;
import com.wxj.dao.DictionaryMapper;
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
	@Autowired
	private SalaryRecordMapper salaryRecordMapper;
	@Autowired
	private DictionaryMapper DictionaryMapper;

	@Override
	public ResultObject query(Employee emp) {
		List<Employee> selectEmployee = employeeMapper.selectEmployee(emp);
		ResultObject result = new ResultObject(selectEmployee.get(0));
		return result;
	}

	@Override
	public PageUtils<EmployeeVo> queryByPage(PageUtils<EmployeeVo> page, Employee employee) {
		// 参数map
		Map<String, Object> parmMap = new HashMap<String, Object>();
		parmMap = MapUtils.entityToMap(employee, parmMap);
		int totalCount = employeeMapper.selectEmployeeCount(parmMap);
		page.setTotalCount(totalCount);
		parmMap = MapUtils.entityToMap(page, parmMap);
		List<EmployeeVo> list = employeeMapper.selectEmployeeByPage(parmMap);
		page.setList(list);
		return page;
	}

	@Override
	public int add(Employee employee) {
		boolean verifyID = verifyID(employee.getIdentity());
		if(verifyID) {
			return 0;
		}
		employee.setPassword(MD5Utils.getMD5(employee.getPassword()));
		employee.setStatus("1");
		employeeMapper.insertEmployee(employee);
		Integer maxEmId = employeeMapper.selectMaxEmId();
		SalaryRecord record = new SalaryRecord();
		record.setEmId(maxEmId.toString());
		record.setBeforeGreade("0");
		record.setAfterGreade(employee.getSalaryGrade());
		record.setChangeDesc("入职");
		record.setReason("新员工入职！");
		salaryRecordMapper.insertSalaryRecord(record);
		return 1;
	}

	@Override
	public void modify(Employee employee, String reason) {
		Employee em = new Employee();
		em.setId(employee.getId());
		Employee vo = employeeMapper.selectEmployee(em).get(0);
		recordSalaryGrade(employee, vo, reason);
		employeeMapper.updateEmployee(employee);
	}

	/**
	 * @Title: recordSalaryGrade
	 * @Description: TODO 记录薪资等级
	 * @param employee
	 * @param vo
	 * @param reason
	 * @date:2019-01-01 15:59
	 */
	private void recordSalaryGrade(Employee employee, Employee vo, String reason) {
		if (!employee.getSalaryGrade().equals(vo.getSalaryGrade())) {
			SalaryRecord record = new SalaryRecord();
			record.setEmId(employee.getId());
			record.setBeforeGreade(vo.getSalaryGrade());
			record.setAfterGreade(employee.getSalaryGrade());
			String changeDesc = getChanageDesc(vo, employee);
			record.setChangeDesc(changeDesc);
			record.setReason(reason);
			salaryRecordMapper.insertSalaryRecord(record);
		}
	}

	/**
	 * @Title: getChanageDesc
	 * @Description: TODO 根据原薪资等级和修改的薪资等级来判断是涨蒋还是降薪
	 * @param vo
	 * @param employee
	 * @return
	 * @date:2019-01-01 15:55
	 */
	private String getChanageDesc(Employee vo, Employee employee) {
		String result = "";
		if (Integer.parseInt(vo.getSalaryGrade()) > Integer.parseInt(employee.getSalaryGrade())) {
			result = "降薪";
		} else {
			result = "涨薪";
		}
		return result;
	}

	@Override
	public List<KeyValueVo> querySalaryGrade() {
		return DictionaryMapper.selectDictionaryByKey("salary");
	}

	@Override
	public boolean verifyID(String identity) {
		Employee employee = new Employee();
		employee.setIdentity(identity);
		List<Employee> selectEmployee = employeeMapper.selectEmployee(employee);
		if(selectEmployee != null && selectEmployee.size() > 0) {
			return true;
		}
		return false;
	}

}
