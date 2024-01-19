<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="update" modelAttribute="econ" >
		<form:input path="cid" readonly="true" /><br/>
		Enter fname: <form:input path="fname" /> <br/>
		Enter lname: <form:input path="lname" /> <br/>
		Enter uid: <form:input path="uid" /> <br/>
		Enter password: <form:input path="password" /> <br/>
		Enter email: <form:input path="email" /> <br/>
		Enter contact: <form:input path="contactno" /> <br/>
		<input type="submit" value="Update" />
	</form:form>
</body>
</html>