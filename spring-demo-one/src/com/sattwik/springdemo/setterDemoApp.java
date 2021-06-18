package com.sattwik.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from the spring container
		CricketCoach theCoach =
				context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// call our new methods to get the literal values
		System.out.println(theCoach.getEmailaddress());
		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();
	}
}
