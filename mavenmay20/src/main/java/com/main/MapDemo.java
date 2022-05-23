package com.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.model.Employee;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,Employee> map = new HashMap<String,Employee>();
		
		Employee employee1 = new Employee(1,"asd",1200);
		Employee employee2 = new Employee(2,"asd",12100);
		Employee employee3 = new Employee(3,"asd",12040);
		Employee employee4 = new Employee(4,"asd",12300);
		Employee employee5 = new Employee(5,"asd",1200);
		Employee employee6 = new Employee(6,"asd",12500);
		Employee employee7 = new Employee(7,"asd",12002);
		
		
		map.put("aa", employee7);
		map.put("bb", employee6);
		map.put("cc", employee5);
		map.put("dd", employee4);
		map.put("ee", employee3);
		map.put("ff", employee2);
		map.put("gg", employee1);
		
		for (Map.Entry<String, Employee> entry: map.entrySet())
		{
		    String key = (String)entry.getKey();
		    Employee value = entry.getValue();
		 
		    System.out.println(key + "=" + value);
		}
		
	}

}
