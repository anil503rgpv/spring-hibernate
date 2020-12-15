package com.shivaanta.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	
	
	private FortuneService fortuneService;
	@Value(value = "${shiv.email}")
	private String email;
	
	@Value(value = "${shiv.team}")
	private String team;
	
	

	public FortuneService getFortuneService() {
		return fortuneService;
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Swim 1000m as worm up";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
