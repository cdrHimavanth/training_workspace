package com.main;

import com.model.Department;
import com.services.DeptWorks;

public class DeptMain {

	public static void main(String[] args) {
		Department department =new Department(1,"Ele",true);
		Department department2 =new Department(10,"Mec",true);
		DeptWorks deptWorks = new DeptWorks();
		// assignment 6 display details
		deptWorks.display(department);
		//Assignment 7 return object
		Department bigOne = deptWorks.biggerDept(department, department2);
		System.out.println(bigOne.getDeptName());
		bigOne=null;
		department=null;
		deptWorks=null;
	}

}
