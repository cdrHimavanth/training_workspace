package com.service;

import java.util.List;

import com.model.Employee;

public class BusinessService {
	public long countEmployee(List<Employee> employees,char a) {
		long count =0;
		for(Employee emp:employees) {
			if(emp!=null) {
				if(emp.getEmpName().charAt(0)==a) {
					count+=1;
				}
				
			}
		}
		return count;
	}
}
