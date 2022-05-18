package com.service;

import com.model.Department;
import com.model.Employee;

public class EmployeeWorks {
	public static void searchEmpByIdEmployee(Department dept, int empId) {
		boolean isThere=false;
		for(Employee emp:dept.getEmployees()) {
			if(emp.getEmpNum()==empId) {
				isThere=true;
				break;
				
			}
		}
		if(isThere) {
			System.out.println("Yes There is an employee with given employee id");
		}else {
			System.out.println("No There isn't an employee with given employee id");
		}
		
	}
	public static Employee getEmpByIdEmployee(Department dept, int empId) {
		for(Employee emp:dept.getEmployees()) {
			if(emp.getEmpNum()==empId) {
				return emp;
			}
		}
		return null;
	}
	public static Employee[] getEmpsByEmployeeName(Department dept, String empName) {
		int count = 0;
		for (int i = 0; i < dept.getEmployees().length; i++) {
			count++;
		}
		Employee[] emps = new Employee[count];
		count=0;
		for(Employee emp:dept.getEmployees()) {
			if(emp.getEmpName().equals(empName)) {
				emps[count]=emp;
				count++;
			}
		}
		return emps;
	}
}
