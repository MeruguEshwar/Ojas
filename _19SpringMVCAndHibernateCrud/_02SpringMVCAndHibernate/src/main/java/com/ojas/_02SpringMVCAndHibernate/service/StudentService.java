package com.ojas._02SpringMVCAndHibernate.service;

import java.util.List;

import com.ojas._02SpringMVCAndHibernate.model.Student;

public interface StudentService {

	public int createStudent(Student student);

	public List<Student> viewAllStudent();

	public void deleteStudent(int studentId);

	public void updateStudent(Student student);

	public Student editStudent(int studentId);
}
