package com.ojas.spring.config;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		student.setStudentId(rs.getInt("id"));
		student.setStudentName(rs.getString("sname"));
		student.setStudentMarks(rs.getString("marks"));
		student.setStudentGrade(rs.getString("grade"));
		
		return student;
	}

	
}
