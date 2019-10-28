package com.java.bridgelabz.servletcrud.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Editservlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		res.sendRedirect("Edit.jsp?id=" + id);
	}
}
