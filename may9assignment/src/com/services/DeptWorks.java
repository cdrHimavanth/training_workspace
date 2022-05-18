package com.services;

import com.model.Department;

public class DeptWorks {
	public void display(Department dept) {
		//Assignment 6 print attributes of an object
		System.out.println("DeptId is : "+dept.getDeptId());
		System.out.println("DeptName is : "+dept.getDeptName());
		System.out.println("DeptStatus is : "+dept.getDeptStatus());
	}
	public Department biggerDept(Department dept1,Department dept2) {
		//Assignment 7 return object with bigger id
		return dept1.getDeptId()>dept2.getDeptId()?dept1:dept2;
	}
}
