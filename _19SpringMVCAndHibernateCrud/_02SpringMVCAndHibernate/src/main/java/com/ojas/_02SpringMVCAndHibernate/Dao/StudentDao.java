package com.ojas._02SpringMVCAndHibernate.Dao;

import java.util.List;

import com.ojas._02SpringMVCAndHibernate.model.Student;

public interface StudentDao {

	public int createStudent(Student student);

	public List<Student> viewAllStudent();

	public void deleteStudent(int studentId);

	public void updateStudent(Student student);
	
	public Student editStudent(int studentId);
}
