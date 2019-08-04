package com.demo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.User;

public class StoreData {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		User user1 = new User("John Smith", 30, 45678.90);
		User user2 = new User("James Cmeron", 60, 99990.90);
		User user3 = new User("Tom Hanks", 50, 98364.20);
		
		Transaction t = session.beginTransaction();
		session.persist(user1);
		session.persist(user3);
		session.persist(user2);
		System.out.println("Saved!!");
		t.commit();
		
		session.close();
		 
	
	}

}
