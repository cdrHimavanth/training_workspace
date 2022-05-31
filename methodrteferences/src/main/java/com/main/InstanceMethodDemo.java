package com.main;

import com.service.MyInterface;

public class InstanceMethodDemo {
	
	public void myFunc() {
		System.out.println("Welcome to method reference : ");
	}

	public static void main(String[] args) {
		
		MyInterface myInterface = ()->{System.out.println("Welcome to lambda : ");};
		myInterface.display();
		
		//method ref to instance method
		
		InstanceMethodDemo demo = new InstanceMethodDemo();
		MyInterface myInterface2 = demo::myFunc;
		myInterface2.display();//in doubt aft work........................
		System.err.println("Comeback here in aft");
	}

}
