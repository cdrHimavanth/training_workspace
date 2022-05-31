package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import com.model.Employee;

public class BiConsumerMain {

	public static void main(String[] args) {
		
		BiConsumer<String, Integer> myBiFunc = (String str ,Integer intVar)->{
			System.out.println("str  :  "+intVar);
		};
		
		myBiFunc.accept("happpy", 10);
		
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee1 = new Employee(1,"1",1.00f);
		Employee employee2= new Employee(2,"2",1.00f);
		Employee employee3 = new Employee(3,"3",1.00f);
		Employee employee4 = new Employee(4,"4",1.00f);
		employees.add(employee4);
		employees.add(employee3);
		employees.add(employee2);
		employees.add(employee1);
		
		BiFunction<List<Employee>, String, Employee>  myBiFunc2 = (EmpArr,name) ->{
			for(Employee emp:EmpArr) {
				if(emp.getEmpName().equals(name)) {
					return emp;
				}
			}
			return null;
		};
		Employee res = myBiFunc2.apply(employees,"10");
		if(res!=null) {
			System.out.println(res.getEmpNo());
		}else {
			System.out.println("No such employee");
		}
	}

}
