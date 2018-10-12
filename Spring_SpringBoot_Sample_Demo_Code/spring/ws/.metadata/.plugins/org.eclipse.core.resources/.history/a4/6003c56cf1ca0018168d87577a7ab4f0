package com.learn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.facades.EmployeeFacade;


public class TestStereoTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans.xml");

		EmployeeFacade empFacade = (EmployeeFacade)appCtx.getBean("empFacade");
		empFacade.addEmployee();
	}

}
