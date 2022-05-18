package com.main;

import com.model.Employee;
import com.service.BusinessLogic;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmpId(10);
		employee1.setEmpName("abc1");
		employee1.setEmpSalary(1010.10f);

		Employee employee2 = new Employee();
		employee2.setEmpId(20);
		employee2.setEmpName("abc2");
		employee2.setEmpSalary(1030.10f);

		Employee employee3 = new Employee();
		employee3.setEmpId(30);
		employee3.setEmpName("abc3");
		employee3.setEmpSalary(1010.10f);

		// user defined type arrays
		Employee[] employees = new Employee[3];
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		BusinessLogic businessLogic = new BusinessLogic();
		System.out.println(businessLogic.searchByEmployeeId(employees, 20)?"Employee id is present":"Employee id is not present");
		Employee[] chosenEmployees = BusinessLogic.checkSalaries(employees, 1010.10f);
		for (int i = 0; i < chosenEmployees.length; i++) {
			System.out.println(chosenEmployees[i].getEmpName());
			System.out.println(chosenEmployees[i].getEmpId());
		}
	}

}
