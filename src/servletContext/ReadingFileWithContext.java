package servletContext;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="ReadingFileWithContext",urlPatterns={"/ReadingFileWithContext"})
public class ReadingFileWithContext extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws IOException
	{
		ServletContext servletContext=getServletContext();
		InputStream txtStream=servletContext.getResourceAsStream("/WEB-INF/name.txt");
		int count;
		ServletOutputStream outputStream=httpServletResponse.getOutputStream();
		while((count=txtStream.read())!=-1)
		{
			outputStream.write(count);
			
		}
		
		
		
		
	}
	

}
