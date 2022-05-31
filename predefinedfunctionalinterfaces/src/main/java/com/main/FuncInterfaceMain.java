package com.main;

import com.model.Employee;
import com.model.FunctionalInterfaceWithObject;

public class FuncInterfaceMain {

	public static void main(String[] args) {
		FunctionalInterfaceWithObject functionalInterfaceWithObject = (employee) ->{
			return employee.getEmpName();
		};
		
		Employee employee = new Employee(10,"ten",10.10f);
		System.out.println(functionalInterfaceWithObject.getName(employee));
	}

}
