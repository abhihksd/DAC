package logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.User;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con;
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		con = (Connection)config.getServletContext().getAttribute("jdbccon");		
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		if(session != null)
		{
			
			//logout 
			
			PreparedStatement ps1 = null;
			String uid = ((User)session.getAttribute("loggedinuser")).getUid();
		
			try {
				ps1=con.prepareStatement("update logs set logout=now() where u_id=? and logout is null");
				ps1.setString(1,uid);
				ps1.executeUpdate();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			
			session.invalidate();
			out.print("<br/>logged out");
			out.print("<br/> <a href='login.jsp'> Login</a> ");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
