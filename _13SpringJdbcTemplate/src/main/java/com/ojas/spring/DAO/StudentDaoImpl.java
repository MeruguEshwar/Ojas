package com.ojas.spring.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.ojas.spring.config.Student;
import com.ojas.spring.config.StudentMapper;

@Component
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Student getStudentById(int id) {
		return jdbcTemplate.queryForObject("select * from studentjdbc where id = ?", new Object[]{id},new StudentMapper());
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from studentjdbc",new StudentMapper());
	}

	public boolean deleteStudent(Student student) {
		return jdbcTemplate.update("delete from studentjdbc where id=?",student.getStudentId())>0;
	}

	public boolean updateStudent(Student student) {
		return jdbcTemplate.update("update studentjdbc set sname=?,marks=?,grade=? where id=?",student.getStudentName(),student.getStudentMarks(),student.getStudentGrade(),student.getStudentId())>0;
	}

	public boolean createStudent(Student student) {
		
		return jdbcTemplate.update("insert into studentjdbc values (?,?,?,?)",student.getStudentId(),student.getStudentName(),student.getStudentMarks(),student.getStudentGrade())>0;
	}

}
