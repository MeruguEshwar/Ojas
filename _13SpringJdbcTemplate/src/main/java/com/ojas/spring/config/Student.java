package com.ojas.spring.config;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int studentId;
	private String studentName;
	private String studentMarks;
	private String studentGrade;
	
	
	public Student(int studentId, String studentName, String studentMarks, String studentGrade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		this.studentGrade = studentGrade;
	}
	
	public Student() {
		
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(String studentMarks) {
		this.studentMarks = studentMarks;
	}
	public String getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ ", studentGrade=" + studentGrade + "]";
	}
	
	
	
}
