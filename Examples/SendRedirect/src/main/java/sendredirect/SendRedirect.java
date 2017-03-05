package sendredirect;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="SendRedirect",urlPatterns="/sendRedirect")
public class SendRedirect extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse)
	{
		try {
			//httpServletResponse.sendRedirect("http://ozgurbircan.com");
			httpServletResponse.sendRedirect("NewFile.html");

		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
