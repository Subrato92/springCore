package com.scb.banking.models;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	
	public static void main(String[] args){
		List<Long> lst = null;
		Resource res = new ClassPathResource("bean-config.xml");
		BeanFactory beanFac = new XmlBeanFactory(res);
		AccountList accLst = null;
		
		accLst = (AccountList) beanFac.getBean("accLst");
		//Inversion Of Control
		Transaction tran = (Transaction) beanFac.getBean("debitCard");
		System.out.println(tran.payment(1909));
		
		//Customer cust = (Customer) beanFac.getBean("customer");
		Account acc = (Account) beanFac.getBean("account01");
		System.out.println(acc.getCust().getCustomerId());
		System.out.println(acc.getCust().getfName());
		System.out.println(acc.getCust().getlName());
		System.out.println(acc.getCust().getAdd());
		System.out.println(acc.getCust().getDob().toString());
		System.out.println(acc.getBal());
		System.out.println("The Contact Numbers are ::");
		
		lst = acc.getCust().getContact();
		for(Long l : lst ){
			System.out.println(l);
		}
		
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
		
		v01 = (Vendor) beanFac.getBean("vendor01");
		v02 = (Vendor) beanFac.getBean("vendor01");
		v01.setName("Arbit");
		
		if( v02.getName().equals("Arbit") )
			System.out.println("\nSame");
		
	}

}
