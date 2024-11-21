import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ShowNameServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//HttpSession session = request.getSession();
		PrintWriter printWriter = response.getWriter();
		//System.out.println("Show  Name"+session);
		//String Name  = (String)session.getAttribute("username");
		//printWriter.print("Responce from session : >>>"+Name);

		//		Cookie[] cookies = request.getCookies();
		//		System.out.println(cookies);
		//		//printWriter.print(cookies[0].getName());
		//		printWriter.print(cookies[0].getValue());
		//		printWriter.print(cookies[1].getValue());
		//for(int i=0; i<cookies.length; i++) {
		//	System.out.println(cookies[i].getName()+""+cookies[i].getValue());
		//}
		
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		if(!session.isNew()) {
			String email = (String)session.getAttribute("email");
			String password = (String)session.getAttribute("password");
			printWriter.print(email+"  "+password);
		}		
	}
}