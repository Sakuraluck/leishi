package com.wxj.domain.entity.work;
/**
* @ClassName:  WorkArea
* @Description:TODO
* @Modified:第一版本
* @author: wxj
* @date:2019-3-10 14:48:05
* @email: 18772118541@163.com
*/
public class WorkArea{
	/***/
	private String id;
	/***/
	private String areaName;
	/**工地描述*/
	private String areaDesc;
	/**工地负责人*/
	private String empId;
	/**项目干系人*/
	private String stakeholder;
	/**项目干系人电话*/
	private String stPhone;
	/**工地状态：1未完工，0完工*/
	private String status;
	/**工地地址*/
	private String areaAddress;
	/**创建时间*/
	private String createTime;
	/**更新时间*/
	private String updateTime;
	/**创建用户*/
	private String createUser;
	/**更新用户*/
	private String updateUser;

	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getAreaName(){
		return this.areaName;
	}
	public void setAreaName(String areaName){
		this.areaName=areaName;
	}
	public String getAreaDesc(){
		return this.areaDesc;
	}
	public void setAreaDesc(String areaDesc){
		this.areaDesc=areaDesc;
	}
	public String getEmpId(){
		return this.empId;
	}
	public void setEmpId(String empId){
		this.empId=empId;
	}
	public String getStakeholder(){
		return this.stakeholder;
	}
	public void setStakeholder(String stakeholder){
		this.stakeholder=stakeholder;
	}
	public String getStPhone(){
		return this.stPhone;
	}
	public void setStPhone(String stPhone){
		this.stPhone=stPhone;
	}
	public String getStatus(){
		return this.status;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getAreaAddress(){
		return this.areaAddress;
	}
	public void setAreaAddress(String areaAddress){
		this.areaAddress=areaAddress;
	}
	public String getCreateTime(){
		return this.createTime;
	}
	public void setCreateTime(String createTime){
		this.createTime=createTime;
	}
	public String getUpdateTime(){
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime){
		this.updateTime=updateTime;
	}
	public String getCreateUser(){
		return this.createUser;
	}
	public void setCreateUser(String createUser){
		this.createUser=createUser;
	}
	public String getUpdateUser(){
		return this.updateUser;
	}
	public void setUpdateUser(String updateUser){
		this.updateUser=updateUser;
	}
}