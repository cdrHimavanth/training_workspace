package com.service;

import com.model.Employee;
import com.model.NoMoreSpaceInArrayException;

public interface EmployeeWorksInterface {
	public abstract Employee[] addEmployee(Employee[] oldEmployeesArr, Employee newEmployee) throws NoMoreSpaceInArrayException;
	
	public abstract Employee[] addEmployeeWithOldMethod(Employee[] oldEmployeesArr, Employee newEmployee);

	public abstract boolean checkForEmployeeById(Employee[] employees, int employeeId);

	public abstract boolean checkForEmployeeByName(Employee[] employees, String employeeName);
	
	public abstract Employee getEmployeeById(Employee[] employees,int employeeId);
	
	public abstract Employee getEmployeeByName(Employee[] employees,String employeeName);
	
	public abstract Employee[] removeEmployeeById(Employee[] employees,int employeeId);
	
	public abstract Employee[] removeEmployeeByName(Employee[] employees,String employeeName);
	
	public abstract void readAllEmployees(Employee[] employees);
}
