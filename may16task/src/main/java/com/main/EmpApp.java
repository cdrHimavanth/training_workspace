package com.main;

import com.model.Employee;
import com.service.EmployeeWorks;

import java.util.Scanner;

public class EmpApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee emp1 = new Employee(10, "Admin", 10);
		Employee[] employees = { emp1 };
		System.out.println("Press 1 to create a new employee");
		System.out.println("Press 2 to edit an employee");
		System.out.println("Press 3 to read employee details");
		System.out.println("Press 4 to delete an employee");
		System.out.println("Press any other key to terminate");
		while (scan.hasNextInt()) {

			int a = scan.nextInt();
			// System.out.println(a); //for input testing
			if (a < 1 || a > 4) {
				break;
			} else {
				switch (a) {
				case 1:
					//System.out.println("Total employees :  " + employees.length);
					System.out.println("New employee is being created.....Please follow the instructions");
					Employee employee = new Employee();
					System.out.println("Please enter the Employee Id");
					employee.setEmpId(scan.nextInt());
					System.out.println("Please enter the Employee Name");
					scan.nextLine();
					employee.setEmpName(scan.nextLine());
					System.out.println("Please enter the Salary of employee");
					employee.setSalary(scan.nextFloat());
					System.out.println("The new employee has been added");
					employees = EmployeeWorks.addEmployee(employees, employee);
					//System.out.println("Total employees :  " + employees.length);
					break;
				case 2:
					System.out.println("Employee is being edited.....Please follow the instructions");
					System.out.println("Enter Id of employee You Want to Change");
					int id = scan.nextInt();
					System.out.println("Enter new name");
					scan.nextLine();
					String newName = scan.nextLine();
					System.out.println("Enter new salary");
					float newSalary = scan.nextFloat();
					employees = EmployeeWorks.updateEmployee(employees, id, newName, newSalary);
					System.out.println("Employee has been added successfully");
					break;
				case 3:
					EmployeeWorks.readAllEmployees(employees);
					break;
				case 4:
					//System.out.println("Total employees :  " + employees.length);
					System.out.println("Enter Id of employee you want to remove");
					int ids = scan.nextInt();
					employees = EmployeeWorks.removeEmployee(employees, ids);
					System.out.println("Employee removed successfully");
					//System.out.println("Total employees :  " + employees.length);
					break;
				default:
					//
				}

			}
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("Waiting for your next command");
		}
		System.out.println("Terminated");
		scan.close();
	}

}
