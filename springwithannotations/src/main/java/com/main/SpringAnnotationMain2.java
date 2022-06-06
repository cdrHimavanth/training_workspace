package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.model.Department;

public class SpringAnnotationMain2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Department department = (Department)ctx.getBean("ABC");
		
		System.out.println(department.getDeptName());
	}

}
