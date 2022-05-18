package com.main;

import com.model.Employee;
import com.service.EmployeeWorks;

import java.util.Scanner;

public class EmpWorksMethodTesting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("No of times you want data to be added!");
		int repeats = scan.nextInt();
		long startTime = System.currentTimeMillis();
		Employee[] employees = {};
		for (int i = 0; i < repeats; i++) {
			String name = "Emp" + i;
			Employee employee = new Employee(i, name, i);
			employees = EmployeeWorks.addEmployee(employees, employee);
		}
		EmployeeWorks.readAllEmployees(employees);
		System.out.println("Time taken in milliseconds  :  " + (System.currentTimeMillis() - startTime));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Employee removal is starting");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < repeats; i++) {
			System.out.println("Employee with id "+i+" is being removed");
			employees = EmployeeWorks.removeEmployee(employees, i);
		}
		EmployeeWorks.readAllEmployees(employees);
		System.out.println("Time taken in milliseconds  :  " + (System.currentTimeMillis() - startTime));
		scan.close();
	}

}
