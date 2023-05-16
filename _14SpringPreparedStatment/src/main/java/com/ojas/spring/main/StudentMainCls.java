package com.ojas.spring.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ojas.spring.config.StudentConfiguration;
import com.ojas.spring.dao.StudentDaoImpl;
import com.ojas.spring.model.Student;

public class StudentMainCls {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext(StudentConfiguration.class);
//		System.out.println("Inserting the details...");
		Student st = new Student();
		StudentDaoImpl dimpl = acc.getBean(StudentDaoImpl.class);
//		st.setStudentId(4);
//		st.setStudentName("Nani");
//		st.setStudentMarks("78");
//		String b = dimpl.CreateStudent(st);
//		System.out.println(b);

//		System.out.println("GetAll Student Details.....");
//		List<Student> allstd = dimpl.getAllStudents();
//		allstd.forEach(
//				(n)->System.out.println(n)
//		);

//		System.out.println("Update Stuedent Details..");
//		st.setStudentName("nani");
//		st.setStudentMarks("100");
//		st.setStudentId(1);
//		String updatedstd = dimpl.UpdateStudent(st);
//		System.out.println("updated student details is:" + updatedstd);
		
		System.out.println("Delete student:");
		st.setStudentId(2);
		boolean delstd=dimpl.DeleteStudent(st);
		System.out.println(delstd);
	}

}
