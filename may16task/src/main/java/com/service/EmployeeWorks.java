package com.service;

import com.model.Employee;

public class EmployeeWorks {
	public static Employee[] addEmployee(Employee[] emps, Employee emp) {
		//long startTime = System.currentTimeMillis();
		int count = emps.length;
		Employee[] employees = new Employee[count+1];
		for (int i = 0; i < count; i++) {
			employees[i] = emps[i];
		}
		employees[count] = emp;
		//System.out.println("Time taken for operation in milli seconds  :  "+(System.currentTimeMillis()-startTime));
		return employees;
	}

	public static Employee[] removeEmployee(Employee[] emps, int empId) {
		//long startTime = System.currentTimeMillis();
		int count = emps.length;
		int matchCount = 0;
		for (int i = 0; i < emps.length; i++) {
			if (emps[i].getEmpId() == empId) {
				matchCount++;
			}
		}
		Employee[] employees=null;
		if(matchCount>0) {
			 employees= new Employee[count - matchCount];
			int j = 0;
			for (int i = 0; i < count; i++) {
				if (emps[i].getEmpId() == empId) {
					continue;
				} else {
					employees[j] = emps[i];
					j++;
				}
			}
			emps=employees;
		}
		//System.out.println("Time taken for operation in milli seconds  :  "+(System.currentTimeMillis()-startTime));
		return emps;
	}

	public static Employee[] updateEmployee(Employee[] emps, int empId,String name,float salary) {
		//long startTime = System.currentTimeMillis();
		int count = emps.length;
		for (int i = 0; i < count; i++) {
			if (emps[i].getEmpId() == empId) {
				emps[i].setEmpName(name);
				emps[i].setSalary(salary);
			} 
		}
		//System.out.println("Time taken for operation in milli seconds  :  "+(System.currentTimeMillis()-startTime));
		return emps;
	}

	public static void readAllEmployees(Employee[] emps) {
		//long startTime = System.currentTimeMillis();
		for (Employee emp : emps) {
			System.out.println(
					"Name : " + emp.getEmpName() + "  Id : " + emp.getEmpId() + "   Salary  : " + emp.getSalary());
		}
		//System.out.println("Time taken for operation in milli seconds  :  "+(System.currentTimeMillis()-startTime));
	}
}
