package com.main;

import com.model.Department;
import com.model.Employee;
import com.service.EmployeeWorks;

public class HrApp {

	public static void main(String[] args) {

		Employee employee1 = new Employee();// default constuctor
		employee1.setEmpNum(123);
		employee1.setEmpName("asd");
		employee1.setSalary(1000f);

		Employee employee2 = new Employee();
		employee2.setEmpNum(456);
		employee2.setEmpName("asdf");
		employee2.setSalary(1000f);

		Employee[] employees = { employee1, employee2 };

		Department department = new Department();
		department.setDeptId(10);
		department.setDeptName("Development");
		department.setEmployees(employees);

		/*
		 * This is for single employee System.out.println("Emp no : " +
		 * department.getEmployee().getEmpNum()); department.setEmployee(employee2);
		 * System.out.println("Emp no : " + department.getEmployee().getEmpNum());
		 */
		// Employee[] returnedEmp = department.getEmployees();

		/*
		 * for (Employee i : department.getEmployees()) {
		 * System.out.println(i.getEmpName()); }
		 */

		Employee employee3 = new Employee();
		employee3.setEmpNum(789);
		employee3.setEmpName("asdfg");
		employee3.setSalary(1000f);

		department.addEmployee(employee3);

		for (Employee i : department.getEmployees()) {
			System.out.println(i.getEmpName());
		}

		department.removeEmployee(employee3);

		for (Employee i : department.getEmployees()) {
			System.out.println(i.getEmpName());
		}

		Employee employee4 = new Employee();
		employee4.setEmpNum(8910);
		employee4.setEmpName("asdfgh");
		employee4.setSalary(1000f);

		department.addEmployee(employee4);

		for (Employee i : department.getEmployees()) {
			System.out.println(i.getEmpName());
		}

		EmployeeWorks.searchEmpByIdEmployee(department, 78911);
		EmployeeWorks.searchEmpByIdEmployee(department, 8910);

	}

}
