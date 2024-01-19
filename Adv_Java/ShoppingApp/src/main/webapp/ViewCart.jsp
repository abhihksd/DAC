
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List"   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Connection con;
	con = (Connection)config.getServletContext().getAttribute("jdbccon");
	List<Integer> plist = null;
	plist =(List)session.getAttribute("cart");
	%>
	<% if(plist == null)
	{ %>
	<h2> Cart is empty </h2>
	<br/> <a href='home'> Go back for selection </a>
	<% } else { %>
	<table border=1>
	<tr>
	<td>S.No</td>
	<td>Name</td>
	<td>Price</td>
	<tr>
	<% PreparedStatement ps = null;
	ResultSet rs = null; %>
	<% int count = 0;
	float total = 0;
	for(int n : plist)
	{
		ps = con.prepareStatement("select * from product where p_id = ?");
		ps.setInt(1, n);
		rs = ps.executeQuery();
		rs.next(); %>
		<tr>
		<%= "<td>"+ (++count) + "</td>" %>
		<%= "<td>"+ rs.getString(2)+ "</td>" %>
		<%= "<td>"+rs.getFloat(4)+ "</td>" %>
		</tr>
		<% total += rs.getFloat(4); %>
	<%}%>	
	<tr>
	<td colspan='2'> Total price </td>
	<%= "<td>"+total+"</td>" %>
	</tr>
	</table>
	<%session.setAttribute("tprice", total ); %>
	<br/> <a href='home'> Go back selection </a>
	<br/> <a href='confirmcart'> Confirm cart </a>
	<%} %>
	
	
		
	
</body>
</html>