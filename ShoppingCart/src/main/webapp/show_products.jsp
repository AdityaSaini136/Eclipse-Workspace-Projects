<%@page import="com.cart.beans.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
	function edit(id, name, mfgdate, price, quantity) {
		window.location.href='../edit_product.jsp?id='+id+'&name='+name+'&mfgdate='+mfgdate+'&price='+price+'&quantity='+quantity;
	}
	
	function deleteProduct(id) {
		if (confirm("Are you sure you want to delete?")){
			window.location.href='delete?id='+id;
		}
		
	}
</script>
</head>
<body>
<table border="1" width="70%" align="center">
	<th>Name</th>
	<th>Mfg Date</th>
	<th>Price</th>
	<th>Quantity</th>
	
	<% 
		Boolean res  = (Boolean)request.getAttribute("result");
		if(res!=null){
			if(res)
				out.print("Product deleted.");
			else 
				out.print("Could not delete product.");
		}
			
		
	%>
	
	<% 
		List<Product>  products= (List<Product>)request.getAttribute("products");
		for(Product p  :  products){
	%>
	
	<tr>
		<td><%= p.getName() %></td>
		<td><%= p.getMfgDate() %></td>
		<td><%= p.getPrice()%></td>
		<td><%= p.getQuantity()%></td>
		<td><input type="button" value="Edit" onclick="edit('<%= p.getId()%>', 
		'<%= p.getName() %>','<%= p.getMfgDate() %>','<%= p.getPrice() %>','<%= p.getQuantity() %>')"></td>
		<td><input type="button" value="Delete" onclick="deleteProduct('<%= p.getId()%>')"></td>
	</tr>
	
	<% } %>
	
</table>
</body>
</html>