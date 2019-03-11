package com.wxj.dao;

import java.util.List;
import java.util.Map;

import com.wxj.domain.entity.work.Construction;
import com.wxj.domain.vo.KeyValueVo;
/**
* @ClassName:  WorkAreaMapper
* @Description:TODO
* @Modified:第一版本
* @author: wxj
* @date:2019-3-10 14:30:08
* @email: 18772118541@163.com
*/
public interface ConstructionMapper{
	/**
	 *查询WorkArea对象
	 *@param WorkArea 查询条件，通配
	 *@return List<WorkArea>
	 */
	public List<Construction> selectWorkArea(Construction WorkArea);
	/**
	 *插入WorkArea对象
	 *@param WorkArea 插入数据
	 *@return
	 */
	public int insertWorkArea(Construction WorkArea);
	/**
	 *删除WorkArea对象
	 *@param WorkArea 删除条件，通配
	 *@return
	 */
	public int deleteWorkArea(Construction WorkArea);
	/**  
	* @Title: selectWorkDict  
	* @Description: TODO
	* @return   
	* @date:2019-03-10 14:41
	*/
	public List<KeyValueVo> selectWorkDict();
	/**  
	* @Title: updateWorkArea  
	* @Description: TODO update site info
	* @param workAre
	* @return   
	* @date:2019-03-11 09:52
	*/
	public int updateWorkArea(Construction workAre);
	/**  
	* @Title: selectWorkAreaByPage  
	* @Description: TODO query construction site info by page
	* @param workAre
	* @return   
	* @date:2019-03-11 10:07
	*/
	public List<Construction> selectWorkAreaByPage(Map<String, Object> map);
}