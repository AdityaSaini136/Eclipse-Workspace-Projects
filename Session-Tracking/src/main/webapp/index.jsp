<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="myform" method="post">
		Email:<input type="text" name="email" id=""> <br>
		Password <input type="password" name="password" id=""> <br>
		 <input type="submit"value="Login">
	</form>
	<a href="SessionDemo">Click Here</a>
	<br>
	<div>
	<form action="myervletName" method="get">
		<input type="text" name="myname" id=""> <br>
	    <input type="submit"value="save my name">
	</div>
	<a href="showmyname">Show  My Name </a>
	
</body>
</html>