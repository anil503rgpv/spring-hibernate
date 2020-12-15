package com.shivaanta.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thisTennisCoach")  ---it use for explicitly been id
@Component // it use for default bean id using class name --tennisCoach
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	@Override
	public String getDailyWorkout() {

		return "practice your backhand volley";
	}

	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println("Tennis: setFortuneService setter method");
	 * this.fortuneService = fortuneService; }
	 */

	/*
	 * @Autowired public void doSomeCrazyStuff(FortuneService fortuneService) {
	 * System.out.println("Tennis: doSomeCrazyStuff method"); this.fortuneService =
	 * fortuneService; }
	 */

	public TennisCoach() {
		System.out.println("Tennis : no args constructor");
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

	// add an init method
	@PostConstruct
	public void doMyStartUp() {
		System.out.println("TennisCoach:- doMystartup()");
	}

	// add an destroy method
	@PreDestroy
	public void doMyCleanUp() {
		System.out.println("TennisCoach:- doMyCleanUp()");
	}

}
