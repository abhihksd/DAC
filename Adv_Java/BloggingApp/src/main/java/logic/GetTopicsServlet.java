package logic;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entites.Topic;

/**
 * Servlet implementation class GetTopicsServlet
 */
@WebServlet("/getTopics")
public class GetTopicsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		con =(Connection)config.getServletContext().getAttribute("jdbccon");		
	}
    public GetTopicsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Statement stmt=null;
		
		ResultSet rs;
		
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from topic");
			Set<Topic> topics=new HashSet<Topic>();
			while(rs.next())
			{
				Topic topic=new Topic(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				topics.add(topic);
			}
			getServletContext().setAttribute("topicsSet", topics);
			RequestDispatcher rd=request.getRequestDispatcher("DisplayTopics.jsp");
			rd.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
