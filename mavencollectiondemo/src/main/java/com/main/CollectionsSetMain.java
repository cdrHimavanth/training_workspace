package com.main;

import com.model.Address;
import com.model.Department;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsSetMain {

	public static void main(String[] args) {
		Department department1 = new Department(10,"Development1");
		Department department2 = new Department(11,"Development2");
		Department department3 = new Department(12,"Development3");
		
		Set set = new HashSet();
		System.out.println(set.size());
		
		set.add(department1);
		set.add(department2);
		set.add(department3);
		
		Address address1  = new Address(1,"abc","efg");
		Address address3 = new Address(1,"abc","efg");
		Address address2  = new Address(1,"abc","efg");
		set.add(address2);
		set.add(address3);
		set.add(address1);
		System.out.println(set.size());
		set.remove(department2);
		System.out.println(set.size());
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Department) {
				Department new_name = (Department) object;
				System.out.println("Dept Id  : "+new_name.getDeptName());
			}
			if (object instanceof Address) {
				Address new_name = (Address) object;
				System.out.println("City Name  : "+new_name.getCity());
			}
		}
	}

}
