package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*import java.util.Set;
import java.util.TreeSet;*/

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.model.Employee;
import com.model.SortById;
import com.model.SortBySalary;

public class LogMainApp {
	private static final Logger LOGGER = LogManager.getLogger(LogMainApp.class);
	public static void main(String[] args) {
		/*
		 * LOGGER.info("Info method"); LOGGER.error("Error occurred");
		 * LOGGER.fatal("Something fatal"); LOGGER.debug("Debug method");
		 *
		 * Set<Integer> set = new TreeSet<>(); set.add(2); set.add(1); set.add(10);
		 * set.add(11); set.add(9); set.add(4); set.add(2); LOGGER.info(set);
		 */
		Employee employee1 = new Employee(1,"asd",1200);
		Employee employee2 = new Employee(2,"asd",12100);
		Employee employee3 = new Employee(3,"asd",12040);
		Employee employee4 = new Employee(4,"asd",12300);
		Employee employee5 = new Employee(5,"asd",1200);
		Employee employee6 = new Employee(6,"asd",12500);
		Employee employee7 = new Employee(7,"asd",12002);
		
		List<Employee> list = new ArrayList<>();
		
		list.add(employee1);
		list.add(employee2);
		list.add(employee5);
		list.add(employee4);
		list.add(employee3);
		list.add(employee7);
		list.add(employee6);
		Collections.sort(list,new SortById());
		for(Employee employee:list) {
			LOGGER.info(employee.getSalary()+"  "+employee.getEmpId());
		}
		Collections.sort(list,new SortBySalary());
		for(Employee employee:list) {
			LOGGER.info(employee.getSalary()+"  "+employee.getEmpId());
		}
		
	}

}
