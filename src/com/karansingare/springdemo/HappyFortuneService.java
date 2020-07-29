package com.karansingare.springdemo;

import org.springframework.stereotype.Component;
/*
 * Add the @Component to register the bean to the spring container
 * As not arg is provided it will use the default on i.e. the name of the class or interface with start letter in lowercase*/

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
