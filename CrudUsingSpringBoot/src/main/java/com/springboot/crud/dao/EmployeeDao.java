package com.springboot.crud.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.crud.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Long> {

	
	
	

}
