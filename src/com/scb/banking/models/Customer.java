package com.scb.banking.models;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private int customerId;
	private String fName;
	private String lName;
	private Date dob;
	private String add;
	private List<Long> contact;
	
	public Customer(){
		
	}	
	
	//@Autowired
	// @Qualifier("date02") :: Doesn't work at Constructor Level, Only at setter level
	public Customer(int id, String fN, String lN, Date ob, String a){
		customerId = id;
		fName = fN;
		lName = lN;
		dob = ob;
		add = a;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}

	public List<Long> getContact() {
		return contact;
	}

	public void setContact(List<Long> contact) {
		this.contact = contact;
	}
	
	
}
