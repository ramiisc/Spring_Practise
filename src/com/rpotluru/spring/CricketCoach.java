package com.rpotluru.spring;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public CricketCoach() {
		super();
	}

	public CricketCoach(FortuneService fortuneService, String emailAddress, String team) {
		super();
		this.fortuneService = fortuneService;
		this.emailAddress = emailAddress;
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on fast Bowling";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}
	

}
