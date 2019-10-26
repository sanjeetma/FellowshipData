package com.java.servlet.crud.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Auntheticate extends HttpServlet{
	
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String name=(req.getParameter("name"));
		String password=(req.getParameter("password"));
		ServletOutputStream output=res.getOutputStream(); 
		if(password.compareToIgnoreCase("12345")==0 && name.compareToIgnoreCase("sanjeet")==0) {
			  res.sendRedirect("adduser.html");
			
		}
		else {
			output.println("password is Wrong");
		}
		
		
	}
}
