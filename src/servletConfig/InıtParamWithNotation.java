package servletConfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.HttpResponse;

import com.sun.xml.internal.bind.v2.runtime.Name;
@WebServlet(name="inýtParamWithNotation",urlPatterns={"/inýtParamWithNotation"},
			initParams={@WebInitParam(name="ozgurbircan",value="özgür bircan" ),
					@WebInitParam(name="comertbaldemir",value="cömert baldemir")})

public class InýtParamWithNotation extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws IOException
	{
		PrintWriter printWriter=httpServletResponse.getWriter();
		ServletConfig config=getServletConfig();
		Enumeration<String> enumeration=config.getInitParameterNames();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			printWriter.write(string);
		}
		
		
		
	}
	
}
