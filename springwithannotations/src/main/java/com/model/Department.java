package com.model;


import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Configuration
@PropertySource("classpath:/anyname.properties")
@Component(value="ABC")
public class Department {
	@Value(value="${apple}")
	private int deptNo;
	@Value(value="${mango}")
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
