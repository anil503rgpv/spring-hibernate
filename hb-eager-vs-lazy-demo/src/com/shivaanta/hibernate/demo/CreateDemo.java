package com.shivaanta.hibernate.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivaanta.hibernate.demo.entity.Course;
import com.shivaanta.hibernate.demo.entity.Instructor;
import com.shivaanta.hibernate.demo.entity.InstructorDetail;
import com.shivaanta.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(Course.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating Instructor object .....");
			
			
			Instructor instructor = new Instructor("anil", "patel", "anil@gmail.com");
			
			InstructorDetail instructorDetail = new InstructorDetail("anil-youtube", "coding");
			
			instructor.setInstructorDetail(instructorDetail);
			
			session.beginTransaction();
			
			System.out.println("saving instructor object in db : "+ instructor);
			session.save(instructor);
			
			
			
			session.getTransaction().commit();
			
			System.out.println("done.....!!");
			
		} finally {
			
			session.close();
			factory.close();
		}

	}

}
