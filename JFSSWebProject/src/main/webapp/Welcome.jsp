<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyWebPage</title>
</head>
<body>

<h2> Welcome everyone!!!<h2>

Today Date is:
<% 
Date date=new Date();
out.print(date.toString());
%>
   <form method="post" action="MyServlet">
<table>
<tr>
<td>
Product ID
</td>
<td>
<input type="text" name="ProductID">
</td>
</tr>
<tr>
<td>
Product Name
</td>
<td>
<input type="text" name="Productname">
</td>
</tr>
<tr>
<td>
Product Quantity
</td>
<td>
<input type="text" name="Productquantity">
</td>
</tr>
<tr>
<td>
Product Rate
</td>
<td>
<input type="text" name="Productrate">
</td>
</tr>
<tr>
<td>
<input type="submit" value="ProductPage">
</td>
</tr>
</table>
</form>
</body>
</html>