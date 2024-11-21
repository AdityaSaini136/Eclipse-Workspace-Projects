

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Profile")
public class Profile extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
//        HttpSession session = request.getSession(false);
//        System.out.println(session);
//        String name =(String)session.getAttribute("Name");
//         writer.print("Welcome "+name);
//       request.getRequestDispatcher("Product.jsp").forward(request, response);
        
	}
}
