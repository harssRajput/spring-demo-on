package com.harsh.springDemo;

public class TrackCoach implements Coach {
	
	//define a private field for dependency object.
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection aka constructor-injecting.
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		return "run hard 5k continously.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
