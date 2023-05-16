package com.ojas.spring.Dao;

import java.util.List;

import com.ojas.spring.bean.Employee;



public interface EmployeeDao {

	Employee getEmployeeById(int id);

	List<Employee> getAllEmployees();

	boolean deleteEmployee(Employee employee);

	boolean updateEmployee(Employee employee);

	boolean createEmployee(Employee employee);
}
