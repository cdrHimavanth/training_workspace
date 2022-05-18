package com.main;

import com.model.Address;
import com.model.Department;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class CollectionsListMain {

	public static void main(String[] args) {
		Department department1 = new Department(10,"Development1");
		Department department2 = new Department(11,"Development2");
		Department department3 = new Department(12,"Development3");
		
		List list = new ArrayList();
		System.out.println(list.size());
		
		list.add(department1);
		list.add(department2);
		list.add(department3);
		
		Address address1  = new Address(1,"abc","efg");
		Address address3 = new Address(1,"abc","efg");
		Address address2  = new Address(1,"abc","efg");
		list.add(address2);
		list.add(address3);
		list.add(address1);
		System.out.println(list.size());
		list.remove(department2);
		System.out.println(list.size());
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
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
