package com.harsh.springDemo;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 min to do batting practice.";
	}
}
