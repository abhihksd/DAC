package testing;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {

	public static void main(String[] args) throws Exception {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
    
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
		//Class.forName("con.mysql.cj,jdbc.Driver");
		String jdbcurl="jdbc:mysql://localhost:3306/knowitdb";
	     con=DriverManager.getConnection(jdbcurl,"root","root");
	    System.out.println("Connected");
	    
	    stmt=con.createStatement();
	    
	     rs=stmt.executeQuery("select * from emp");
	    
	    while(rs.next())
	    {
	    	System.out.print(rs.getInt(1)+" ");
	    	System.out.print(rs.getString(2)+" ");
	    	System.out.print(rs.getFloat(6));
	    	System.out.println();
	    }
    	rs.close();
    	stmt.close();
    	con.close();
    }
   
    
	}

