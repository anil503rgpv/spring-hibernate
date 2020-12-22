package com.shivaanta.hibernate.demo;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivaanta.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

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
			
			//s1.setFirstName("Sumit");
			//s1.setEmail("Sumit@gmail.com");
			
			
			LocalDateTime date = LocalDateTime.now();
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
			String str = date.format(fmt);
			
			System.out.println("str: "+str);
			
		
			
			int numOfRowsUpdate=0;
			numOfRowsUpdate = session.createQuery("update Student s set s.createdDate='"+str+"'").executeUpdate();
			
			System.out.println("numOfRowsUpdate:- "+numOfRowsUpdate);
			session.getTransaction().commit();
			System.out.println("done.....!!");
			
		} finally {
			factory.close();
		}

	}

}
