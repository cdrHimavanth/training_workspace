package com.main;

//import com.model.MyInterface;
import com.model.MyInterfaceImpl;
//import com.model.SciInterface;

public class MainApp {

	public static void main(String[] args) {
		// interfaceName var = new InterfaceImpl();
		// MyInterface interface1 = new MyInterfaceImpl();
		MyInterfaceImpl interface1 = new MyInterfaceImpl();
		/*
		 * System.out.println("Add  : "+interface1.add(10, 4));
		 * System.out.println("Sub  : "+interface1.sub(10, 4));
		 * System.out.println("Mul  : "+interface1.mul(10, 4));
		 * System.out.println("Div  : "+interface1.div(10, 4));
		 * System.out.println("Mod  : "+interface1.mod(10, 4));
		 */
		System.out.println("Root : " + interface1.root(2, 10));

	}

}
