package request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="RequestExample",urlPatterns={"/requestExample"})
public class RequestExample extends HttpServlet
{
  @Override
  public void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws IOException
  {
	  PrintWriter printWriter=httpServletResponse.getWriter();
	  String name=httpServletRequest.getParameter("firstName");
	  String surName=httpServletRequest.getParameter("secondName");
	  String gender=httpServletRequest.getParameter("radio");
	  String [] programLang =httpServletRequest.getParameterValues("cprogram");
	  String program = "";
	  for (int i = 0; i < programLang.length; i++) 
	  {
		  program+=" "+programLang[i];	
	}
	  printWriter.print("Ad "+name+" Soyad "+surName+" Cinsiyetiniz "+gender+" Hakim oldugunuz diller "+program);
	  
	  
	  
  }
  public void doPost(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws IOException
  {
	  PrintWriter printWriter=httpServletResponse.getWriter();
	  String name=httpServletRequest.getParameter("firstName");
	  String surName=httpServletRequest.getParameter("secondName");
	  String gender=httpServletRequest.getParameter("radio");
	  String [] programLang =httpServletRequest.getParameterValues("cprogram");
	  String program = "";
	  for (int i = 0; i < programLang.length; i++) 
	  {
		  program+=" "+programLang[i];	
	}
	  printWriter.print("Ad "+name+" Soyad "+surName+" Cinsiyetiniz "+gender+" Hakim olduðunuz diller "+program);
	  
	  
	  
  }
  
 
}
