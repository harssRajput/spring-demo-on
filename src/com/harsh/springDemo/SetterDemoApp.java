package com.harsh.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//create context and load the config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		//type should be Coach interface. here hardcoded to cricket.. otherwise need to add literal email and team to interface and then it need to be implemented by all classes.
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//close the context
		context.close();
		
	}

}
