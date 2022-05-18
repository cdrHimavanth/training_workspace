package com.services;

import com.model.Employee;

public class CheckEmployee {
	public static String CheckEmployeeEligibility(Employee emp) {
		if(emp.getAge()>18 && emp.getAge()<=58) {
			return "Employee is eligible to work";
		}return "Employee is not eligible to work";
	}
}
