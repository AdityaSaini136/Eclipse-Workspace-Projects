<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function validateLogin() {
		var userName = document.getElementById('uname').value;
		var password = document.getElementById('password').value;
		if (userName != '' && password != '') {
			return true;
		}
		alert("UserName && Password can't be blank");
		return false;
	}
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
 String msg = (String)request.getAttribute("msg");
%>
<body>
	<% 
if(msg!=null){
out.print(msg);
}
%>
	<form action="login" method="post" onsubmit="return validateLogin();">
		<table align="center" widhth="1005">
			<tr>
				<td>User Name:</td>
				<td><input type="test" name="uname" id="uname"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" id="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="login"></td>
			</tr>
		</table>
	</form>
</body>
</html>