import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieStore;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;
public class MyServletName extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		writer.print("Email >> : "+email+ "  Password  >> : "+password);
		response.setContentType("text/html");
		//		//HttpSession session = request.getSession();
		//		//System.out.println("MySerletName  "+session);
		//		//session.setAttribute("username", request.getParameter("myname"));
		//		writer.print("Responce from Save My Name Servlet ... ");
		//		String name = (String)session.getAttribute("email");
		//		String password = (String)session.getAttribute("password");
		//		writer.print(name +""+password);
		//		 Cookie ck = new Cookie("Email", email);
		//		 Cookie ck2 = new Cookie("Password", password);
		//		 System.out.println(ck+"========"+ck2);
		//		 response.addCookie(ck);
		//		 response.addCookie(ck2);
		HttpSession session = request.getSession(true);
		if(session.isNew()) {
			session.setAttribute("email", email);
			session.setAttribute("password", password);
		}
		response.sendRedirect("ShowNameServlet");
		//writer.println("<a href='ShowNameServlet'> Go");


	}
}