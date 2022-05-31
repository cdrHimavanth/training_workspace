package com.main;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.service.BusinessService;

public class StreamDemo {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee1 = new Employee(1, "1", 1.00f);
		Employee employee2 = new Employee(2, "12", 1.00f);
		Employee employee3 = new Employee(3, "3", 1.00f);
		Employee employee4 = new Employee(4, "11", 1.00f);
		employees.add(employee4);
		employees.add(employee3);
		employees.add(employee2);
		employees.add(employee1);

		System.out.println(employees.stream().filter((a) -> a.getEmpName().startsWith("1")).count());

		/*
		 * employees.forEach((a) -> { System.out.println(a.getEmpNo()); });
		 */

		/*
		 * List<Employee> employeesFiltered =
		 * employees.stream().filter((a)->a.getEmpName().startsWith("1"));
		 * employeesFiltered.forEach((a)->{ System.out.println(a.getEmpNo()); });
		 */// doesnot work!!!!!!!
		/*
		 * BusinessService businessService = new BusinessService();
		 * 
		 * 
		 * 
		 * long l = businessService.countEmployee(employees,'1'); System.out.println(l);
		 */
	}

}
