package com.rpotluru.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("coach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}

}
