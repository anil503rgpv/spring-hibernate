package com.shivaanta.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivaanta.hibernate.demo.entity.Course;
import com.shivaanta.hibernate.demo.entity.Instructor;
import com.shivaanta.hibernate.demo.entity.InstructorDetail;
import com.shivaanta.hibernate.demo.entity.Review;
import com.shivaanta.hibernate.demo.entity.Student;

public class AddCourseForDilipDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(Course.class)
									.addAnnotatedClass(Review.class)
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			
			session.beginTransaction();
			
			int studentId=2;
			
			Student student=session.get(Student.class, studentId);
			
			System.out.println("\nLoaded Student: "+student);
			System.out.println("Courses: "+student.getCourses());
			
			Course course1= new Course("Java");
			Course course2= new Course("PHP");
			
			student.addCourse(course1);
			student.addCourse(course2);
			
			System.out.println("\nSaving Courses");
			session.save(course1);
			session.save(course2);
			
			session.getTransaction().commit();
			
			System.out.println("done.....!!");
			
		} finally {
			
			session.close();
			factory.close();
		}

	}

}
