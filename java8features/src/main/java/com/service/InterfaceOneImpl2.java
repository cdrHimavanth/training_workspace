package com.service;

public class InterfaceOneImpl2 implements InterfaceOne {

	@Override
	public void functionOne() {
		
		// override --> Dynamic polymorphism the method in parent class is overridden in child class
		
		System.out.println("Function one called in impl 2!");
	}

}
