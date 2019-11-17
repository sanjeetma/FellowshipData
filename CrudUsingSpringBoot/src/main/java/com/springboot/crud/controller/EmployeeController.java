package com.springboot.crud.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.dao.EmployeeDao;
import com.springboot.crud.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeDao dao;

	@PostMapping("/save")
	@ResponseBody
	public String saveEmployee(@RequestBody Employee employee) {
		dao.save(employee);
		return "saved";

	}

	@GetMapping("/get")
	public List<Employee> GetEmployee() {
		return (List<Employee>) dao.findAll();
	}

	@DeleteMapping("/delete/{Id}")
	public String delete(@PathVariable(name="Id") Long Id) {

		dao.deleteById(Id);
		return "deleted";

	}
	@GetMapping("/find/{Id}")
	public Optional<Employee> find(@PathVariable(name="Id") Long Id) {
		return dao.findById(Id);
		
	}
}
