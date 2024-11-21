import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Register")
public class Register extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Connection connection = CoonnectionProvider.getConnection();
		String name = req.getParameter("name");
		String custid = req.getParameter("custid");
		String mnumber = req.getParameter("mnumber");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		PrintWriter writer = resp.getWriter();
		HttpSession session = req.getSession();
		if(session.isNew()) {
			session.setAttribute("Name", name);
			session.setAttribute("Pass", pass);
			try {
				PreparedStatement ps = connection.prepareStatement("insert into testTb(name,custmerId,mobilenumber,email,pass) values(?,?,?,?,?)");
				ps.setString(1, name);
				ps.setString(2, custid);
				ps.setString(3, mnumber);
				ps.setString(4, email);
				ps.setString(5, pass);
				int eu = ps.executeUpdate();
				if(eu>0) {
					writer.print("You are Successfully Registered");
					req.getRequestDispatcher("Login.html").forward(req, resp);
				}else {
					writer.print("You are Not Registered");
					
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}