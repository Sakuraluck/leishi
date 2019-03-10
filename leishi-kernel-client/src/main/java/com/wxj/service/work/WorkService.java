/**
 * 
 */
package com.wxj.service.work;

import java.util.List;

import com.wxj.domain.vo.KeyValueVo;

/**  
* @ClassName: WorkService  
* @Description: TODO
* @author: wxj  
* @date: 2019年3月10日
* @Tel:18772118541
* @email:18772118541@163.com
*/
public interface WorkService {

	/**  
	* @Title: getWorkDict  
	* @Description: TODO 查询工地字典
	* @return   
	* @date:2019-03-10 14:40
	*/
	List<KeyValueVo> getWorkDict();

}
