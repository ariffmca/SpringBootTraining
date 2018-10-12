package com.training.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.services.Employee;

public class EmployeeRowWrapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee employee = new Employee();
		employee.setId(rs.getInt("id"));
		employee.setFirstName(rs.getString("firstName"));
		employee.setLastName(rs.getString("lastName"));
		employee.setDeptName(rs.getString("deptName"));
		employee.setEmail(rs.getString("email"));
		
		employee.setPid(rs.getInt("pid"));
		employee.setProjName(rs.getString("projName"));
		employee.setTeamSize(rs.getInt("teamSize"));
		employee.setDays(rs.getInt("days"));
		
		return employee;
	}

}
