package com.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		Connection dbConnection = ConnectionProvider.getDBConnection();
		PrintWriter printWriter = resp.getWriter();
		try {
			PreparedStatement prepareStatement =  dbConnection.prepareStatement(SQLConstatnts.SELECT_PRODUCT_SQL);
			ResultSet resultSet = prepareStatement.executeQuery();
			System.out.println(resultSet);
			while(resultSet.next()) {
				String ProductName = resultSet.getString(1);
				String Price = resultSet.getString(2);
				String Qty = resultSet.getString(3);
				System.out.println(ProductName);
				printWriter.print("<h1> ProductName :" +ProductName+  "</h1>");
				printWriter.print("<h1> Price :" +Price+  "</h1>");
				printWriter.print("<h1> Qty :" +Qty+  "</h1>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
}
