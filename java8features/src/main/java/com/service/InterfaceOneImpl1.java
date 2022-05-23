package com.service;

public class InterfaceOneImpl1 implements InterfaceOne,InterfaceTwo {

	@Override
	public void functionOne() {
		
		// override --> Dynamic polymorphism the method in parent class is overridden in child class
		
		System.out.println("Function one called in impl 1!");
	}

	@Override
	public int add(int num1, int num2) {
		return InterfaceOne.super.add(num1, num2);
	}

}
