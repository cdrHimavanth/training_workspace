package com.model;

public class Department {
	
	
	private int deptId;
	private String deptName;
	private boolean deptStatus;
	
	public Department() {
		this.deptId=000;
		this.deptName="No name";
		this.deptStatus=false;         
	}
	
	public Department(int a,String b,boolean c){
		this.deptId=a;
		this.deptName=b;
		this.deptStatus=c;
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
	
	public boolean getDeptStatus() {
		return deptStatus;
	}
	public void setDeptStatus(boolean deptStatus) {
		this.deptStatus = deptStatus;
	}
	
	
}
