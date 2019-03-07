package com.wxj.domain.entity.bank;
/**
* @ClassName:  BankInfo
* @Description:TODO
* @Modified:第一版本
* @author: wxj
* @date:2019-3-7 16:51:53
* @email: 18772118541@163.com
*/
public class BankInfo{
	private String id;
	/**银行卡号*/
	private String bankCard;
	/**银行名称*/
	private String bankName;
	/**开户行*/
	private String bankDeposit;
	/**1:常用0，备用*/
	private String sign;
	/**银行地址*/
	private String bankAddress;
	/**员工id*/
	private String emId;
	/**修改时间*/
	private String updateTime;
	/**创建时间*/
	private String createTime;

	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getBankCard(){
		return this.bankCard;
	}
	public void setBankCard(String bankCard){
		this.bankCard=bankCard;
	}
	public String getBankName(){
		return this.bankName;
	}
	public void setBankName(String bankName){
		this.bankName=bankName;
	}
	public String getBankDeposit(){
		return this.bankDeposit;
	}
	public void setBankDeposit(String bankDeposit){
		this.bankDeposit=bankDeposit;
	}
	public String getSign(){
		return this.sign;
	}
	public void setSign(String sign){
		this.sign=sign;
	}
	public String getBankAddress(){
		return this.bankAddress;
	}
	public void setBankAddress(String bankAddress){
		this.bankAddress=bankAddress;
	}
	public String getEmId(){
		return this.emId;
	}
	public void setEmId(String emId){
		this.emId=emId;
	}
	public String getUpdateTime(){
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime){
		this.updateTime=updateTime;
	}
	public String getCreateTime(){
		return this.createTime;
	}
	public void setCreateTime(String createTime){
		this.createTime=createTime;
	}
}