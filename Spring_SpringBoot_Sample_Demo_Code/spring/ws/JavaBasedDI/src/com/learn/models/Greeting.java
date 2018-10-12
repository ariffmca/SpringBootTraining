package com.learn.models;

public class Greeting {

	private String message;
	
	private TimeOfDay timeOfDay;
	
	public Greeting() {
		this.message = "Hello !!! Good Morning ...";
	}
	
	public Greeting(TimeOfDay timeOfDay) {
		this.message = "Hello !!! Good Morning ...";
		this.timeOfDay=timeOfDay;
	}
	
	public Greeting(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Greeting [message=" + message + " " + timeOfDay.getPartOfDay() + " ]";
	}

}
