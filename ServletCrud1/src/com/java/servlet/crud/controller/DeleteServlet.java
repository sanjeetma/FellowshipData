package com.java.servlet.crud.controller;

import java.io.IOException;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.servlet.crud.dao.EmployeeDao; 

public class DeleteServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	
		int id = Integer.parseInt(req.getParameter("id"));
        EmployeeDao obj=new EmployeeDao();
        obj.delete(id);  
        res.sendRedirect("ViewServlet");  
    }  
	}


