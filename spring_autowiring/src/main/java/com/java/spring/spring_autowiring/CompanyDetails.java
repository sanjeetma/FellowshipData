package com.java.spring.spring_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyDetails {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	
		Company company=context.getBean("company",Company.class);
		company.getEmployeeStatus();
		company.getManagerStatus();
		
	
	}

}
