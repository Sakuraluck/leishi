package com.wxj.controller.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxj.domain.entity.bank.BankInfo;
import com.wxj.service.BankService;
import com.wxj.util.PageUtils;
import com.wxj.util.ResultObject;

/**  
* @ClassName: BankController  
* @Description: TODO 银行信息管理
* @author: wxj  
* @date: 2019年3月7日
* @Tel:18772118541
* @email:18772118541@163.com
*/
@Controller
@RequestMapping("bank")
public class BankController {
	@Autowired
	private BankService bankService;
	/**  
	* @Title: addBankInfo  
	* @Description: TODO 添加银行信息
	* @param bankInfo   
	* @date:2019-03-07 16:58
	*/
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject add(BankInfo bankInfo) {
		boolean flg = bankService.addBankInfo(bankInfo);
		return new ResultObject(flg);
	}
	@RequestMapping(value = "/remove", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject remove(String id) {
		boolean flg = bankService.remove(id);
		return new ResultObject(flg);
	}
	@RequestMapping(value = "/modify", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject modify(BankInfo bankInfo) {
		boolean flg = bankService.modify(bankInfo);
		return new ResultObject(flg);
	}
	@RequestMapping(value = "/query", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResultObject query(BankInfo bankInfo) {
		PageUtils<BankInfo> page = new PageUtils<BankInfo>();
		return new ResultObject(page);
	}
}
