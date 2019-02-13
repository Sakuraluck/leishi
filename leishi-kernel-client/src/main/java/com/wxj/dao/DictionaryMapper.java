package com.wxj.dao;

import java.util.List;

import com.wxj.domain.vo.KeyValueVo;

/**
* @ClassName:  EmployeeMapper
* @Description:TODO
* @Modified:第一版本
* @author: wxj
* @date:2018-12-26 21:33:48
* @email: 18772118541@163.com
*/
public interface DictionaryMapper {
	List<KeyValueVo> selectDictionaryByKey(String key);
}