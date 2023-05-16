package com.ojas.spring.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.RowMapper;

import com.ojas.spring.model.Student;

public class StudentMapper implements RowMapper<Student>{


	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student std = new Student();
		std.setStudentId(rs.getInt("studentId"));
		std.setStudentName(rs.getString("studentName"));
		std.setStudentMarks(rs.getString("studentMarks"));
		return std;
	}

}
