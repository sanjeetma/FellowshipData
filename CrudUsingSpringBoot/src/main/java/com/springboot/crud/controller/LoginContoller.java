package com.springboot.crud.controller;
import com.springboot.crud.model.*;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.dao.EmployeeDao;

@RestController
@RequestMapping("/login")
public class LoginContoller {
	
	@Autowired
	private EmployeeDao dao;
	
	@PostMapping("/auth")
	public boolean Authenticate(HttpServletRequest req){
		String str=req.getParameter("name");
	    String pass=req.getParameter("pass");
		List<Employee> list=(List<Employee>) dao.findAll();
		for(Employee emp:list) {
			Employee obj=emp;
			String name=obj.getName();
			String password=obj.getPassword();
			if(name.compareToIgnoreCase(str)==0 && pass.compareToIgnoreCase(password)==0){
				Long id=obj.getId();
				if(dao.existsById(id)) {
					emp.setStatus(true);
					dao.save(emp);
					return true;
					
				}
				
			}
		}
		return false;
		
	}

}
