/**
 * 
 */
package com.wxj.service.impl.work;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxj.dao.EmployeeMapper;
import com.wxj.dao.ConstructionMapper;
import com.wxj.domain.entity.Employee;
import com.wxj.domain.entity.work.Construction;
import com.wxj.domain.vo.KeyValueVo;
import com.wxj.service.work.WorkService;
import com.wxj.util.MapUtils;
import com.wxj.util.PageUtils;

/**
 * @ClassName: WorkServiceImpl
 * @Description: TODO
 * @author: wxj
 * @date: 2019年3月10日
 * @Tel:18772118541
 * @email:18772118541@163.com
 */
@Service
public class ConstructionServiceImpl implements WorkService {

	@Autowired
	private ConstructionMapper workAreaMapper;
	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public List<KeyValueVo> getWorkDict() {
		return workAreaMapper.selectWorkDict();
	}

	@Override
	public int add(Construction workAre) {

		return workAreaMapper.insertWorkArea(workAre);
	}

	@Override
	public int remove(Construction workAre) {
		// 在删除工地之前，需要把原来是这个工地的人员的工地信息给置空
		Employee employee = new Employee();
		employee.setWorkId(workAre.getId());
		List<Employee> list = employeeMapper.selectEmployee(employee);
		int deleteWorkArea = 0;
		if (list.size() > 1) {
			int i = employeeMapper.updateEmpoyeeByAreaId();
			if (i > 0) {
				deleteWorkArea = workAreaMapper.deleteWorkArea(workAre);
			}
		} else {
			deleteWorkArea = workAreaMapper.deleteWorkArea(workAre);
		}
		return deleteWorkArea;
	}

	@Override
	public int modify(Construction workAre) {
		return workAreaMapper.updateWorkArea(workAre);
	}

	@Override
	public PageUtils<Construction> query(Construction workAre, PageUtils<Construction> page) {
		Map<String, Object> map = new HashMap<String,Object>();
		map = MapUtils.entityToMap(workAre, map);
		List<Construction> list = workAreaMapper.selectWorkAreaByPage(map);
		page.setTotalCount(list.size());
		map = MapUtils.entityToMap(page, map);
		list = workAreaMapper.selectWorkAreaByPage(map);
		page.setList(list);
		return page;
	}

}
