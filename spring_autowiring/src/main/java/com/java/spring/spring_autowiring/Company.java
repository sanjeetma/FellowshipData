package com.java.spring.spring_autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {

	private Employee employee;
	private Manager manager;

	public Company() {
	}

	
	public void setManager(Manager manager) {
		this.manager = manager;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void getEmployeeStatus() {
		if (employee != null) {

			employee.work();
		} else {
			System.out.println("EMployee is not Working");
		}
	}

	public void getManagerStatus() {
		if (manager != null) {

			manager.work();

		} else {
			System.out.println("manager is not working");
		}
	}

}
