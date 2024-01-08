package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PrepStmt {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbcurl="jdbc:mysql://localhost:3306/knowitdb";
		Connection con=DriverManager.getConnection(jdbcurl,"root","root");
		System.out.println("Connected");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emp order by SAL desc");
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.println(rs.getFloat(6)+" ");
		}
		
		
		
		
		
		

	}

}
