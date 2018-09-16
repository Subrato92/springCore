package com.scb.banking.models;

import org.springframework.stereotype.Component;

@Component
public class Vendor {
	private String name;
	
	public Vendor(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
