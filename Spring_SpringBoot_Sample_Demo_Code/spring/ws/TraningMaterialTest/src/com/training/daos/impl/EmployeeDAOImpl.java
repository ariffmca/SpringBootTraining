package com.training.daos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.training.daos.EmployeeDAO;
import com.training.services.Employee;
import com.training.utils.EmployeeRowWrapper;

@Repository("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	private static int id = 1;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public void create(String firstName, String lastName, String deptName, String email, String projName,
			Integer teamSize, Integer days) {
		final String  insertEmployeeSQL = "insert into employee (id,firstName,lastName,deptName,email) values (?,?,?,?,?)";
		final String  insertProjectSQL = "insert into project (pid,projName,teamSize,days) values (?,?,?,?)";
		
		jdbcTemplate.update(insertEmployeeSQL, id, firstName, lastName,deptName,email);
		System.out.println("Inserted succesfullly in Employee Table");
		
		jdbcTemplate.update(insertProjectSQL, id, projName, teamSize,days);
		System.out.println("Inserted succesfullly in Project Table");
		
		id+=1;

	}

	@Override
	
	public List<Employee> listEmployee() {
		
		final String selectEmployeeSQL = "select * from Employee e, Project p where e.id =p.pid";
		List<Employee> empList = jdbcTemplate.query(selectEmployeeSQL,new EmployeeRowWrapper());
		return empList;
	}

}
