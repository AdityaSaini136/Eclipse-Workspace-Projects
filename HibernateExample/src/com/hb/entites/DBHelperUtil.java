package com.hb.entites;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBHelperUtil {
	public static Session getSession() {

		SessionFactory factory = null;
		Session session =null;
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			session = factory.openSession();
		}
		catch(Throwable ex) {
			System.out.println("Failed to create sessionfactory object "+ex);
			ex.printStackTrace();
		}
		return session;
	}
}