package com.model;

public class Employee {
	private int empId;
	private String empName;
	private int empSalary;
	private int age=0;
	public Employee() {
		this.empId=00;
		this.empName="no name";
		this.empSalary=000;
		this.age=0;	}
	public Employee(int a,String b,int c) {
		this.empId=a;
		this.empName=b;
		this.empSalary=c;
	}
	public Employee(int a,String b,int c,int d) {
		this.empId=a;
		this.empName=b;
		this.empSalary=c;
		this.age=d;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public int giveHike(int x) {
		this.empSalary=this.empSalary+x;
		return this.empSalary;
	}

}
