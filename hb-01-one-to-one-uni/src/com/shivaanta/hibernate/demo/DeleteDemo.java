package com.shivaanta.hibernate.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivaanta.hibernate.demo.entity.Instructor;
import com.shivaanta.hibernate.demo.entity.InstructorDetail;
import com.shivaanta.hibernate.demo.entity.Student;

public class DeleteDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Instructor.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating Instructor object .....");
			
			
			int id=1;
			
			session.beginTransaction();
			Instructor instructor=session.get(Instructor.class, id);
			System.out.println("saving instructor object in db : "+ instructor);
			
			if(instructor!=null) {
				session.delete(instructor);
			}
			
			
			session.getTransaction().commit();
			
			System.out.println("done.....!!");
			
		} finally {
			factory.close();
		}

	}

}
