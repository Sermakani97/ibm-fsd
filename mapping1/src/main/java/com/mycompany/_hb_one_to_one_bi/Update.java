package com.mycompany._hb_one_to_one_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.openSession();
		
		try {								
			int studentId = 10;
			
			// now get a new session and start transaction
			session = factory.openSession();
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: " + studentId);
			
			Instructor myStudent = session.get(Instructor.class, studentId);
	
			System.out.println("Updating...");
			myStudent.setFirstName("saraswathi");
			myStudent.setLastName("Selvam");
			myStudent.setEmail("sel@gg.com");
			session.merge(myStudent);
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}
}
