package com.wxj.domain.entity;
/**
* @ClassName:  Employee
* @Description:TODO
* @Modified:第一版本
* @author: wxj
* @date:2018-12-26 21:33:48
* @email: 18772118541@163.com
*/
public class Employee{
	/***/
	private String id;
	/**姓名*/
	private String name;
	/**年龄*/
	private String age;
	/**电话号码*/
	private String phone;
	/**登录用户名*/
	private String userName;
	/**密码*/
	private String password;
	/**薪资等级*/
	private String salaryGrade;
	/**创建时间*/
	private String createTime;
	/**修改时间*/
	private String updateTime;
	/** 通讯地址*/
	private String commAddress;
	/** 家庭住址 */
	private String homeAddress;
	/** 状态：1在职，0离职 */
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCommAddress() {
		return commAddress;
	}
	public void setCommAddress(String commAddress) {
		this.commAddress = commAddress;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getAge(){
		return this.age;
	}
	public void setAge(String age){
		this.age=age;
	}
	public String getPhone(){
		return this.phone;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getUserName(){
		return this.userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getSalaryGrade(){
		return this.salaryGrade;
	}
	public void setSalaryGrade(String salaryGrade){
		this.salaryGrade=salaryGrade;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", userName=" + userName
				+ ", password=" + password + ", salaryGrade=" + salaryGrade + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", commAddress=" + commAddress + ", homeAddress=" + homeAddress + "]";
	}
}