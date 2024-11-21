package com.cart.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cart.beans.Product;
import com.cart.constacts.SQLConstatnts;
import com.cart.dao.ProductDao;
import com.cart.util.ConnectionProvider;

public class ProductDaoImpl implements ProductDao{
	@Override
	public boolean save(Product product) {
		// create DB Connection
		Connection connection = null;
		PreparedStatement ps= null;
		try {
			connection = ConnectionProvider.getDBConnection();
			ps = connection.prepareStatement(SQLConstatnts.INSERT_PRODUCT_SQL);
			ps.setString(1, product.getName());
			ps.setString(2, product.getMfgDate());
			ps.setDouble(3, product.getPrice());
			ps.setInt(4, product.getQuantity());
			return ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public List<Product> getAll() {
		Connection connection = null;
		PreparedStatement ps= null;
		List<Product> products =  new ArrayList<Product>();
		try {
			connection = ConnectionProvider.getDBConnection();
			ps = connection.prepareStatement(SQLConstatnts.SELECT_PRODUCT_SQL);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String mfgDate = rs.getString(3);
				double price = rs.getDouble(4);
				int quantity = rs.getInt(5);
				Product product = new Product();
				product.setId(id);
				product.setQuantity(quantity);
				product.setName(name);
				product.setMfgDate(mfgDate);
				product.setPrice(price);
				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}
	@Override
	public boolean delete(int id) {
		
		Connection connection = null;
		PreparedStatement ps= null;
		try {
			connection = ConnectionProvider.getDBConnection();
			ps = connection.prepareStatement(SQLConstatnts.DELETE_PRODUCT_SQL);
			ps.setInt(1, id);
			return ps.executeUpdate() > 0;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean update(Product product) {
		// create DB Connection
		Connection connection = null;
		PreparedStatement ps= null;
		try {
			connection = ConnectionProvider.getDBConnection();
			ps = connection.prepareStatement(SQLConstatnts.UPDATE_PRODUCT_SQL);
			ps.setString(1, product.getName());
			ps.setString(2, product.getMfgDate());
			ps.setDouble(3, product.getPrice());
			ps.setInt(4, product.getQuantity());
			ps.setInt(5, product.getId());
			
			return ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
