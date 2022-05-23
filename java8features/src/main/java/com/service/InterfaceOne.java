package com.service;

public interface InterfaceOne {
	public static final int INTVAR = 100;
	
	public abstract void functionOne();
	
	public default int add(int num1,int num2) {
		return num1 + num2;
	};
}
