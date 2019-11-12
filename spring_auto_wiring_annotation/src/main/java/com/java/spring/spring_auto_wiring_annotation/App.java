package com.java.spring.spring_auto_wiring_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
   public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	Company company=context.getBean("company",Company.class);
	company.showEmployeeStatus();
	company.showManagerStatus();
	
}
}
