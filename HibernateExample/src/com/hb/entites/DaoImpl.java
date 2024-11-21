package com.hb.entites;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DaoImpl {

	public boolean save(Product product) {
		try {
			Session session = DBHelperUtil.getSession();
			Transaction transaction = session.getTransaction();
			transaction.begin();
			Serializable save = session.save(product); // here its in persistent state
			transaction.commit();
			System.out.println(save);
			session.close();
			//now product object is not attached with session(detached state)
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
	public Product getById(int id) {
		try {
			Session session  = DBHelperUtil.getSession();
			Product product = session.get(Product.class,id);
			session.close();
			return product;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<Product> getAll(){
		try {
			Session session = DBHelperUtil.getSession();
			Criteria criteria = session.createCriteria(Product.class);
			//criteria.add(Restrictions.gt("price", new Double(50)));
			List<Product> products = criteria.list();
			session.close();
			return products;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public boolean update(int id) {
		Product product = getById(id);
		if(product==null) {
			throw new RecordNotFindException("It does not exist");
//			System.out.println("Product are found");
//		}else {
//			System.out.println("Product are not found");
		}
		product.setName("MObile");
		product.setPrice(10000.00);
		product.setQuantity(90);
		product.setMfgDate("12/03/2022");
		
		Session session = DBHelperUtil.getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.update(product);
		transaction.commit();
		System.out.println("update hona chahiye");
		return true;
	}
	public boolean delete(int id) {
 		Product productId = getById(id);
 		if(productId==null) {
 			throw new RecordNotFindException("Record are  not found");
 		}
		Session session = DBHelperUtil.getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.delete(productId);
		transaction.commit();
		return true;
	}
}