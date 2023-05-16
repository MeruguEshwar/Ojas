package com.ojas.spring.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.ojas.spring.bean.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int i) throws SQLException {

		Employee emp = new Employee();
		emp.setId(rs.getInt("id"));
		emp.setEname(rs.getString("ename"));
		emp.setSalary(rs.getDouble("salary"));

		return emp;
	}

}
