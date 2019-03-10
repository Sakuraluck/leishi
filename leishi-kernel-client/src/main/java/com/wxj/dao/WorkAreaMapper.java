package com.wxj.dao;

import java.util.List;
import com.wxj.domain.entity.work.WorkArea;
import com.wxj.domain.vo.KeyValueVo;
/**
* @ClassName:  WorkAreaMapper
* @Description:TODO
* @Modified:第一版本
* @author: wxj
* @date:2019-3-10 14:30:08
* @email: 18772118541@163.com
*/
public interface WorkAreaMapper{
	/**
	 *查询WorkArea对象
	 *@param WorkArea 查询条件，通配
	 *@return List<WorkArea>
	 */
	public List<WorkArea> selectWorkArea(WorkArea WorkArea);
	/**
	 *插入WorkArea对象
	 *@param WorkArea 插入数据
	 *@return
	 */
	public void insertWorkArea(WorkArea WorkArea);
	/**
	 *删除WorkArea对象
	 *@param WorkArea 删除条件，通配
	 *@return
	 */
	public void deleteWorkArea(WorkArea WorkArea);
	/**  
	* @Title: selectWorkDict  
	* @Description: TODO
	* @return   
	* @date:2019-03-10 14:41
	*/
	public List<KeyValueVo> selectWorkDict();
}