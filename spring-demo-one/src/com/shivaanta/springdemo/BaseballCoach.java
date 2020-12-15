package com.shivaanta.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes daily batting practice";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneservice object
		return fortuneService.getFortune();
	}

}
