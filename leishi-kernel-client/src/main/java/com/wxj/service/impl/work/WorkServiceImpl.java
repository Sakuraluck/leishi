/**
 * 
 */
package com.wxj.service.impl.work;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxj.dao.WorkAreaMapper;
import com.wxj.domain.vo.KeyValueVo;
import com.wxj.service.work.WorkService;

/**  
* @ClassName: WorkServiceImpl  
* @Description: TODO
* @author: wxj  
* @date: 2019年3月10日
* @Tel:18772118541
* @email:18772118541@163.com
*/
@Service
public class WorkServiceImpl implements WorkService{
	
	@Autowired
	private WorkAreaMapper workAreaMapper;

	@Override
	public List<KeyValueVo> getWorkDict() {
		return workAreaMapper.selectWorkDict();
	}

}
