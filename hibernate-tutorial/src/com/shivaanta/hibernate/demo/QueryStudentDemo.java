package com.shivaanta.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivaanta.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			
			
			System.out.println("Transaction started......");
			session.beginTransaction();
			
			
			System.out.println("Query Student......");
			
			
			//select * from student
			List<Student> students = session.createQuery("from Student").getResultList();
			
			displayStudents(students);
			
			
			System.out.println("Query Student. with lastname =patel.....");
			
			//select * from student where last_name = 'patel';
			
			List<Student> students2 = session.createQuery("from Student s where s.lastName = 'patel'").getResultList();
			
			displayStudents(students2);
			System.out.println("commiting transection");
			session.getTransaction().commit();
			
			System.out.println("done.....!!");
			
		} finally {
			factory.close();
		}

	}

	private static void displayStudents(List<Student> students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
