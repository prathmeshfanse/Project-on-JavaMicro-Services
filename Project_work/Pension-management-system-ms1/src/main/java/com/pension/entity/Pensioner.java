package com.pension.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pms")
public class Pensioner {
	
	private String name;
	@Id
	private Long addharNo;
	private String dob;
	private float salary;
	private float allowances;
	private float pension;
	
	public Pensioner( String name, Long addharNo, String dob, float salary, float allowances, float pension) {
		super();
		//this.obj = obj;
		this.name = name;
		this.addharNo = addharNo;
		this.dob = dob;
		this.salary = salary;
		this.allowances = allowances;
		this.pension = pension;
	}
	public Pensioner() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*public Bank getObj() {
		return obj;
	}
	public void setObj(Bank obj) {
		this.obj = obj;
	}*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAddharNo() {
		return addharNo;
	}
	public void setAddharNo(Long addharNo) {
		this.addharNo = addharNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getAllowances() {
		return allowances;
	}
	public void setAllowances(float allowances) {
		this.allowances = allowances;
	}
	public float getPension() {
		return pension;
	}
	public void setPension(float pension) {
		this.pension = pension;
	}
	
}