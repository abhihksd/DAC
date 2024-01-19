<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
<c:forEach var="topic" items="${applicationScope.topicsSet}" >
	<li><a href="getComments?topicid=${topic.topicid}">${topic.name}</a>  </li>
</c:forEach>
</ul>
</body>
</html>