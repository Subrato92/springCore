package com.scb.banking.models;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountList {
	private List<Account> lst = null;
	
	public AccountList(){
		
	}

	public List<Account> getLst() {
		return lst;
	}
	
	@Autowired
	public void setLst(List<Account> lst) {
		this.lst = lst;
	}
	
}
