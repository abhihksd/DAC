<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>List of Contacts</h1>
	
	<table border="1">
		<tr>

		<td>uid</td>
		<td>fname</td>
		<td>lname</td>
		<td>contactno</td>
		<td>email</td>
		<td>Edit</td>
		<td>Delete</td>
		</tr>
	
	
		<c:forEach var="contact" items="${clist}" >
		<tr>
		
		<td> ${contact.uid}</td>
		<td> ${contact.fname}</td>
		<td> ${contact.lname}</td>
		<td> ${contact.contactno}</td>
		<td>${contact.email} </td>
		<td><a href="edit?cid=${contact.cid}">EDIT</a> </td>
		<td><a href="">DELETE</a> </td>
		</tr>
		</c:forEach>
	</table>
	
	<a href="create">Create new Contact</a>
	<button href="create">Create New Contact </button>
</body>
</html>