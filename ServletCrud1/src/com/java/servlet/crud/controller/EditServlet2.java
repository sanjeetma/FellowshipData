package com.java.servlet.crud.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.servlet.crud.dao.EmployeeDao;
import com.java.servlet.crud.model.Employee;

public class EditServlet2 extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		int id=Integer.parseInt(req.getParameter("id"));
		String firstname=req.getParameter("firstname");
		String lastname=req.getParameter("lastname");
		int age=Integer.parseInt(req.getParameter("age"));
		int mobile=Integer.parseInt(req.getParameter("mobile"));
		Employee emp=new Employee();
		emp.setId(id);
		emp.setFirst_name(firstname);
		emp.setLast_name(lastname);
		emp.setAge(age);
		emp.setMobile(mobile);
		
		EmployeeDao object=new EmployeeDao();
		object.update(emp);
		
	}

}
