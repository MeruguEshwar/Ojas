package com.ojas.spring.bean;


public class Employee {

	public int id;
	public String Ename;
	public double Salary;
	
	public Employee(){
		
	}
	

	public Employee(int id, String ename, double salary) {
		this.id = id;
		Ename = ename;
		Salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String toString() {
		return id + "/" + Ename + "/" + Salary;
	}
}
