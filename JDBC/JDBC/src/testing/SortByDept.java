package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;

import entites.Emp;

import java.util.*;

public class SortByDept {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbcurl="jdbc:mysql://localhost:3306/knowitdb";
		Connection con=DriverManager.getConnection(jdbcurl,"root","root");
		System.out.println("COnnected...");
		
		//empty object holding the query
		Statement stmt=con.createStatement();
		Set<Emp> set1=new HashSet<Emp>(); 
		ResultSet rs=stmt.executeQuery("select * from emp");
		while(rs.next())
		{
			//to be continued...
			Emp e =new Emp(rs.getInt(1),rs.getString(2),rs.getFloat(6),rs.getInt(8));
			set1.add(e);
		}
		for(Emp e1:set1)
		{
			System.out.println(e1);
			
		}
	
		

	}

}
