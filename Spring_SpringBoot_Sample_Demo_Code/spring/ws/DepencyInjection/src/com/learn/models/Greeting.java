package com.learn.models;

public class Greeting {
	
	public Greeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Greeting(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "Greeting [message=" + message + "]";
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Bean has been  intialized");
	}
	
	public void destroy() {
		System.out.println("Bean object destroyed");
	}
	
	public static Greeting create() {
		return new Greeting();
	}
}
