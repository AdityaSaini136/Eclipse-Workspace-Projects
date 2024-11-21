package com.examportal;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FetchData {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = metadata.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		TypedQuery getData = session.createQuery("from Question");
		List<Question> resultList = getData.getResultList();
		Iterator<Question> question = resultList.iterator();
		while(question.hasNext()) {
			Question next = question.next();
			System.out.println("Question Name : "+next.getQname());
			//Printing Answer=====
			List<String> answer = next.getAnswer();
			Iterator<String> iterator = answer.iterator();
			while(iterator.hasNext()) {
				String next2 = iterator.next();
				System.out.println(next2);
			}
		}
		session.close();
		System.out.println("Success");
	}
}
