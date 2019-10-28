<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@page import="java.sql.*"%>
</head>
<body>
<table border="4">
<tr>
<td>id</td>
<td>FirstName</td>
<td>LastName</td>
<td>age</td>
<td>Mobile</td>
</tr>

<%
try {
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/employee";
	Connection con=DriverManager.getConnection(url,"root","root");
	String sql="select * from Emp"; 
    PreparedStatement insertstmt = con.prepareStatement(sql);
   ResultSet rs=insertstmt.executeQuery();
   while(rs.next()) {

	   %>
	    <tr><td><%=rs.getInt(1) %></td>
	    <td><%=rs.getString(2) %></td>
	    <td><%=rs.getString(3) %></td>
	    <td><%=rs.getInt(4) %></td>
	    <td><%=rs.getInt(5) %></td>
	    </tr>
	        <%
   }
   %>
   </table>
   <%
  
   con.close();
}
 catch (ClassNotFoundException e) {
	
	e.printStackTrace(); 
} catch (SQLException e) {
	
	e.printStackTrace();
}


%>

		
</body>
</html>