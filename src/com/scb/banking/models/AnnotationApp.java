package com.scb.banking.models;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
	public static void main(String[] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-config-annotation.xml");
		Customer cust = (Customer) ctx.getBean("customer");
		
		Account acc = (Account) ctx.getBean("account01");
		
		System.out.println(acc.getCust().getfName());
		System.out.println(acc.getBal());
		System.out.println(acc.getCust().getAdd());
		
		AccountList accLst = null;
		
		accLst = (AccountList) ctx.getBean("accLst");
		
		List<Account> aclst = accLst.getLst();
		int i=1;
		for(Account ac: aclst ){
			System.out.println("Account No:"+i);
			System.out.println(ac.getCust().getfName());
			System.out.println(ac.getCust().getlName());
			System.out.println(ac.getCust().getAdd());
			i++;
		}
		
		Vendor v01, v02;
		v01 = (Vendor) ctx.getBean("vendor");
		
	}
}
