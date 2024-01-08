package testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UpdateEmp {

//	public static void main(String[] args) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		String jdbcurl="jdbc:mysql://localhost:3306/knowitdb";
//		Connection con=DriverManager.getConnection(jdbcurl,"root","root");
//		System.out.println("Connected");
//		Statement stmt=con.createStatement();
//		int n=stmt.executeUpdate("Update emp set sal=100 where empno=1003");
//		System.out.println(n+"  Updated");
//		stmt.close();
//		con.close();
//		
//	}

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String jdbcurl="jdbc:mysql://localhost:3306/knowitdb";
		Connection con=DriverManager.getConnection(jdbcurl,"root","root");
		
		PreparedStatement ps=con.prepareStatement("update emp set sal=? where empno=?");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter empno");
		int eno=Integer.parseInt(br.readLine());
		
		System.out.println("Enter new salary");
		float sal=Float.parseFloat(br.readLine());
		
		ps.setFloat(1,sal);
		ps.setInt(2, eno);
		
		int n=ps.executeUpdate();
		System.out.println(n+" record(s) updated");
		ps.close();
		con.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
