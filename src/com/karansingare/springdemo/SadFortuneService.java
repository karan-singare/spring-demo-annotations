package com.karansingare.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Tooday is sad day";
	}

}
