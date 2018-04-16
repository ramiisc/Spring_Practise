package com.rpotluru.spring;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins for Running";
	}
	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
