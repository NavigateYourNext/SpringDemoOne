package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp 
{

	public static void main(String[] args) 
	{

		//Load the spring configuration file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");
		
		//Retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are the same beans
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Result Is: "+result);
		
		System.out.println("Memory Location for theCoach & alphaCoach is: "+theCoach+" and "+alphaCoach);

	}

}
