package com.java.servlet.crud.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.servlet.crud.dao.EmployeeDao;
import com.java.servlet.crud.model.Employee;

public class ViewServlet extends HttpServlet {
   public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	   res.setContentType("text/html");  
       PrintWriter out=res.getWriter();  
         
       out.println("<h1>List Of Employee</h1>");
       EmployeeDao obj=new EmployeeDao();
         
       List<Employee> list=obj.getAllEmployee();  
         
       out.print("<table border='1' width='100%'");  
       out.print("<tr><th>Id</th><th>FirstName</th><th>LastName</th><th>age</th><th>Mobile</th><th>Edit</th><th>Delete</th></tr>");  
       for(Employee e:list){  
        out.print("<tr><td>"+e.getId()+"</td><td>"+e.getFirst_name()+"</td><td>"+e.getLast_name()+"</td><td>"+e.getAge()+"</td><td>"+e.getMobile()+"</td><td><a href='EditServlet?id="+e.getId()+"'>edit</a></td> <td><a href='DeleteServlet?id="+e.getId()+"'>delete</a></td></tr>");  
       }  
       out.print("</table>");  
         
       out.close();  
   }  
 
   }
	
	


