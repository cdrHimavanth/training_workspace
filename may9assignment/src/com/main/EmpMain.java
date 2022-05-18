package com.main;

import com.model.Employee;
import com.services.EmpWorks;  
import com.services.CheckEmployee;
public class EmpMain {

	public static void main(String[] args) {
		Employee employee = new Employee(10,"Hima",2800,23);
		Employee employee2 = new Employee(11,"Hima2",2802,15);
		EmpWorks empWorks =new EmpWorks();
		//Assignment 8 what is higher salary
		empWorks.higherSalary(employee, employee2);
		//Assignment 9 Who is getting higher Salary
		empWorks.employeeWithHigherSalary(employee, employee2);
		
		
		//Assignment 10 pass dynamic input to object methods
		System.out.println(employee.getEmpSalary());
		employee.giveHike(1000);
		System.out.println(employee.getEmpSalary());
		
		//Assignment 11 
		System.out.println(CheckEmployee.CheckEmployeeEligibility(employee2));
		System.out.println(CheckEmployee.CheckEmployeeEligibility(employee));
		employee=null;
	}

}
