package com.ojas.spring.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Component;

import com.ojas.spring.mapper.StudentMapper;
import com.ojas.spring.model.Student;

@Component
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	String msg;

	public List<Student> getAllStudents() {
		return jdbcTemplate.query("select * from studentpreparedstatment", new StudentMapper());
	}

	@Override
	public String CreateStudent(Student student) {
		String INSERT_USER = "insert into studentpreparedstatment values(?,?,?)";

		boolean n = jdbcTemplate.execute(INSERT_USER, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, student.getStudentId());
				ps.setString(2, student.getStudentName());
				ps.setString(3, student.getStudentMarks());
				return ps.execute();
			}
		});

		if (n = true) {
			return "student inserted";
		} else {
			return "failed";
		}

	}

	@Override
	public String UpdateStudent(Student student) {

		String UPDATE_USER = "update studentpreparedstatment set studentName=?,studentMarks=? where studentId=?";

		boolean n = jdbcTemplate.execute(UPDATE_USER, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(3, student.getStudentId());
				ps.setString(1, student.getStudentName());
				ps.setString(2, student.getStudentMarks());
				return ps.execute();
			}
		});

		if (n = true) {
			return "student updated successfull";
		} else {
			return "failed";
		}
	}
	@Override
	public boolean DeleteStudent(Student student) {
		
		String DELETE_USER = "delete from studentpreparedstatment where studentId=?";
		
		boolean n = jdbcTemplate.execute(DELETE_USER,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, student.getStudentId());
				return ps.execute();
			}
		});
		
		if (n = true) {
			return true;
		} else {
			return false;
		}
	}

}
