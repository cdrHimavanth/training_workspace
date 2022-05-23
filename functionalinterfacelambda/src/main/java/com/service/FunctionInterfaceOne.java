package com.service;

@FunctionalInterface
public interface FunctionInterfaceOne {
	//Single abstract method
	public abstract void abstractFunction();
	public default void abstractFunction2() {};
	public default void abstractFunction4() {};
	public static void abstractFunction3() {};
}
