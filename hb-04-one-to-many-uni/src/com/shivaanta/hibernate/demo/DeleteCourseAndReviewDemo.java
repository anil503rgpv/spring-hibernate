package com.shivaanta.hibernate.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivaanta.hibernate.demo.entity.Course;
import com.shivaanta.hibernate.demo.entity.Instructor;
import com.shivaanta.hibernate.demo.entity.InstructorDetail;
import com.shivaanta.hibernate.demo.entity.Review;
import com.shivaanta.hibernate.demo.entity.Student;

public class DeleteCourseAndReviewDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(Course.class)
									.addAnnotatedClass(Review.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			
			session.beginTransaction();
			
			int courseId=10;
			Course course = session.get(Course.class, courseId);
			
			System.out.println(course);
			System.out.println(course.getReviews());
			
			session.delete(course);
			session.getTransaction().commit();
			
			System.out.println("done.....!!");
			
		} finally {
			
			session.close();
			factory.close();
		}

	}

}
