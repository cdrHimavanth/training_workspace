package com.main;

import com.model.Calculator;
import com.model.MyCalculator;

public class CalApp {

	

	public static void main(String[] args) {
		Calculator calculator = new MyCalculator();
		int val  = calculator.add(2, 4);
		int val2 = calculator.sub(19, 3);
		System.out.println("Addition is : "+val);
		System.out.println("Sub is : "+val2);
	}

}
