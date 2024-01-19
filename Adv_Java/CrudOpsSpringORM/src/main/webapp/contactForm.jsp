<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Form</title>
</head>
<body>
	<h1>Create Contact</h1>
	<form:form action="save" modelAttribute="con" >
		Enter fname: <form:input path="fname" /> <br/>
		Enter lname: <form:input path="lname" /> <br/>
		Enter uid: <form:input path="uid" /> <br/>
		Enter password: <form:input path="password" /> <br/>
		Enter email: <form:input path="email" /> <br/>
		Enter contact: <form:input path="contactno" /> <br/>
		<input type="submit" value="Create new" />
	</form:form>
</body>
</html>