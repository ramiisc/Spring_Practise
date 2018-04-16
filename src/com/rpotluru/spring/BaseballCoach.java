package com.rpotluru.spring;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on baseball batting";
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
