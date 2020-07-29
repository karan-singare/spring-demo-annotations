package com.karansingare.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
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
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartStuff");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanStuff");
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
