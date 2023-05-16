package com.ojas.spring.dao;

import java.util.List;

import com.ojas.spring.model.Student;

public interface StudentDao {

	String CreateStudent(Student student);
	List<Student> getAllStudents();
	String UpdateStudent(Student student);
	boolean DeleteStudent(Student student);
}
