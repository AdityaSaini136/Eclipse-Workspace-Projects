import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieStore;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String name = request.getParameter("name");
//		String pass = request.getParameter("pass");
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		String name =(String)session.getAttribute("Name");
        String pass =(String)session.getAttribute("Pass");
        System.out.println(("Welcome "+name+ "  " +pass));
		request.getRequestDispatcher("Product.jsp").forward(request, response);
	}
}
