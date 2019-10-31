package com.java.bridgelabz.servletcrud.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {

	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		HttpSession session=req.getSession();
		session.invalidate();
		try {
			res.sendRedirect("index.html");
		} catch (IOException e) {
			System.out.println("page not found");
		}
	}
	
}
