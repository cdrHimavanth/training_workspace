package com.main;

import com.model.Employee;

public class ConstructorDemo {

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpNum());
		System.out.println(employee.getSalary());
		
		
		Employee employee2  = new Employee(22, "Abc", 1234f);
		System.out.println(employee2.getEmpName());
		System.out.println(employee2.getEmpNum());
		System.out.println(employee2.getSalary());
	}

}
