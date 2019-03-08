package com.wxj.dao;

import java.util.List;
import java.util.Map;

import com.wxj.domain.entity.bank.BankInfo;
/**
* @ClassName:  BankInfoMapper
* @Description:TODO
* @Modified:第一版本
* @author: wxj
* @date:2019-3-7 16:51:53
* @email: 18772118541@163.com
*/
public interface BankInfoMapper{
	/**
	 *查询BankInfo对象
	 *@param BankInfo 查询条件，通配
	 *@return List<BankInfo>
	 */
	public List<BankInfo> selectBankInfo(BankInfo BankInfo);
	/**
	 *插入BankInfo对象
	 *@param BankInfo 插入数据
	 *@return
	 */
	public void insertBankInfo(BankInfo BankInfo);
	/**
	 *删除BankInfo对象
	 *@param BankInfo 删除条件，通配
	 *@return
	 */
	public void deleteBankInfo(BankInfo BankInfo);
	/**  
	* @Title: updateBankInfo  
	* @Description: TODO 修改
	* @param bankInfo   
	* @date:2019-03-07 17:17
	*/
	public void updateBankInfo(BankInfo bankInfo);
	/**  
	* @Title: selectBankInfoByMap  
	* @Description: TODO 条件查询
	* @param map   
	* @date:2019-03-08 10:10
	*/
	public List<BankInfo> selectBankInfoByMap(Map<String, Object> map);
}