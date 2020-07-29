package com.karansingare.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Default bean id is the name of the class with first letter in lowercase
@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoah:  inside default constructor");
	}
	
	// define any random method for dependency injection
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> TennisCoah:  inside doSomeCreazyStuff() constructor");
		this.fortuneService = theFortuneService;
	}
	*/
	
	// define a setter method
	/*
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoah:  inside setter constructor");
		this.fortuneService = theFortuneService;
	}
	*/
	
	/*
	 * Injecting the dependency using @Autowired annotation
	 * 
	 * Spring will scan for a component that implements FortuneService
	 * In our case HappyFortuneService meets the requirements
	 * And if Found then it will inject it here */
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		 fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhead volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}
