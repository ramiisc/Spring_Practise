package com.rpotluru.spring;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on fast Bowling";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
