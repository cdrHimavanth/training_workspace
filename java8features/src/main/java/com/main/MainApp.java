package com.main;

import com.service.InterfaceOne;
import com.service.InterfaceOneImpl1;
import com.service.InterfaceOneImpl2;

public class MainApp {

	public static void main(String[] args) {
		InterfaceOne interfaceOne1 = new InterfaceOneImpl1(); 
		interfaceOne1.functionOne();
		
		InterfaceOne interfaceOne2 = new InterfaceOneImpl2(); 
		interfaceOne2.functionOne();
	}

}
