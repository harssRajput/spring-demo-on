package com.harsh.springDemo;

public class MyApp {
	public static void main(String []args) {
		//create the coach
		Coach theCoach = new TrackCoach();
		
		//use the coach
		System.out.println(theCoach.getDailyWorkout());
	}
}
