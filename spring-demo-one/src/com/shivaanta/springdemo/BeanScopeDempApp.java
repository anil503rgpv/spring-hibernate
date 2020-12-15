package com.shivaanta.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDempApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result =(theCoach==alphaCoach);
		
		System.out.println("\nPointing to the same object:- "+ result);
		System.out.println("\nMemory location of theCoach:- "+ theCoach);
		System.out.println("\nMemory location of alphaCoach:- "+ alphaCoach);
		
		context.close();
	}

}
