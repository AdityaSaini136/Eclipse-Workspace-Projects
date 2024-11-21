package com.cart.service.Impl;

import java.util.List;

import com.cart.beans.Product;
import com.cart.dao.ProductDao;
import com.cart.dao.impl.ProductDaoImpl;
import com.cart.service.ProductService;

public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;	
	public ProductServiceImpl () {
		productDao = new ProductDaoImpl();
	}
	@Override
	public boolean save(Product product) {
		return productDao.save(product);
	}
	@Override
	public List<Product> getAll() {
		return productDao.getAll();
	}
	@Override
	public boolean delete(int id) {
		return productDao.delete(id);
	}
	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		return productDao.update(product);
	}
}
