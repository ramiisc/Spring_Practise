package com.rpotluru.spring;

import java.util.Random;

public class QuoteFortuneService implements FortuneService {
	
	String[] quotes = {"Hardwork", "Dedication", "Discipline"};
	@Override
	public String getFortune() {
		Random rand = new Random();
		int i = rand.nextInt(3);
		return quotes[i];
	}

}
