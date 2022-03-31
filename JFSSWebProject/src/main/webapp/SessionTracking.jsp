<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="java.io.*,java.util.*" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Date createTime=new Date(session.getCreationTime());
Date lastAcessTime=new Date(session.getLastAccessedTime());

String title ="Welcome";
Integer visitCount=new Integer(0);
String visitCountKey=new String("visitCount");
String userIDkey=new String("userID");
String userID=new String("ABCD");

if(session.isNew())
{
	title="Welcome";
	session.setAttribute(userIDkey, userID);
	session.setAttribute(visitCountKey, visitCount);
}
visitCount=(Integer)session.getAttribute(visitCountKey);
visitCount=visitCount+1;
userID=(String)session.getAttribute(userIDkey);
session.setAttribute(visitCountKey, visitCount);
%>
</body>
</html>