package com.scb.banking.models;

public class CreditCard implements Transaction {

	@Override
	public String payment(int amt){
		String s = null;
		
		s = "The Amount "+ amt +" is debited from your CC A/C";
		
		return s;
	}
	
}
