package com.shivaanta.springdemo;

public class TrackCoach implements Coach {
	
private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	

	public TrackCoach() {
		
	}



	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k123123";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do it:::==="+ fortuneService.getFortune();
	}
	
	
	
	//add an init method
	public void doMyStartUp() {
		System.out.println("Track:- doMystartup()");
	}
	
	//add an destroy method
	public void doMyCleanUp() {
		System.out.println("Track:- doMyCleanUp()");
	}

}
