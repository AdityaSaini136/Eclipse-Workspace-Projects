package com.product;

public interface SQLConstatnts {

	String INSERT_PRODUCT_SQL = "INSERT INTO list(productName,Price, qty) VALUES(?,?,?)";
    String SELECT_PRODUCT_SQL ="select * from list";
    String DELETE_PRODUCT_SQL ="delete from list where productName=productName";
}
