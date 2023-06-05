package com.bamk.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Bank")
public class Bank {
	private long accNo;
	private String type;
	private String Name;
	private Long addharNo;
	private int charge;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public Bank(long accNo, String type, String name, Long addharNo, int charge) {
		super();
		this.accNo = accNo;
		this.type = type;
		Name = name;
		this.addharNo = addharNo;
		this.charge = charge;
	}
	public Long getAddharNo() {
		return addharNo;
	}
	public void setAddharNo(Long addharNo) {
		this.addharNo = addharNo;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
