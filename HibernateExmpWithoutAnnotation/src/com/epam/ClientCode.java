package com.epam;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class ClientCode {

	public static void main(String[] args) {
		try {
			Employee emp = new Employee("Aditya", "FIS",60.54);
			Configuration configuration = new Configuration();
			Configuration configure = configuration.configure("hibernate.cfg.xml");
			SessionFactory buildSessionFactory = configure.buildSessionFactory();
			Session session = buildSessionFactory.openSession();
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 20.54));
			Transaction transaction = session.beginTransaction();
			session.save(emp);
			transaction.commit();
			System.out.println(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}