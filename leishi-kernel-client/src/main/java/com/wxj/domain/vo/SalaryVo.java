package com.wxj.domain.vo;

/**  
* @ClassName: SalaryVo  
* @Description: TODO 薪资计算VO
* @author: wxj  
* @date: 2019年3月8日
* @Tel:18772118541
* @email:18772118541@163.com
*/
public class SalaryVo {
	/** 员工id */
	private String emId;
	/** 姓名 */
	private String name;
	/** 当月工时 */
	private String timesheets;
	/** 当月日薪 */
	private String daySalary;
	/** 当月计算后的月薪 */
	private String monthSalary;
	public String getEmId() {
		return emId;
	}
	public void setEmId(String emId) {
		this.emId = emId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTimesheets() {
		return timesheets;
	}
	public void setTimesheets(String timesheets) {
		this.timesheets = timesheets;
	}
	public String getDaySalary() {
		return daySalary;
	}
	public void setDaySalary(String daySalary) {
		this.daySalary = daySalary;
	}
	public String getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(String monthSalary) {
		this.monthSalary = monthSalary;
	}
}
