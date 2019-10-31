<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
if(session.getAttribute("name")==null){
	response.sendRedirect("index.html");
}
%>
<h3>register here</h3>

	<div class="container">
		<h1 class="jumbotron">
			Sign up to BridgeLab <br>
			<small>A custom Social Platform For BridgeLab</small>
		</h1>
		<br>
		<div class="jumbotron">
			<form class="form-inline" action="register" method="get">
				<div class="form-group">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="First Name"
							name="firstname"></input>
					</div>
					<div class="input-group">

						<input type="text" class="form-control" placeholder="Last Name"
							name="lastname"></input>

						<div class="input-group">

							<input type="text" class="form-control" placeholder="Age"
								name="age"></input>
						</div>
					</div>
					<div class="input-group">
						<input type="text" class="form-control" placeholder="mobile"
							name="mobile"></input>
					</div>
					<button type="submit" name="register"
						class="form-control btn btn-success">Sign Up</button>
				</div>
			</form>
		</div>
	</div>
	<form action="show" method="post">
		<button type="submit" name="show">show</button>
	</form>
</body>
</html>