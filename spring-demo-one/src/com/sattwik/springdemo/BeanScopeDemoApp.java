package com.sattwik.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same beans
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("Pointing to the same object: " + result);
		System.out.println("Memory location of theCoach: " + theCoach);
		System.out.println("Memory location of alphaCoach: " + alphaCoach);
		
		// close the context
		context.close();
	}

}
