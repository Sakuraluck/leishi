/**
 * 
 */
package com.wxj.service.work;

import java.util.List;

import com.wxj.domain.entity.work.Construction;
import com.wxj.domain.vo.KeyValueVo;
import com.wxj.util.PageUtils;

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

	/**  
	* @Title: add  
	* @Description: TODO 工地信息添加
	* @param workAre
	* @return   
	* @date:2019-03-10 15:00
	*/
	int add(Construction workAre);

	/**  
	* @Title: remove  
	* @Description: TODO delete the contrustion site info
	* @param workAre
	* @return   
	* @date:2019-03-11 09:36
	*/
	int remove(Construction workAre);

	/**  
	* @Title: modify  
	* @Description: TODO modify site info
	* @param workAre
	* @return   
	* @date:2019-03-11 09:50
	*/
	int modify(Construction workAre);

	/**  
	* @Title: query  
	* @Description: TODO query contrustion site info
	* @param workAre
	* @param page
	* @return   
	* @date:2019-03-11 10:02
	*/
	PageUtils<Construction> query(Construction workAre, PageUtils<Construction> page);

}
