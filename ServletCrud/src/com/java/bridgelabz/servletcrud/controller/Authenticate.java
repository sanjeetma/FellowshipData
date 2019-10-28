package com.java.bridgelabz.servletcrud.controller;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Authenticate extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String name=req.getParameter("name");
		String pass=req.getParameter("pasword");
		if(name.compareTo("sanjeet")==0 && (pass.compareTo("12345")==0)) {
			res.sendRedirect("Adduser.html");
		}
		else {
			ServletOutputStream out=res.getOutputStream();
			out.println("your username and password not matching");
			
		}
	}

}
