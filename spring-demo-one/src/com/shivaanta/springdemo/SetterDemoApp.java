package com.shivaanta.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//call the method of bean
		System.out.println(theCoach.getDailyWorkout() +" ----"+theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//close the context
		context.close();

	}

}
