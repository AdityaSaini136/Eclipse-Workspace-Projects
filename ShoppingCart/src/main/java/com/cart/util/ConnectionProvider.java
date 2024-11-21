package com.cart.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	private static String url = "jdbc:mysql://localhost:3306/shopping_cart";
	private static String username = "root";
	private static String userpass = "root";
	static  Connection con ;
	public static  Connection getDBConnection (){
		//load the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create the connection 
			con = DriverManager.getConnection(url, username, userpass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}