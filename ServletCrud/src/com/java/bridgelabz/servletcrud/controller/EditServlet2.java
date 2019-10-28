package com.java.bridgelabz.servletcrud.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.bridgelabz.servletcrud.model.Employee;
import com.java.bridgelabz.servletcrud.service.EmployeeService;
import com.java.bridgelabz.servletcrud.service.serviceImpl.EmployeeServiceImpl;

public class EditServlet2 extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String fname = req.getParameter("firstname");
		String lname = req.getParameter("lastname");
		int age = Integer.parseInt(req.getParameter("age"));
		int mobile = Integer.parseInt(req.getParameter("mobile"));

		Employee employee = new Employee();
		employee.setId(id);
		employee.setFirst_name(fname);
		employee.setLast_name(lname);
		employee.setAge(age);
		employee.setMobile(mobile);
		EmployeeService object = new EmployeeServiceImpl();
		object.update(employee);
		res.sendRedirect("view.jsp");
	}
}
