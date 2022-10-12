package com.harsh.springDemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService = new HappyFortuneService();
	
	//define a constructor for dependency injection aka constructor-injecting.
	public CricketCoach(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside parameterised constructor");
		this.fortuneService = fortuneService;
	}
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter setFortuneService");
		
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "practice cricket bowling for 30 minutes.";		
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
