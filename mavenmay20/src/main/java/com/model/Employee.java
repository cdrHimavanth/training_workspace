package com.model;

public class Employee implements Comparable<Employee> {
	
	private int empId;
	private String empName;
	private float salary;
	public Employee() {
		super();
	}
	public Employee(int id,String name,float slry) {
		this.empId=id;
		this.empName=name;
		this.salary=slry;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		if(salary==o.getSalary()) {
			return 0;
		}else if(salary>o.getSalary()) {
			return 1;
		}
		return -1;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
}
