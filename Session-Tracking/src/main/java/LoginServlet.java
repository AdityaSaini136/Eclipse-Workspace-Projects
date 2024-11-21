import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		PrintWriter writer = resp.getWriter();
//		String email = req.getParameter("email");
//		String password = req.getParameter("password");
//		writer.print("Email >> : "+email+ "  Password  >> : "+password);
//		resp.setContentType("text/html");
		//Hidden Form Field.....@@
		//		writer.println("<html><body><form action ='SessionDemo'>");
		//		writer.println("<input type='hidden' name='email' value='"+email+"'/>");
		//		writer.println("<input type ='hidden' name ='password' value='"+password+"'/>");
		//		writer.println("<input type ='submit'/>");
		//		writer.println("</form></body></html>");

		//URL Rewriting...@@
		//writer.println("<a href='SessionDemo?email="+email+"&password="+password+"'>Next");

		// Cookies.............@@
//        Cookie cookie1 = new Cookie("email", email);
//		Cookie cookie2 = new Cookie("password", password);
//		resp.addCookie(cookie1);
//		resp.addCookie(cookie2);
//		writer.println("<a href ='SessionDemo'>Next");
//		HttpSession........@
//		HttpSession session = req.getSession();
//		System.out.println(session);
//		session.setMaxInactiveInterval(1);
//		//System.out.println(session.isNew());
//		PrintWriter writer2 = resp.getWriter();
//		writer2.print(session);
//		if(session.isNew()) {
//		session.setAttribute("email", email);
//		session.setAttribute("password", password);
//		writer.println("<a href ='myervletName'>Next");
//		}else {
//			resp.sendRedirect("index.jsp");
//		}
	}
}