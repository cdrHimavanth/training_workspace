package com.model;

public class Department {
	private int deptId;
	private String deptName;

	private Employee[] employees;

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee employee) {
		Employee[] oldEmpArr = this.employees;
		Employee[] newEmpArr = new Employee[oldEmpArr.length+1];
		for(int i=0;i<oldEmpArr.length;i++) {
			newEmpArr[i]=oldEmpArr[i];
		}
		newEmpArr[oldEmpArr.length]=employee;
		this.employees=newEmpArr;
	}
	
	public void removeEmployee(Employee employee) {
		Employee[] oldEmpArr = this.employees;
		int count = 0;
		for(Employee emp:oldEmpArr) {
			if(emp==employee) {
				count++;
			}
		}
		Employee[] newEmpArr = new Employee[oldEmpArr.length-count];
		int count2=0;
		for(Employee emp:oldEmpArr) {
			if(emp!=employee) {
				newEmpArr[count2]=emp;
				count2++;
			}
		}
		this.employees=newEmpArr;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
