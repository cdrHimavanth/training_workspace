package com.model;

//POJO ->Plain Old Java Object
public class Employee {
	private int empNum;
	private String empName;
	private float salary;

	// Method(Constructor) over loading as one name many functions --> polymorphism
	public Employee() {
		empNum = 100;
		empName = "Some Name";
		salary = 1010f;
	}

	public Employee(int empNum, String empName, float salary) {// constructor with Parameter
		this.empNum = empNum;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
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

}
