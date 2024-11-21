package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionPro {

	public static Session getConnection() {
		SessionFactory factory= null;
		Session openSession = null;
		try {
			 factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			 openSession = factory.openSession();
		} catch (Throwable e) {
			System.out.println("Failed to create sessionfactory object "+e);
		}
		return openSession;
	}
}