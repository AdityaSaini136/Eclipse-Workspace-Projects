<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
You can Add  from this page...!
<form action="products/add" method="post">
     Name : <input type="test" name="productName">
     Price : <input type="number" name="price">
     MfgDate : <input type="date" name="mfgDate">
     Quantity : <input type="number" name="qty">
     <input type ="submit" value = "Add">
     </form>
     
     <a href="products/getAll"> Show All</a>
</body>
</html>