package com.main;

import com.model.Employee;
import com.model.NoMoreSpaceInArrayException;
import com.service.EmployeeWorksImpl;
import com.service.EmployeeWorksInterface;
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class EmpWorksMethodTesting {

	public static void main(String[] args) {
		EmployeeWorksInterface employeeWorksInterface = new EmployeeWorksImpl();
		Employee[] employees = {};
		Employee[] employees2 = {};
		List<Employee> employees3 = new ArrayList<Employee>();
		Scanner scan = new Scanner(System.in);
		System.out.println("No of times you want data to be added!");
		int repeats = scan.nextInt();
		
		long startTime3 = System.currentTimeMillis();
		for (int i = 0; i < repeats; i++) {
			System.out.println("Arr running");
			String name = "Emp" + i;
			Employee employee = new Employee(i, name, i);
			employees3.add(employee);
		}
		long endTime3 = System.currentTimeMillis();
		System.out.println();
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < repeats; i++) {
			String name = "Emp" + i;
			Employee employee = new Employee(i, name, i);
			try {
				employees = employeeWorksInterface.addEmployee(employees, employee);
			} catch (NoMoreSpaceInArrayException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println();

		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < repeats; i++) {
			String name = "Emp" + i;
			Employee employee = new Employee(i, name, i);
			employees2 = employeeWorksInterface.addEmployeeWithOldMethod(employees2, employee);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println();
		
		
		System.out.println("Time taken in milliseconds by new method  :  " + (startTime - endTime));
		System.out.println("Time taken in milliseconds by old method  :  " + (startTime2 - endTime2));
		System.out.println("Time taken in milliseconds by array method  :  " + (startTime3 - endTime3));
		System.out.println();

		// employeeWorksInterface.readAllEmployees(employees);
		/*
		 * System.out.println("Time taken in milliseconds  :  " +
		 * (System.currentTimeMillis() - startTime)); System.out.println();
		 * System.out.println(); System.out.println();
		 * System.out.println("Employee removal is starting"); startTime =
		 * System.currentTimeMillis(); for (int i = 0; i < repeats; i++) {
		 * System.out.println("Employee with id "+i+" is being removed"); employees =
		 * employeeWorksInterface.removeEmployee(employees, i); }
		 * EmployeeWorks.readAllEmployees(employees);
		 * System.out.println("Time taken in milliseconds  :  " +
		 * (System.currentTimeMillis() - startTime));
		 */scan.close();
	}

}
