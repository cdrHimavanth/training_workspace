package com.main;

import com.model.Employee;
//import com.service.EmployeeWorks;

import java.util.Scanner;
import java.util.ArrayList;

public class EmpAppWithCollections {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<Employee>();
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
					System.out.println("Total employees" + employees.size());
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
					employees.add(employee);
					System.out.println("Total employees" + employees.size());
					break;
				case 2:
					System.out.println("Employee is being edited.....Please follow the instructions");
					System.out.println("Enter Id of employee You Want to Change");
					int id = scan.nextInt();
					int count = 0;
					for (Employee emp : employees) {
						if (emp.getEmpId() == id) {
							count++;
						}
					}
					if (count == 0) {
						System.out.println("There is no employee with id : " + id);
					} else {
						System.out.println("Enter new name");
						scan.nextLine();
						String newName = scan.nextLine();
						float newSalary = scan.nextFloat();
						for (Employee emp : employees) {
							if (emp.getEmpId() == id) {
								emp.setEmpName(newName);
								emp.setSalary(newSalary);
							}
						}
					}
					System.out.println("The employee has been updated successfully");
					break;
				case 3:
					for (Employee emp : employees) {
						System.out.println("Name : " + emp.getEmpName() + "  Id : " + emp.getEmpId() + "   Salary  : "
								+ emp.getSalary());
					}
					break;
				case 4:
					System.out.println("Enter Id of employee you want to remove");
					int ids = scan.nextInt();
					int counts = 0;
					for (Employee emp : employees) {
						if (emp.getEmpId() == ids) {
							counts++;
						}
					}
					if (counts == 0) {
						System.out.println("There is no employee with id : " + ids);
					} else {
						for (Employee emp : employees) {
							if (emp.getEmpId() == ids) {
								employees.remove(emp);
							}
						}
					}
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
