package com.model;

public class PermanentEmployee extends Employee {

	@Override
	public float calculateSalary() {
		return 3500f;
	}
	
	public void qualifications() {
		System.out.println("Qualification : Degree");
	}

}
