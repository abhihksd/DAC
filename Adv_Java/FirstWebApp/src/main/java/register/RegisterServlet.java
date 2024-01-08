package register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    Connection con;
	@Override
	public void init(ServletConfig config) throws ServletException {
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

	
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			con.close();
			
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
		String u_id=request.getParameter("u_id");
		String password=request.getParameter("password");
		String fname=request.getParameter("fname");
		String mname=request.getParameter("mname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String contact=request.getParameter( "contact");
		PreparedStatement ps=null;
	
		int n;
		boolean flag=false;
		try {
			ps=con.prepareStatement("insert into users(u_id,password,fname,mname,lname,email,contact) values(?,?,?,?,?,?,?)");
			ps.setString(1, u_id);
			ps.setString(2, password);
			ps.setString(3, fname);
			ps.setString(4, mname);
			ps.setString(5, lname);
			ps.setString(6, email);
			ps.setString(7, contact);
			n=ps.executeUpdate();
			
			if(n>0)
			{
				
//				out.print("registered");
				RequestDispatcher rd=request.getRequestDispatcher("/Login.html");
				rd.forward(request, response);
				
			}
			else
			{
				
				out.print("not registered");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
