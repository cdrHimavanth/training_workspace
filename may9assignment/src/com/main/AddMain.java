package com.main;

import com.services.Addition;

public class AddMain {

	public static void main(String[] args) {
		
		Addition addition =new Addition();
		
		// Assignment 3 print addition of 2 parameters given
		addition.addAndPrint(2,3);
		
		// Assignment 4 return addition of 2 parameters given
		int sum = addition.addAndReturn(10, 5);
		
		
		System.out.println(sum);
		addition=null;
	}

}
