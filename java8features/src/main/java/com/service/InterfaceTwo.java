package com.service;

public interface InterfaceTwo {
	public default int add(int num1,int num2) {
		return num1 + num2;
	}
}
