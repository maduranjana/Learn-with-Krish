<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Simple JSP/Servlet Program</title>
</head>
<body>
	<h1><%="Hello Users Enter Your Basic Details!"%>
	</h1>
	<form method="POST" action="Signup">
		<span>Email</span> <input type="text" name="email" placeholder="Email" />
		<br /> <span>User Name</span> <input type="text" name="uname"
			placeholder="Username" /> <br /> <span>Password</span> <input
			type="password" name="password" placeholder="Password" /> <br /> <input
			type="submit" value="SignUp" />
	</form>
	<br />
	<a href="Signup">User List</a>
</body>
</html>


