package com.scb.banking.models;

public class NetBanking implements Transaction{

	@Override
	public String payment(int amt){
		String s = null;
		
		s = "The Amount "+ amt +" is debited from your NB A/C";
		
		return s;
	}
	
}
