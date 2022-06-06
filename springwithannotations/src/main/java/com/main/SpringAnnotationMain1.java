package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.model.Department;

public class SpringAnnotationMain1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Department.class);
		Department department = (Department)ctx.getBean("ABC");
		
		System.out.println(department.getDeptName());
	}

}
