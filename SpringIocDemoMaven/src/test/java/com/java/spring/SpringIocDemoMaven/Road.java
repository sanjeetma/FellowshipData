package com.java.spring.SpringIocDemoMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Road {

	public static void main(String[] args) {
		 ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
          //Vehicle vh= (Vehicle) context.getBean("bus");
		 Vehicle vh=context.getBean("vehicle",Vehicle.class);
          vh.move();
          vh.speed();
           
	}

}
