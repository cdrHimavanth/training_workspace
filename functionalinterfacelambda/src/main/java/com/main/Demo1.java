package com.main;

import com.service.FunctionInterfaceOne;
import com.service.FunctionInterfaceThree;
import com.service.FunctionInterfaceTwo;

public class Demo1 {

	public static void main(String[] args) {
		FunctionInterfaceOne functionInterfaceOne =  () -> System.out.println("FI with no args");
		functionInterfaceOne.abstractFunction();
		
		FunctionInterfaceOne.staticFunction1();
		FunctionInterfaceOne.staticFunction2();
		
		functionInterfaceOne.defaultFunction1();
		functionInterfaceOne.defaultFunction2();
		
		FunctionInterfaceTwo functionInterfaceTwo =  (String s) -> {
			System.out.println("FI with no args "+s);
			System.out.println(s);
			};
		functionInterfaceTwo.abstractFunction("This is arg passed");
		
		FunctionInterfaceThree functionInterfaceThree =  (String s) -> {
			return "This is returned " + s;
			};
		System.out.println(functionInterfaceThree.abstractFunction("This is arg passed"));
	}
}
