package com.main;

import com.services.Calculator;
//Assignment 5 calculator
public class Calculations {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		calculator.add(10, 5);
		calculator.sub(10, 5);
		calculator.mul(10, 5);
		calculator.div(10, 5);
		
		int add =calculator.addAndReturn(10, 5); // Passing as arguments
		int sub =calculator.subAndReturn(10, 5);
		int mul =calculator.mulAndReturn(10, 5);
		int div =calculator.divAndReturn(10, 5);
		
		System.out.println("addition : "+add);
		System.out.println("subtraction : "+sub);
		System.out.println("multiplication : "+mul);
		System.out.println("division : "+div);
		
		calculator=null;
	}

}
