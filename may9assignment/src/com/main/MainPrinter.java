package com.main;

import com.services.Printer;

public class MainPrinter {

	public static void main(String[] args) {
		
		Printer printer = new Printer();
		
		//Assignment 1
		printer.print();
		
		//Assignment 2
		printer.print("Himavanth");
		
		printer=null;
	}

}
