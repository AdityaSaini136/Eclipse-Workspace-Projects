package com.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addProduct")
public class ProductsServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Connection dbConnection = ConnectionProvider.getDBConnection();
		PrintWriter printWriter = resp.getWriter();
		String productName = req.getParameter("productName");
		String price = req.getParameter("price");
		String qty = req.getParameter("qty");
		try {
			PreparedStatement prepareStatement = dbConnection.prepareStatement(SQLConstatnts.INSERT_PRODUCT_SQL);
			prepareStatement.setString(1,productName);
			prepareStatement.setString(2,price);
			prepareStatement.setString(3,qty);
			int ep = prepareStatement.executeUpdate();
			if(ep>0) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("/DisplayServlet");
				requestDispatcher.forward(req, resp);
				//printWriter.print("Product Add Successfully...!");
			}else {
				printWriter.print("Somthing went wrong..!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
} 
