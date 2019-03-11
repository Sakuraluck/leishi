/**
 * 
 */
package com.wxj.service;

import com.wxj.domain.entity.bank.BankInfo;
import com.wxj.util.PageUtils;

/**  
* @ClassName: BankService  
* @Description: TODO
* @author: wxj  
* @date: 2019年3月7日
* @Tel:18772118541
* @email:18772118541@163.com
*/
public interface ConstructionService {

	/**  
	* @Title: addBankInfo  
	* @Description: TODO 添加银行卡信息
	* @param bankInfo
	* @return   
	* @date:2019-03-07 17:00
	*/
	boolean addBankInfo(BankInfo bankInfo);

	/**  
	* @Title: remove  
	* @Description: TODO
	* @param id
	* @return   
	* @date:2019-03-07 17:15
	*/
	boolean remove(String id);

	/**  
	* @Title: modify  
	* @Description: TODO
	* @param bankInfo
	* @return   
	* @date:2019-03-07 17:17
	*/
	boolean modify(BankInfo bankInfo);

	/**  
	* @Title: query  
	* @Description: TODO
	* @param bankInfo
	* @param page
	* @return   
	* @date:2019-03-08 10:04
	*/
	PageUtils<BankInfo> query(BankInfo bankInfo, PageUtils<BankInfo> page);

}
