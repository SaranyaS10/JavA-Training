<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="Model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ProductDetails</title>
</head>
<body>
<table border="1">
<tr>
<th style=" background-color: lightblue; ">ProdDetails</th>
<tr><td>
<%Product p=(Product)request.getAttribute("ProdDetails");
out.print("The Item ID is:"+p.getItem_ID()+"\n");
out.print("The Item Name is:"+p.getItem_Name()+"\n");
out.print("The Quantity is:"+p.getQuantity()+"\n");
out.print("The Product_price is:"+p.getProduct_price()+"\n");
%>
</td></tr>
</table>
</body>
</html>