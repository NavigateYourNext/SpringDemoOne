package com.code.springdemo;

public class TrackCoach implements Coach
{
	//Define a private field for the dependency
	private FortuneService fortuneService;
	
	public TrackCoach()
	{
		
	}
	//Define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Spend 45 minutes on track";
	}

	@Override
	public String getDailyFortune() 
	{	
		//use my fortuneService to get a fortune
		return "Just Do It: "+fortuneService.getFortune();
	}
	
	//Add an init method
	public void doMyStartupStuff()
	{
		System.out.println("Inside do my startup stuff");
	}
	
	//Add an destroy method
	public void doMyCleanupStuff()
	{
		System.out.println("Inside do my cleanup stuff");
	}
}
