package logic;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entites.Comment;

/**
 * Servlet implementation class GetCommentServlet
 */
@WebServlet("/getComments")
public class GetCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public GetCommentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    Connection con;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		con=(Connection)config.getServletContext().getAttribute("jdbccon");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			int topicid=Integer.parseInt(request.getParameter("topicid"));
			ps=con.prepareStatement("select * from comments where topicid=?");
			ps.setInt(1, topicid);
			rs=ps.executeQuery();
			Set<Comment> comments=new HashSet<>();
			while(rs.next())
			{
				comments.add(new Comment(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4)));	
			}
			getServletContext().setAttribute("comments", comments);
			RequestDispatcher rd=request.getRequestDispatcher("DisplayComments.jsp");
			rd.forward(request, response);
			
			
		}catch(Exception e )
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
