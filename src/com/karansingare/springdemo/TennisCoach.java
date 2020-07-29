package com.karansingare.springdemo;

import org.springframework.stereotype.Component;

// Default bean id is the name of the class with first letter in lowercase
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhead volley";
	}

}
