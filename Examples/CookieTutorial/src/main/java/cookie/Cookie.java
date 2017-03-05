package cookie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="Cookie",urlPatterns={"/cookie"})
public class Cookie extends HttpServlet 
{
	@Override
	public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
	{
		
		try {
			
			javax.servlet.http.Cookie cookie1=new javax.servlet.http.Cookie("ad", "ozgur");
			javax.servlet.http.Cookie cookie2=new javax.servlet.http.Cookie("ad", "comert");
			javax.servlet.http.Cookie cookie3=new javax.servlet.http.Cookie("ad", "emre");
			cookie3.setMaxAge(30);
			httpServletResponse.addCookie(cookie1);
			httpServletResponse.addCookie(cookie2);
			httpServletResponse.addCookie(cookie3);
			httpServletResponse.addHeader("Set-Cookie", "soyad=bircan");
			javax.servlet.http.Cookie[] c=httpServletRequest.getCookies();
		if (c!=null) 
			{
			for (javax.servlet.http.Cookie cookie : c) {
				System.out.println("Cookie "+cookie.getName()+"Value "+cookie.getValue());
				
			}
				
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
