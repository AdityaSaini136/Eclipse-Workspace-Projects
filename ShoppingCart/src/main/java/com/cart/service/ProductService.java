package com.cart.service;

import java.util.List;

import com.cart.beans.Product;

public interface ProductService {
    public boolean save(Product product);
    public List<Product> getAll();
    public boolean delete(int id);
    public boolean  update(Product product);
    
}
