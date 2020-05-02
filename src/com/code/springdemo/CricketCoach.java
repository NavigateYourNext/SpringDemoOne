package com.code.springdemo;

public class CricketCoach implements Coach 
{
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach()
	{
		System.out.println("Cricket Coach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) 
	{
		System.out.println("Inside Setter Method : Fortune Service");
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside Setter Method : Email");
		this.emailAddress = emailAddress;
	}

	public FortuneService getFortuneService() 
	{
		return fortuneService;
	}

	public String getEmailAddress() 
	{
		return "Email Is: "+emailAddress;
	}

	public String getTeam() 
	{
		return "Team Is: "+team;
	}

	public void setTeam(String team) 
	{
		System.out.println("Inside Setter Method: Team");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() 
	{
		return "Practice fast bowling for 15 min";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}

}
