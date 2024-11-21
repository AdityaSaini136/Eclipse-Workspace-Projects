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
<form action="products/edit" method="post">
     Name : <input type="test" name="productName" value ='<%= request.getParameter("name") %>'>
     Price : <input type="number" name="price" value ='<%= request.getParameter("price") %>'>
     MfgDate : <input type="date" name="mfgDate" value ='<%= request.getParameter("mfgdate") %>'>
     Quantity : <input type="number" name="qty" value ='<%= request.getParameter("quantity") %>'>
     <input type="hidden" name="id" value ='<%= request.getParameter("id") %>'>
     <input type ="submit" value = "Update">
     </form>
     
</body>
</html>