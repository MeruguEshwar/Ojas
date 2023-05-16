package com.ojas._02SpringMVCAndHibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas._02SpringMVCAndHibernate.Dao.StudentDao;
import com.ojas._02SpringMVCAndHibernate.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao dao;
	
	@Override
	public int createStudent(Student student) {
		System.out.println("StudentService:"+student);
		return dao.createStudent(student);
	}

	@Override
	public List<Student> viewAllStudent() {
		return dao.viewAllStudent();
	}

	@Override
	public void deleteStudent(int studentId) {
		dao.deleteStudent(studentId);
	}

	@Override
	public void updateStudent(Student student) {
		 dao.updateStudent(student);
	}

	@Override
	public Student editStudent(int studentId) {
		 return dao.editStudent(studentId);
	}

}
