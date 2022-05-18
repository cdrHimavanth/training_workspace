package com.main;

import com.model.Employee;
import com.model.PermanentEmployee;

public class HrApp {

	public static void main(String[] args) {
		Employee employee = new PermanentEmployee();
		employee.calculateSalary();
		
	}

}

