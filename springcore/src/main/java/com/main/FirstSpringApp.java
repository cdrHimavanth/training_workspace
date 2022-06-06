package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Department;
import com.model.Employee;

public class FirstSpringApp {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		// abstract
		// interface var = mew interfaceimpl();

		applicationContext = new ClassPathXmlApplicationContext("com/config/springconfig2.xml");
		Department department = (Department) applicationContext.getBean("departmentId");
		//System.out.println(department.getDeptNo());
		List<Employee> emps = department.getEmployees();
		for(Employee emp : emps) {
			System.out.println(emp);
		}
		
		System.out.println("The end");
	}

}
