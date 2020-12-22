package com.shivaanta.hibernate.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivaanta.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating student object .....");
			Student student1 = new Student("dilip", "Patel", "dilip@gmail.com", new Date());
			
			System.out.println("Transaction started......");
			session.beginTransaction();
			System.out.println("Saving student object.....");
			session.save(student1);
			
			System.out.println("commiting transection");
			session.getTransaction().commit();
			
			
			
			//My new Code
			
			//find out student ID
			System.out.println("Saved student generated id:- "+ student1.getId());
			
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("getting student with id: "+ student1.getId());
			
			Student s1 = session.get(Student.class,student1.getId());
			
			System.out.println(s1.toString());
			
			session.getTransaction().commit();
			System.out.println("done.....!!");
			
		} finally {
			factory.close();
		}

	}

}
