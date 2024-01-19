<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="userinfo"  class="beans.User" scope="session"/>
	<%-- 
	<jsp:setProperty property="uid" name="userinfo"  />
	<jsp:setProperty property="pwd" name="userinfo"/>
	<jsp:setProperty property="fname" name="userinfo"/>
	<jsp:setProperty property="lname" name="userinfo"/>
	<jsp:setProperty property="email" name="userinfo"/>
	<jsp:setProperty property="contact" name="userinfo"/>
	<jsp:setProperty property="age" name="userinfo"/>
	--%>
	<jsp:setProperty property="*" name="userinfo"  />
	
	<jsp:forward page="displayBean.jsp" />
	
</body>
</html>