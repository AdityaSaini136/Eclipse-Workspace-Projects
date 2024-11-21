import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionDemo extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		//String email = request.getParameter("email");
		//String password = request.getParameter("password");
		//writer.print("Email >> : "+email+ "Password  >> : "+password);
				//HttpSession session = request.getSession();
				//boolean new1 = session.isNew();
				//PrintWriter printWriter = response.getWriter();
				//printWriter.print("Responce from session    "+new1);
		//Cookie[] cookies = request.getCookies();
		//for(int i=0;i<cookies.length; i++) {
		  //writer.println(cookies[i].getName()+""+cookies[i].getValue());
		//}
	}
}