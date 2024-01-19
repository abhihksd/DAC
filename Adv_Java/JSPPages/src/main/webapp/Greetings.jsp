<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	SimpleDateFormat sdf = new SimpleDateFormat("HH");
	String hours = sdf.format(Calendar.getInstance().getTime());
	int hh = Integer.parseInt(hours);
	if (hh < 12) {
	%>
	<%="<h1> Good Morning</h1>"%>
	<%
	} else if (hh >= 12 && hh <= 16) {
	%>
	<%="<h1>Good Afternoon</h1>"%>
	<%
	} else if (hh > 16 && hh <= 21) {
	%>
	<%="<h1>Good Evening</h1>"%>
	<%
	} else {
	%>
	<%="<h1>Good Night</h1>"%>
	<%
	}
	%>


</body>
</html>