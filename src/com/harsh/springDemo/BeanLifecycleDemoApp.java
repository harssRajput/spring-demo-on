package com.harsh.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		//retrieve the bean
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call the methods on bean
		System.out.println("test: does BeanLifecycle calling init and destroy methods");
		System.out.println("memory location of theCoach refVariable: " + theCoach);
		
		//close the context
		context.close();

	}

}
