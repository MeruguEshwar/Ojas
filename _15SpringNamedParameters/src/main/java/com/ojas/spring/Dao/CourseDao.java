package com.ojas.spring.Dao;

import java.util.List;

import com.ojas.spring.model.Course;

public interface CourseDao {

	boolean CreateCourse(Course course);

	List<Course> getAllCourses();

	String UpdateCourse(Course course);

	boolean DeleteCourse(Course course);
}
