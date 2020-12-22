package com.shivaanta.hibernate.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivaanta.hibernate.demo.entity.Course;
import com.shivaanta.hibernate.demo.entity.Instructor;
import com.shivaanta.hibernate.demo.entity.InstructorDetail;
import com.shivaanta.hibernate.demo.entity.Student;

public class CreateCourseDemo {

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
			
			Course course1 = new Course("Java");
			Course course2 = new Course("C#");
			Course course3 = new Course("PHP");
			Course course4 = new Course("Python");
			
			instructor.add(course1);
			instructor.add(course2);
			instructor.add(course3);
			instructor.add(course4);
			
			session.save(course1);
			session.save(course2);
			session.save(course3);
			session.save(course4);
			
			session.getTransaction().commit();
			
			System.out.println("done.....!!");
			
		} finally {
			
			session.close();
			factory.close();
		}

	}

}
