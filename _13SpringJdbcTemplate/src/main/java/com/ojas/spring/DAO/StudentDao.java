package com.ojas.spring.DAO;

import java.util.List;

import com.ojas.spring.config.Student;

public interface StudentDao {

	Student getStudentById(int id);

	List<Student> getAllStudents();

	boolean deleteStudent(Student student);

	boolean updateStudent(Student student);

	boolean createStudent(Student student);
}
