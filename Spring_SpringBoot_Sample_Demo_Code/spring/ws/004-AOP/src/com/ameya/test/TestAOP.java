package com.ameya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ameya.models.Employee;

public class TestAOP {

	public static void main(String[] args) {
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-aspectj.xml");
		Employee e1=(Employee)ctx.getBean("e1");
		
		e1.getFirstName();
		//e1.getAge();
		e1.printThrownException();

	}

}
