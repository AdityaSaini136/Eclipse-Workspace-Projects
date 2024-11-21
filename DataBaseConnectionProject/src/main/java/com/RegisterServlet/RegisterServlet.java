package com.RegisterServlet;

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

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection connection = ConnectionProvider.getConnection();
		PrintWriter writer = response.getWriter();
		String name = request.getParameter("name");
		String fathername = request.getParameter("fathername");
		String address = request.getParameter("address");
		String rollnumber = request.getParameter("rollnumber");
		String email = request.getParameter("email");
		String phonenumber = request.getParameter("phonenumber");
		try {
			PreparedStatement ps = connection.prepareStatement(Queries.queries);
			ps.setString(1, name);
			ps.setString(2, fathername);
			ps.setString(3, address);
			ps.setString(4, rollnumber);
			ps.setString(5, email);
			ps.setString(6, phonenumber);
			int update = ps.executeUpdate();
			if(update>0) {
				writer.print("You are successfully registered");
			}else {
				writer.print("You are not registered");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
