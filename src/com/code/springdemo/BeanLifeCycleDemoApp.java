package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp 
{

	public static void main(String[] args) 
	{

		//Load the spring configuration file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//Retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		context.close();
	}

}
