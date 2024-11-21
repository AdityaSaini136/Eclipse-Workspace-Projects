package com.cart.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cart.beans.Product;
import com.cart.constacts.SQLConstatnts;
import com.cart.controller.ProductController;
import com.cart.dao.ProductDao;
import com.cart.util.ConnectionProvider;

public class AllProductDisplay  {
     
	ProductController pc = new ProductController();
	public boolean save(Product product) {
		// create DB Connection
		Connection connection = null;
		PreparedStatement ps= null;
		try {
			connection = ConnectionProvider.getDBConnection();
			ps = connection.prepareStatement(SQLConstatnts.SELECT_PRODUCT_SQL);
			
//			ps.setString(2, product.getMfgDate());
//			product.getName();
//			ps.setDouble(3, product.getPrice());
//			ps.setInt(4, product.getQuentity());
			ResultSet resultSet = ps.executeQuery();
			while(resultSet.next()) {
				String id = resultSet.getString(1);
				String name = resultSet.getString(2);
				String mfg_date = resultSet.getString(3);
				String price  = resultSet.getString(4);
				String quantity = resultSet.getString(5);
				// your html goes here 
				
			}
			return ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
