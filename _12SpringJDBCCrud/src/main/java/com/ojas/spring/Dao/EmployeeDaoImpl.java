package com.ojas.spring.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ojas.spring.Mapper.EmployeeMapper;
import com.ojas.spring.bean.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    
	@Autowired
	public JdbcTemplate jt;
	


	public Employee getEmployeeById(int id) {
		return jt.queryForObject("SELECT * FROM emp WHERE id=?", new Object[] { id }, new EmployeeMapper());
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return jt.query("select * from emp", new EmployeeMapper());
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

}
