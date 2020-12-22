package com.shivaanta.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivaanta.hibernate.demo.entity.Course;
import com.shivaanta.hibernate.demo.entity.Instructor;
import com.shivaanta.hibernate.demo.entity.InstructorDetail;

public class EagerLazyDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(Course.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			
			session.beginTransaction();
			
			int instructorId=1;
			Instructor instructor = session.get(Instructor.class,instructorId);
			
			System.out.println("love to code: Instructor : "+instructor);
			
			System.out.println("courses : " + instructor.getCourses());
			
			session.getTransaction().commit();
			session.close();
			
			System.out.println(" Session is closed now \n\n\n\n\n ");
			
			System.out.println("courses : " + instructor.getCourses());
			
			System.out.println("\n\n\n\n\ndone.....!!");
			
		} finally {
			
			session.close();
			factory.close();
		}

	}

}
