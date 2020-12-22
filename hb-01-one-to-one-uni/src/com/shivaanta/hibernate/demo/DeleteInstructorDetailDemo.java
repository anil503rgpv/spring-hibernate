package com.shivaanta.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivaanta.hibernate.demo.entity.Instructor;
import com.shivaanta.hibernate.demo.entity.InstructorDetail;

public class DeleteInstructorDetailDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Instructor.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating Instructor object .....");
			
			
			int id=3;
			
			session.beginTransaction();
			InstructorDetail instructorDetail=session.get(InstructorDetail.class, id);
			System.out.println("saving instructor object in db : "+ instructorDetail);
			System.out.println("instructor :-"+instructorDetail.getInstructor());
			instructorDetail.getInstructor().setInstructorDetail(null);
			session.delete(instructorDetail);
			session.getTransaction().commit();
			
			System.out.println("done.....!!");
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			session.close();
			factory.close();
		}

	}

}
