package com.java.spring.DependencyInjectionSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {	
    	
	   ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	   Car car1=context.getBean("ford",Car.class);
	   Car car2=context.getBean("maruti",Car.class);
	   car1.getCarDetails();
	   car2.getCarDetails();
	   System.out.println("***@@@@@@@@###$$$%%%^^^^&&&***((()))___+++");
	   Bus bus1=context.getBean("volvo",Bus.class);
	   bus1.getBustDetails();
    	
    	
}
}
