package com.harsh.springDemo;

public class BaseballCoach implements Coach{
	
	//define a private field for dependency object.
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection aka constructor-injecting.
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public BaseballCoach() {
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 min to do batting practice.";
	}

	@Override
	public String getDailyFortune() {
		
		//use fortuneService to get fortune
		return fortuneService.getFortune();
	}
}
