package com.java.spring.spring_auto_wiring_annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	
	private Employee employee;
	private Manager manager;
	
	public Company(){}
	
	
     @Autowired
	public Company(Employee employee) {
	
		this.employee = employee;
	}
     
     
	@Autowired
	public void setManager(Manager manager) {
		this.manager = manager;
	}


	public void showEmployeeStatus() {
		employee.working();
		
	}
	public void showManagerStatus() {
		manager.working();
	}
	
	

}
