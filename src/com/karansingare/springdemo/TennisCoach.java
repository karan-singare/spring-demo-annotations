package com.karansingare.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Default bean id is the name of the class with first letter in lowercase
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	/*
	 * Injecting the dependency using @Autowired annotation
	 * 
	 * Spring will scan for a component that implements FortuneService
	 * In our case HappyFortuneService meets the requirements
	 * And if Found then it will inject it here */
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		 fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhead volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
