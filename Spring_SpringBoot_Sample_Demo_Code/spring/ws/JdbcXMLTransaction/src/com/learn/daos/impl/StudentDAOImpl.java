package com.learn.daos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.learn.daos.StudentDAO;
import com.learn.models.Employee;
import com.learn.utils.StudentRowMapper;

@Repository("studentDao")
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate; 
	private static int id =1;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public void create(String name, Integer age, Integer marks, String year) {
		final String  insertStudentSQL = "insert into student (id,name,age) values (?,?,?)";
		final String  insertMarksSQL = "insert into marks (sid,marks,year) values (?,?,?)";
		
		jdbcTemplate.update(insertStudentSQL, id, name, age);
		System.out.println("Inserted succesfullly in Student Table");
		
		jdbcTemplate.update(insertMarksSQL, id, marks, year);
		System.out.println("Inserted succesfullly in Marks Table");
		
		id+=1;
		
	}
	

	@Override
	public List<Employee> listStudents() {
		final String  selectStudentSQL = "select * from student s, marks m  where s.id = m.sid";
		List<Employee> studentList = jdbcTemplate.query(selectStudentSQL,new StudentRowMapper());
		return studentList;
	}

}
