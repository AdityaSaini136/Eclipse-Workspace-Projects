package com.db.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class controller {
	public static void main(String[] args) {

		System.out.println(save());
	}

	public static boolean save() {
		Employee emp1 = new Employee(10,"Aditya", "IBM");	
		Connection connection = ConnectionProvider.getconnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into employee(id,ename,cmpyname) values(?,?,?)");
			ps.setInt(1, 1);
			ps.setString(2, "Rinku");
			ps.setString(3, emp1.getCmyname());
			System.out.println("programm chl gya");
			return ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}