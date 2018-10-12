package com.training.daos;

import java.util.List;

import com.training.services.Employee;

public interface EmployeeDAO {

	public void create(String firstName,String lastName, String deptName, String email, 
			String projName, Integer teamSize, Integer days);
	
	List<Employee> listEmployee();
}
