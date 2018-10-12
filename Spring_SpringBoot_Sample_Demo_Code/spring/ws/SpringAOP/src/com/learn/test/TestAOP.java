package com.learn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.models.Employee;

public class TestAOP {

	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans-aspectj.xml");
		Employee e1 = (Employee)appCtx.getBean("e1");
		
		e1.getFirstName();
		
	}

}
