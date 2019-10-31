package com.java.bridgelabz.servletcrud.controller;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.bridgelabz.servletcrud.employeedao.EmployeeDao;

public class Authenticate extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String name=req.getParameter("name");
		String password=req.getParameter("pasword");
		if(EmployeeDao.check(name, password)) {
			HttpSession session=req.getSession();
			session.setAttribute("name", name);
			res.sendRedirect("AddUser.jsp");	
		}
		else {
			res.sendRedirect("index.html");
			
		}
	}

}
