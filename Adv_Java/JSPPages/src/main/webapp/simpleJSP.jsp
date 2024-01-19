<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP</h1>
	<br/>
	<!-- This is HTML comment -->
	<%--this is JSP comment --%>
	<br/>
	<%-- this is a scriplet--%>
	<% int a=0;
	out.print("Value of a:"+(++a));
	%>
	<br/>
	<% out.print(Calendar.getInstance().getTime()); %>
	<%--Expression --%>
	<%= Calendar.getInstance().getTime() %>
	<br/>
	<%! int iVar; %>
	<%= "value of iVar: "+(++iVar) %>
	
</body>
</html>