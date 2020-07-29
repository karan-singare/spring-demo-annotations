package com.karansingare.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Digilence is the mother of good luck",
			"The journey is the reward"
	};
	
	// create random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// Pick a random string from an array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
