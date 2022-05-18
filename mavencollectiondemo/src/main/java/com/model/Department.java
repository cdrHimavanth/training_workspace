package com.model;

public class Department {
	private int deptId;
	private String deptName;
	public Department() {
		super();
	}
	public Department(int id,String name) {
		this.deptId=id;
		this.deptName=name;
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
