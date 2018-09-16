package com.scb.banking.models;

public class DebitCard implements Transaction{
	
	@Override
	public String payment(int amt){
		String s = null;
		
		s = "The Amount "+ amt +" is debited from your DC A/C";
		
		return s;
	}
}
