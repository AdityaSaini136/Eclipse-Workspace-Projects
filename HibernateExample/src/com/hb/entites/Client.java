package com.hb.entites;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		DaoImpl daoImpl = new DaoImpl();
		//		Product product1 = new Product("Laptop", "10-03-2022", 200, 10,"good");
		//		Product product2 = new Product("Mouse", "10-03-2022", 20, 10,"bad");
		//		Product product3 = new Product("Keybord", "10-03-2022", 68, 10,"all ok");
		//		daoImpl.save(product1);
		//		daoImpl.save(product2);
		//		daoImpl.save(product3);
		//List<Product> products = daoImpl.getAll();
		//System.out.println(products);
		//boolean delete = daoImpl.delete(4);
		boolean update = daoImpl.update(1);
		System.out.println(update);


	}
}
