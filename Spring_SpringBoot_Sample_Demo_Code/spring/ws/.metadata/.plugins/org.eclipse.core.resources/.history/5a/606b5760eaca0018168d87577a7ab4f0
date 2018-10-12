package com.learn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.models.Employee;

public class AutoWiringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans.xml");

		Employee emp1 = (Employee)appCtx.getBean("emp1");
		System.out.println(emp1);
	}

}
