<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
	border: 5px solid black;
	border-collapse: collapse;
}
</style>
<meta charset="ISO-8859-1">
<title>Employee view</title>
<%@page import="java.sql.*"%>
<%@page import="com.java.bridgelabz.servletcrud.employeedao.*"%>
<%@page import="java.util.*"%>
<%@page import="com.java.bridgelabz.servletcrud.model.*"%>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
if(session.getAttribute("name")==null){
	response.sendRedirect("index.html");
}
%>
	<table width="100%">
		<tr>
			<th>EmployeeId</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Age</th>
			<th>Mobile</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<tr>
			<%
				ArrayList<Employee> list = EmployeeDao.read();
				for (Employee emp : list) {
			%>
		
		<tr>
			<td><%=emp.getId()%></td>
			<td><%=emp.getFirst_name()%></td>
			<td><%=emp.getLast_name()%>
			<td><%=emp.getAge()%></td>
			<td><%=emp.getMobile()%></td>
			<td><a href="EditServlet?id=<%=emp.getId()%>">edit</a></td>
			<td><a href="DeleteServlet?id=<%=emp.getId()%>">delete</a></td>

			<%
				}
			%>


		</tr>
	</table>
	<form action="logout" method="post">
	<input type="submit" value="logout">
	
	</form>
</body>
</html>