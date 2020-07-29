package com.karansingare.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.karansingare.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	// define bean for our sad fortune service
	/*
	 * here the method name is the bean id*/
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	// define bean for our swim coach and inject dependency
}
