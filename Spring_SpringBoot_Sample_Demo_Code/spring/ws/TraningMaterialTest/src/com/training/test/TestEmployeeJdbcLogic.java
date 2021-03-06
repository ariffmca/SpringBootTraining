package com.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.EmployeeDAO;


public class TestEmployeeJdbcLogic {

	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO employeeDao = (EmployeeDAO)appCtx.getBean("employeeDao");
		//employeeDao.create("Ariff", "Mohammed", "Java", "ariffmca@gmail.com", "CPI", 8, 150);
		
		/*studenDao.create("Ariff1", 30, 75, "2016");
		studenDao.create("Ariff2", 30, 75, "2017");
		studenDao.create("Ariff3", 30, 75, "2018");
		studenDao.create("Ariff4", 30, 75, "2019");
		studenDao.create("Ariff5", 30, 75, "2020");
		*/

		employeeDao.listEmployee().forEach
			(s -> System.out.println("Employee Name : " + s.getLastName() + " " + s.getFirstName()));
		

	}

}
