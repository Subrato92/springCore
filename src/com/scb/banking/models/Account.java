package com.scb.banking.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Account {

	private Customer cust;
	private long bal;
	
	public Account(){
		
	}
	
	public Customer getCust() {
		return cust;
	}
	
	@Autowired
	@Qualifier("customer01")
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public long getBal() {
		return bal;
	}
	public void setBal(long bal) {
		this.bal = bal;
	}	
}
