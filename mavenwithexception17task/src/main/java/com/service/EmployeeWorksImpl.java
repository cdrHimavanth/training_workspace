package com.service;


import com.model.Employee;
import com.model.NoMoreSpaceInArrayException;

public class EmployeeWorksImpl implements EmployeeWorksInterface {

	@Override
	public Employee[] addEmployee(Employee[] oldEmployeesArr, Employee newEmployee) throws NoMoreSpaceInArrayException {
		Employee[] newEmployeesArr=null;
		boolean gapIsPresent=false;
		try {
			for(int i=0;i<oldEmployeesArr.length;i++) {
				if(oldEmployeesArr[i]==null) {
					oldEmployeesArr[i]=newEmployee;
					gapIsPresent=true;
					newEmployeesArr=oldEmployeesArr;
					break;
				}
			}
			if(!gapIsPresent) {
				throw new NoMoreSpaceInArrayException("Array Is Full");
			}
		} catch (NoMoreSpaceInArrayException e) {
			int count = oldEmployeesArr.length;
			newEmployeesArr = new Employee[count+(count/2)+8];
			System.out.println(newEmployeesArr.length+" Is The Size");
			for (int i = 0; i < count; i++) {
				newEmployeesArr[i] = oldEmployeesArr[i];
			}
			newEmployeesArr[count] = newEmployee;
		}
		return newEmployeesArr;
	}

	@Override
	public boolean checkForEmployeeById(Employee[] employees, int employeeId) {
		boolean exists=false;
		for(Employee employee:employees) {
			if(employee.getEmpId()==employeeId) {
				exists=true;
				break;
			}
		}
		if(!exists) {
			System.out.println("Employee with Id  : "+employeeId+" doesn't exists");
		}
		return exists;
	}

	@Override
	public boolean checkForEmployeeByName(Employee[] employees, String employeeName) {
		boolean exists=false;
		for(Employee employee:employees) {
			if(employee.getEmpName().equals(employeeName)) {
				exists=true;
				break;
			}
		}
		if(!exists) {
			System.out.println("Employee with name  : "+employeeName+" doesn't exists");
		}
		return exists;
	}

	@Override
	public Employee getEmployeeById(Employee[] employees, int employeeId) {
		for(Employee employee:employees) {
			if(employee.getEmpId()==employeeId) {
				return employee;
			}
		}
		System.out.println("Employee with Id  : "+employeeId+" doesn't exists");
		return null;
	}

	@Override
	public Employee getEmployeeByName(Employee[] employees, String employeeName) {
		for(Employee employee:employees) {
			if(employee.getEmpName().equals(employeeName)) {
				return employee;
			}
		}
		System.out.println("Employee with name  : "+employeeName+" doesn't exists");
		return null;
	}

	@Override
	public Employee[] removeEmployeeById(Employee[] employees, int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee[] removeEmployeeByName(Employee[] employees, String employeeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void readAllEmployees(Employee[] employees) {
		for (Employee emp : employees) {
			if(emp!=null) {
				System.out.println(
						"Name : " + emp.getEmpName() + "  Id : " + emp.getEmpId() + "   Salary  : " + emp.getSalary());
			
			}
			
			}

	}

}
