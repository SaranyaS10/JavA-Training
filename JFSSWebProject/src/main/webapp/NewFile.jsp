<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
  
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tags</title>
</head>
<body>
<p> Now time is:
<%=new java.util.Date()%></p>
<c:set var="String" value="Welcome Session!!!"/>
<c:if test="${fn:contains(String, 'Session')}">
<p>Yes.... String contains the word session</p>
</c:if>
<c:if test="${fn:contains(String, 'Welcome')}">
<p>Yes.... String contains the word Welcome </p>
</c:if>
<p>c:forEach : </p>
<c:forEach var="j" begin="1" end="5"> Item
<c:out value="${j}"/>
</c:forEach>
<p>c:import : </p>
<c:import var="details" url="https://learning.futuretech.co.in/lms/"/>  
<p>Before Remove tag:<c:out value="${details}"/></p>
<p>c:remove: </p>
<p>After Remove tag:<c:remove var="details"/> </p>

<c:out value="${'<h2> Welcome you all to JSTL</h2>'}"/>
<a href="<c:url value="Welcome.jsp"/>">Home Page</a>

<p>fn:containsIgnoreCase : </p>
<c:set var="String" value="Welcome Session!!!"/>
<c:if test="${fn:containsIgnoreCase(String, 'session')}">
<p>Yes.... String contains the word session</p>
</c:if>
<c:if test="${fn:containsIgnoreCase(String, 'welcome')}">
<p>Yes.... String contains the word Welcome </p>
</c:if>

<p>fn:endsWith : </p>
<c:set var="String" value="Welcome to JSP Session"/>
<c:if test="${fn:endsWith(String, 'Session')}">
<p>Yes.... String ends with session</p>
</c:if>
<c:if test="${fn:endsWith(String, 'Welcome')}">
<p>Yes.... String ends with Welcome </p>
</c:if>

<p>fn:trim : </p>
<c:set var="String" value="Welcome to JSP      Session    "/>
<p>String is trimmed : ${fn:trim(String)}</p>  

<p>fn:startsWith : </p>
<c:set var="String" value="Welcome to JSP Session"/>
<c:if test="${fn:startsWith(String, 'Session')}">
<p>Yes.... String starts with session</p>
</c:if>
<c:if test="${fn:startsWith(String, 'Welcome')}">
<p>Yes.... String starts with Welcome </p>
</c:if>

<p>fn:substring : </p>
<c:set var="String" value="Welcome to JSP Session"/>
<p>substring is  : ${fn:substring(String,2,18)}</p> 

<%
out.println(request.getClass());
out.println("\n<h5> "+application.getContextPath()+"\n<h5>");
out.println("\n<h5> "+page.getClass()+"\n from page <h5>");
out.println("\n<h5> "+config.getClass()+"\n from config <h5>");
int len=request.getContentLength();
out.println("\n getContentLength() "+len+"\n");
String s=page.toString();
out.println("toString() :"+s +"\n");
int hashcode=page.hashCode();
out.println("\n hashcode() :"+hashcode+"\n");

String s1=application.getServerInfo();
out.println("\n getServerInfo() :"+s1+"\n");
out.println("getEffectiveMajorVersion()" + application.getEffectiveMajorVersion()+"\n from application ");
int mv=application.getMinorVersion();
out.println("\n getMinorVersion() :"+mv+"\n");
out.println("getServletContextName()" +application.getServletContextName()+"\n from application ");
out.println("getRequestCharacterEncoding()" +application.getRequestCharacterEncoding()+"\n from application ");
out.println("getVirtualServerName()" +application.getVirtualServerName()+"\n from application ");
out.println("getSessionTimeout()" +application.getSessionTimeout()+"\n from application ");

out.println("From config getInitParameter()"+config.getInitParameter(""));


%>

</body>
</html>