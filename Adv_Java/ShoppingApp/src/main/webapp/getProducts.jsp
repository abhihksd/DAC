<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.Connection,java.sql.PreparedStatement" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% Connection con;
	con = (Connection)config.getServletContext().getAttribute("jdbccon");
	RequestDispatcher rd = request.getRequestDispatcher("/header");
	rd.include(request, response);
	
	PreparedStatement ps = null;
	ResultSet rs = null;
	int id = Integer.parseInt(request.getParameter("catid"));
	ps = con.prepareStatement("select * from product where cat_id=?");
	ps.setInt(1,id );
	rs = ps.executeQuery();
	%>
	<form action='addtocart'>
	Select Product:
	<select name='product'>
	<% while(rs.next()) { %>
	<%= "<option value='"+rs.getInt(1)+"'>" %>
	<%= rs.getString(2) %>
	</option>
	<% } %>
	</select><br/>
	<input type='submit' value='Add To Cart'/>
	</form>
	<a href='home'>Go Back</a>
	
</body>
</html>