package com.java.bridgelabz.servletcrud.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.bridgelabz.servletcrud.employeedao.EmployeeDao;
import com.java.bridgelabz.servletcrud.model.Employee;

public class AddEmployeeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String fname = req.getParameter("firstname");
		String lname = req.getParameter("lastname");
		int age = Integer.parseInt(req.getParameter("age"));
		int mobile = Integer.parseInt(req.getParameter("mobile"));

		Employee employee = new Employee();
		employee.setFirst_name(fname);
		employee.setLast_name(lname);
		employee.setAge(age);
		employee.setMobile(mobile);
		EmployeeDao.create(employee);
		res.sendRedirect("Adduser.html");

	}
}
