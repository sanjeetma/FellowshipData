package com.java.bridgelabz.servletcrud.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.sendRedirect("view.jsp");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
