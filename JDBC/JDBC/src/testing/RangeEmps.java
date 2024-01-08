package testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RangeEmps {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbcurl="jdbc:mysql://localhost:3306/knowitdb";
		Connection con=DriverManager.getConnection(jdbcurl,"root","root");
		    System.out.println("Connected");
		    PreparedStatement ps =con.prepareStatement("Select * from emp where sal between ? and ?");
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter the range of salary min and max");
		  int min=Integer.parseInt(br.readLine());
		  int max=Integer.parseInt(br.readLine());
		  
		  ps.setInt(1, min);
		  ps.setInt(2, max);
		  ResultSet rs=ps.executeQuery();
		  while(rs.next())
		  {
			  System.out.print(rs.getInt(1)+" "+rs.getString(2)+""+rs.getString(3)+""+rs.getFloat(6)+"\n");
		  }
		  rs.close();
		  ps.close();
		  con.close();
		  
		  
		  
	}

}
