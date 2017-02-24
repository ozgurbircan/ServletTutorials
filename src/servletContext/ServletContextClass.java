package servletContext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextClass extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws IOException
	{
		ServletContext servletContext=getServletContext();
		PrintWriter printWriter=httpServletResponse.getWriter();
		Enumeration<String> enumeration=servletContext.getInitParameterNames();
		
		while (enumeration.hasMoreElements()) {
			printWriter.write((String) enumeration.nextElement());
			
		}
		
		
	}
	
}
