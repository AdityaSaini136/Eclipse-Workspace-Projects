package com.cart.dao;

import java.util.List;

import com.cart.beans.Product;

public interface ProductDao {

	boolean save(Product product);
	
	List<Product> getAll();

	boolean delete(int id);
     
	boolean update(Product product);
	
}
