package com.java.servlet.crud.controller;

import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.servlet.crud.dao.EmployeeDao;
import com.java.servlet.crud.model.Employee;

public class AddUser extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String firstname = (req.getParameter("firstname"));
		String lastname = (req.getParameter("lastname"));
		int age = Integer.parseInt((req.getParameter("age")));
		int mobile = Integer.parseInt((req.getParameter("mobile")));
		Employee emp = new Employee();
		EmployeeDao daoobject = new EmployeeDao();
		emp.setFirst_name(firstname);
		emp.setLast_name(lastname);
		emp.setAge(age);
		emp.setMobile(mobile);
		try {
			daoobject.create(emp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		res.sendRedirect("adduser.html");
	}
}
