package com.java.servlet.crud.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.servlet.crud.dao.EmployeeDao;
import com.java.servlet.crud.model.Employee;

public class EditServlet extends HttpServlet {

	public void show(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("dshdsdhsdhs");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>Update Employee</h1>");
		int id = Integer.parseInt(req.getParameter("id"));
        EmployeeDao object=new EmployeeDao();
		Employee emp = object.getEmployee(id);

		out.print("<form action='EditServlet2' method ='POST'>");
		out.print("<table>");
		out.print("<tr><td></td><td><input type='text' name='firstname' value='" + emp.getFirst_name() + "'/></td></tr>");
		out.print("<tr><td>Name:</td><td><input type='text' name='lastname' value='" + emp.getLast_name() + "'/></td></tr>");
		out.print("<tr><td>Password:</td><td><input type='text' name='age' value='" + emp.getAge()
				+ "'/>  </td></tr>");
		out.print("<tr><td>Email:</td><td><input type='text' name='mobile' value='" + emp.getMobile() + "'/></td></tr>");
		out.print("</select>");
		out.print("</td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");
		out.print("</table>");
		out.print("</form>");

		out.close();
	}

}
