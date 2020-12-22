package com.shivaanta.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivaanta.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			int studentId=2;
			//My new Code
			
		
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("getting student with id: "+ studentId);
			
			Student s1 = session.get(Student.class,studentId);
			
			session.delete(s1);
			System.out.println(s1.toString());
			
			session.getTransaction().commit();
			System.out.println("done.....!!");
			
		} finally {
			factory.close();
		}

	}

}
