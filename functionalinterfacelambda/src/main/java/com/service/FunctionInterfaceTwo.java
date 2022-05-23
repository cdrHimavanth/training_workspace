package com.service;

@FunctionalInterface
public interface FunctionInterfaceTwo {
	//Single abstract method
	public abstract void abstractFunction(String s);
	//public abstract void abstractFunction(String s,String s2); //we cannot put more functions here
}
