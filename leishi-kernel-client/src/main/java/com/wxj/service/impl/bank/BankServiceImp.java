/**
 * 
 */
package com.wxj.service.impl.bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxj.dao.BankInfoMapper;
import com.wxj.domain.entity.bank.BankInfo;
import com.wxj.service.BankService;
import com.wxj.util.MapUtils;
import com.wxj.util.PageUtils;

/**  
* @ClassName: BankServiceImp  
* @Description: TODO 银行信息管理服务实现类
* @author: wxj  
* @date: 2019年3月7日
* @Tel:18772118541
* @email:18772118541@163.com
*/
@Service
public class BankServiceImp implements BankService {
	@Autowired
	private BankInfoMapper bankInfoMapper;
	@Override
	public boolean addBankInfo(BankInfo bankInfo) {
		bankInfoMapper.insertBankInfo(bankInfo);
		return true;
	}
	@Override
	public boolean remove(String id) {
		BankInfo info = new BankInfo();
		info.setId(id);
		bankInfoMapper.deleteBankInfo(info);
		return true;
	}
	@Override
	public boolean modify(BankInfo bankInfo) {
		bankInfoMapper.updateBankInfo(bankInfo);
		return true;
	}
	@Override
	public PageUtils<BankInfo> query(BankInfo bankInfo, PageUtils<BankInfo> page) {
		Map<String, Object> map = new HashMap<String,Object>();
		map = MapUtils.entityToMap(bankInfo, map);
		List<BankInfo> list = bankInfoMapper.selectBankInfoByMap(map);
		map = MapUtils.entityToMap(page, map);
		page.setTotalCount(list.size());
		list = bankInfoMapper.selectBankInfoByMap(map);
		page.setList(list);
		return page;
	}

}
