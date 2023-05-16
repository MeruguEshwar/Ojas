package com.ojas.spring.Dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;
import com.ojas.spring.model.Course;

@Component
public class CourseDaoImpl implements CourseDao {

	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public boolean CreateCourse(Course course) {

		SqlParameterSource sp = new MapSqlParameterSource().addValue("courseId", course.getCourseId())
				.addValue("courseName", course.getCourseName()).addValue("coursePrice", course.getCoursePrice())
				.addValue("courseDuration", course.getCourseDuration());

		return jdbcTemplate.update("insert into course values(?,?,?,?)", sp) > 0;
	}

	@Override
	public List<Course> getAllCourses() {

//		String GETALL_COURSES = "select * from courses";
		return null;
	}

	@Override
	public String UpdateCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean DeleteCourse(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

}
