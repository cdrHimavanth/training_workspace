package com.model;

public class MyClassImpl implements InterfaceOne, InterfaceTwo {

	@Override
	public int sub(int num1, int num2) {
		
		return num1+num2;
	}

	@Override
	public int add(int num1, int num2) {
		
		return num1-num2;
	}

}
