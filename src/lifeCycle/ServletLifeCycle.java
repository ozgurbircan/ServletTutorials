package lifeCycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("lifeCycle")
public class ServletLifeCycle extends HttpServlet 
{
	@Override
	public void init()
	{
		System.out.println("init metodu çaðrý");
	}
	@Override
	public void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws IOException
	{
		PrintWriter printWriter=httpServletResponse.getWriter();
		printWriter.write("yaþamý");
	}
	
	@Override
	public void destroy()
	{
		System.out.println("servlet destroy edildi.");
	}
	
}
