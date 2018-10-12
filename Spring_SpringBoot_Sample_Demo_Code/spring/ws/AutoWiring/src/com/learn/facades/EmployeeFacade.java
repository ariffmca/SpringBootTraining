package com.learn.facades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learn.services.EmployeeService;

@Component("empFacade")
public class EmployeeFacade {

	@Autowired
	private EmployeeService empService;

	public void addEmployee() {
		System.out.println("Employee added :: Facade Call");
		empService.addEmployee();
	}

}
