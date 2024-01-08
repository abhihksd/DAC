package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(
		description = "for checking login", 
		urlPatterns = { 
				"/LoginServlet", 
				"/logincheck"
		})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    Connection con;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbcurl="jdbc:mysql://localhost:3306/shoppingdb";
		con=DriverManager.getConnection(jdbcurl,"root","root");
		System.out.println("connection established");
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String uid=request.getParameter("uid");
		String pwd=request.getParameter("pwd");
//		if(uid.equals("abhi") && pwd.equals("1234"))
//		out.print("success");
//		else
//			out.print("failure");
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			ps=con.prepareStatement("select u_id,password from users where u_id=? and password=?" );
			ps.setString(1,uid);
			ps.setString(2,pwd);
			rs=ps.executeQuery();
			boolean flag=false;
			while(rs.next())
			{
				if(rs.getString(1).equals(uid) && rs.getString(2).equals(pwd) )
					flag=true;
				break;
			}
			if(flag) {
				out.print("Login success");
			RequestDispatcher rd=request.getRequestDispatcher("/success");
			rd.forward(request, response);
			}
			else {
				out.print("Login failed");
				RequestDispatcher rd=request.getRequestDispatcher("/error");
				rd.forward(request, response);
				
			}
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
