package com.services;

import com.model.Employee;
public class EmpWorks {
	public void higherSalary(Employee emp1,Employee emp2) {
		System.out.println(emp1.getEmpSalary()>emp2.getEmpSalary()?emp1.getEmpSalary():emp2.getEmpSalary());
	}
	public int higherSalaryOfTwo(Employee emp1,Employee emp2) {
		return emp1.getEmpSalary()>emp2.getEmpSalary()?emp1.getEmpSalary():emp2.getEmpSalary();
	}
	public void employeeWithHigherSalary(Employee emp1,Employee emp2) {
		System.out.println(emp1.getEmpSalary()>emp2.getEmpSalary()?emp1.getEmpName():emp2.getEmpName());
	}
}
