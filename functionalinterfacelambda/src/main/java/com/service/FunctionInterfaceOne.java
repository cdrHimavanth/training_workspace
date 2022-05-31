package com.service;

@FunctionalInterface
public interface FunctionInterfaceOne {
	//Single abstract method
	public abstract void abstractFunction();
	public default void defaultFunction1() {
		System.out.println("default 1");
	};
	public default void defaultFunction2() {
		System.out.println("default 2");
	};
	public static void staticFunction1() {
		System.out.println("static 1");
	};
	public static void staticFunction2() {
		System.out.println("Static 2");
	};
}
