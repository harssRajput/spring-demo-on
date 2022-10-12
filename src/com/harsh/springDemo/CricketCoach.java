package com.harsh.springDemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService = new HappyFortuneService();
	
	//define a constructor for dependency injection aka constructor-injecting.
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public CricketCoach() {
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "practice bowling for 30 minutes.";		
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
