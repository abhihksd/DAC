package apps;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestCon {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbcurl="jdbc:mysql://localhost:3306/knowitdb";
		Connection con=DriverManager.getConnection(jdbcurl,"root","root");
		System.out.println("Connection established");
		con.close();

	}

}
