package com.model;

public class ContractEmployee extends Employee {

	@Override
	public float calculateSalary() {
		return 2500f;
	}
	public void qualifications() {
		System.out.println("Qualification : Diploma");
	}

}
