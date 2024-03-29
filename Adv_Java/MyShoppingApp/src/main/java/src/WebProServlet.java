package src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebProServlet
 */
@WebServlet(
		urlPatterns = { "/webpro" }, 
		initParams = { 
				@WebInitParam(name = "subject", value = "web Programming")
		})
public class WebProServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public WebProServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		ServletConfig config=getServletConfig();
		String sub=config.getInitParameter("subject");
		
		ServletContext context=getServletContext();
		String provider=context.getInitParameter("provider");
		
		out.print("Training on "+ sub+" by "+ provider);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
