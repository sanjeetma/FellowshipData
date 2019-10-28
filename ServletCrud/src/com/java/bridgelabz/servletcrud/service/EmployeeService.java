package com.java.bridgelabz.servletcrud.service;

import com.java.bridgelabz.servletcrud.model.Employee;

public interface EmployeeService {
	public void update(Employee employee);

	public void deleteById(int id);
}
