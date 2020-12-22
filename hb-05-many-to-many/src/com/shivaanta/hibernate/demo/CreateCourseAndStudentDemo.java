package com.shivaanta.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivaanta.hibernate.demo.entity.Course;
import com.shivaanta.hibernate.demo.entity.Instructor;
import com.shivaanta.hibernate.demo.entity.InstructorDetail;
import com.shivaanta.hibernate.demo.entity.Review;
import com.shivaanta.hibernate.demo.entity.Student;

public class CreateCourseAndStudentDemo {

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
			
			Course course = new Course("Spring");
			
			System.out.println("\nSaving the course");
			session.save(course);
			System.out.println("\nSave course complete: "+course);
			
			Student student1=new Student("Anuil", "Patel", "anil@gmail.com");
			Student student2=new Student("dilip", "kumar", "dilip@gmail.com");
			
			course.addStudent(student1);
			course.addStudent(student2);
			
			System.out.println("\nSaving Student");
			
			session.save(student1);
			session.save(student2);
			System.out.println("\nSaving Student complete: "+course.getStudents());
			session.getTransaction().commit();
			
			System.out.println("done.....!!");
			
		} finally {
			
			session.close();
			factory.close();
		}

	}

}
