package com.model;


import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Department {
	private int deptNo;
	private String deptName;
	private List<Employee> employees;
 
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department(int deptNo, String deptName, List<Employee> employees) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.employees = employees;
	}

	public Department() {
		super();
		//System.out.println("dept without para called");
	}

	public Department(int deptNo, String deptName) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		//System.out.println("dept with para called");
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	
}
