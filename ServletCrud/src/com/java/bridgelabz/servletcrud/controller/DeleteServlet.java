package com.java.bridgelabz.servletcrud.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.bridgelabz.servletcrud.service.EmployeeService;
import com.java.bridgelabz.servletcrud.service.serviceImpl.EmployeeServiceImpl;

public class DeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		int id = Integer.parseInt(req.getParameter("id"));
		EmployeeService object = new EmployeeServiceImpl();
		object.deleteById(id);
		try {
			res.sendRedirect("view.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
