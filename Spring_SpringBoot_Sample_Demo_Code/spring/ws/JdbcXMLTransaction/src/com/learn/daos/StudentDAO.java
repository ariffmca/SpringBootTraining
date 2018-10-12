package com.learn.daos;

import java.util.List;

import com.learn.models.Employee;

public interface StudentDAO {

	public void create(String name, Integer age, Integer marks, String year);
	
	public List<Employee> listStudents();
}
