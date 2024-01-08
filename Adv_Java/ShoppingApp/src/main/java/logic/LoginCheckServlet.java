package logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.User;

@WebServlet("/logincheck")
public class LoginCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		con = (Connection)config.getServletContext().getAttribute("jdbccon");		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		//read request parameters
		String u = request.getParameter("uid");
		String p= request.getParameter("pwd");
		
		//jdbc
		PreparedStatement ps = null;
		ResultSet rs = null;
		try
		{
			ps = con.prepareStatement("select * from users where u_id = ? and password = ?");
			ps.setString(1, u);
			ps.setString(2, p);
			rs = ps.executeQuery();
			
			boolean flag = false;
			User user = null;
			while(rs.next())
			{
				if(rs.getString(1).equals(u) && rs.getString(2).equals(p))
				{
					user = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
					flag = true;
					break;
				}
			}
			if(flag)
			{
				Cookie [] all = request.getCookies();
				if(all != null)
				{
					for(Cookie c : all)
					{
						if(c.getName().equals("loginerror"))
						{
							c.setMaxAge(0);
							response.addCookie(c);
						}
					}
				} 
				HttpSession session = request.getSession();
				session.setAttribute("loggedinuser", user);				
				
				int m=0;
				//trying to enter login time in logs here 
				PreparedStatement ps1=null;
				try {
					ps1=con.prepareStatement("insert into logs(u_id,login) values(?,now())");
					ps1.setString(1,u);
					 m=ps1.executeUpdate();
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
				RequestDispatcher rd = request.getRequestDispatcher("/home");
				rd.forward(request, response);
			}
			else 
			{
			
				//create cookie
				Cookie c = new Cookie("loginerror","Wrong_UID/pwd");
				response.addCookie(c);
				response.sendRedirect("/ShoppingApp/login.jsp");
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try
			{
				rs.close();
				ps.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}		
	}

}
