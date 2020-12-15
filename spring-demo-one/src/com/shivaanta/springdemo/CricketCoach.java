package com.shivaanta.springdemo;

public class CricketCoach implements Coach {

	
	
	private String emailAddress;
	private String team;
	
	private FortuneService fortuneService;
	
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach inside setter emailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach inside setter team");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach inside no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice for balling everyday";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "cricket---:- "+fortuneService.getFortune();
	}

}
