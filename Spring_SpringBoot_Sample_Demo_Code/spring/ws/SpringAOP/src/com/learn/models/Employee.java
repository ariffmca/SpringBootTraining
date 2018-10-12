package com.learn.models;

public class Employee {

	private int age;
	private String firstName;
	private String lastName;
	private double salary;
	
	public int getAge() {
		return age;
	}
	public int setAge(int age) {
		this.age = age;
		return age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	
	public void printThrowException() {
		System.out.println("!!! -- Exception Raised -- !!!");
		throw new IllegalArgumentException();
	}

}
