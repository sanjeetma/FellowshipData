<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
<meta charset="ISO-8859-1">
<title>Edit Details</title>
<%@page import="java.sql.*"%>
<%@page import="com.java.bridgelabz.servletcrud.employeedao.*"%>
<%@page import="java.util.*"%>
<%@page import="com.java.bridgelabz.servletcrud.model.*"%>
</head>
<body>

	<form action="EditServlet2" method="post">
		<%
			int id = Integer.parseInt(request.getParameter("id"));
			ArrayList<Employee> list = EmployeeDao.readById(id);
			for (Employee emp : list) {
		%>
		<input type="text" name="id" value=<%=emp.getId()%>> <input
			type="text" name="firstname" value=<%=emp.getFirst_name()%>>
		<input type="text" name="lastname" value=<%=emp.getLast_name()%>>
		<input type="text" name="age" value=<%=emp.getAge()%>> <input
			type="text" name="mobile" value=<%=emp.getMobile()%>>

		<%
			}
		%>
		<input type="submit">
	</form>
</body>
</html>