package com.RegisterServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
   
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Connection connection = ConnectionProvider.getConnection();
		PrintWriter writer = resp.getWriter();
		String name = req.getParameter("name");
		String phonenumber = req.getParameter("phonenumber");
		try {
			PreparedStatement ps = connection.prepareStatement(Queries.queriesl);
			ps.setString(1, name);
			ps.setString(2, phonenumber);
 
			ResultSet resultSet = ps.executeQuery();
			if(resultSet.next()) {
				resp.sendRedirect("NewFile.html");
			}else {
				RequestDispatcher dispatcher = req.getRequestDispatcher("Login.html");
				dispatcher.include(req, resp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
