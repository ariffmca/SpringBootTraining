package com.learn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.dao.EmployeeDAO;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO empDAO;
	
	public void addEmployee() {
		System.out.println("Employee Being Added -- Service");
		empDAO.createEmployee();
	}
	
}
