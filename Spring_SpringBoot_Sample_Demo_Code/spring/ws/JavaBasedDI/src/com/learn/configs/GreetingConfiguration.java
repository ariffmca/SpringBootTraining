package com.learn.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.learn.models.Greeting;
import com.learn.models.TimeOfDay;

@Configuration
public class GreetingConfiguration {

	@Bean(name="gr1")
	@Scope("prototype")
	public Greeting getGreeting() {
		return new Greeting(getTimeOfDay());
	}
	
	@Bean//(name="t1", initMethod="init", destroyMethod="destroy")
	public TimeOfDay getTimeOfDay() {
		return new TimeOfDay("Have a nice day !!!");
	}
	public GreetingConfiguration() {
		// TODO Auto-generated constructor stub
	}

}
