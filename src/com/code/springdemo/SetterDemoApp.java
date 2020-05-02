package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp 
{

	public static void main(String[] args) 
	{
		//Load Spring Configuration File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve Bean From Spring Container
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//Call Methods on the bean
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//Close the context
		context.close();
	}

}
