package com.learn.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.learn.models.Employee;

public class StudentRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee student = new Employee();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		
		student.setsId(rs.getInt("sid"));
		student.setMarks(rs.getInt("marks"));
		student.setYear(rs.getString("year"));
		
		return student;
	}

}
