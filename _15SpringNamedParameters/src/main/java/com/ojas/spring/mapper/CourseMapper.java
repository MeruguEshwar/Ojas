package com.ojas.spring.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ojas.spring.model.Course;

public class CourseMapper implements RowMapper<Course> {

	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		Course cs = new Course();
		cs.setCourseId(rs.getInt("courseId"));
		cs.setCourseName(rs.getString("courseName"));
		cs.setCourseDuration(rs.getString("coursePrice"));
		cs.setCoursePrice(rs.getString("courseDuration"));
		return cs;
	}

}
