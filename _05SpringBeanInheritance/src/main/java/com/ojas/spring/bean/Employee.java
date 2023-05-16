package com.ojas.spring.bean;

public class Employee {

	private String EmployeeName;
	private String EmployeeSalary;
	private Address address;
	public Employee(){
		
	}
	
	
	public Employee( String employeeName, String employeeSalary) {
		super();
		EmployeeName = employeeName;
		EmployeeSalary = employeeSalary;
	}


	public Employee(String employeeName, String employeeSalary, Address address) {
		super();
		EmployeeName = employeeName;
		EmployeeSalary = employeeSalary;
		this.address = address;
	}
	
	public void show(){  
	    System.out.println(EmployeeName+" "+EmployeeSalary);  
	    System.out.println(address);  
	}  
	
}
