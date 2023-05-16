package com.ojas.spring.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ojas.spring.DAO.StudentDaoImpl;
import com.ojas.spring.config.ConfigurationFile;
import com.ojas.spring.config.Student;

public class StudentMainCls {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationFile.class);
		System.out.println("hii..");
		StudentDaoImpl dao = context.getBean(StudentDaoImpl.class);
		System.out.println("***********ListByID*******************");
//		Student std = dao.getStudentById(1);
//		System.out.println(std);
		
		System.out.println("***************List*******************");
		List<Student> allstds = dao.getAllStudents();
		for(Student s:allstds) {
			System.out.println("All Students List is:"+s);
		}
		
//		System.out.println("**********Create******************");
//		Student std1 = new Student();
//		std1.setStudentId(2);
//		std1.setStudentName("Eshwar");
//		std1.setStudentMarks("98");
//		std1.setStudentGrade("b");
//		
//		boolean st = dao.createStudent(std1);
//		System.out.println(st);
		
//		System.out.println("**********Delete******************");
//		boolean res = dao.deleteStudent(std);
//		System.out.println(res);
		
		
//		System.out.println("**********Update******************");
//		Student s1= new Student();
//		s1.setStudentName("Merugu");
//		s1.setStudentMarks("50");
//		s1.setStudentGrade("c");
//		s1.setStudentId(2);
//		boolean b1 = dao.updateStudent(s1);
//		System.out.println(b1);
	}
}
