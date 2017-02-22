package servletConfig;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletConfigClass
 */
@WebServlet("/servletConfigClass")
public class servletConfigClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletConfigClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig config=getServletConfig();
		response.getWriter().write("<html><body>");
		response.getWriter().write("<li>");

		response.getWriter().write(config.getInitParameter("ozgurbircan"));
		response.getWriter().write("<li>");
		response.getWriter().write(config.getInitParameter("comertbaldemir"));
		response.getWriter().write("<li>");

		response.getWriter().write("Server Name "+config.getServletName());
		response.getWriter().write("</html></body>");

		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
