package com.learn.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

	public void createEmployee() {
		System.out.println("Employee Created--DAO");
	}
}
