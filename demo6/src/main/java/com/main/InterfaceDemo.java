package com.main;
import com.model.InterfaceOne;
import com.model.InterfaceTwo;
import com.model.MyClassImpl;
public class InterfaceDemo {

	public static void main(String[] args) {
		InterfaceOne interface1 = new MyClassImpl();
		System.out.println(interface1.add(10, 20));
		//System.out.println(interface1.sub());
		InterfaceTwo interfaceTwo = new MyClassImpl();
		System.out.println(interfaceTwo.sub(10, 5));
		//System.out.println(interfaceTwo.add(10, 20));
		MyClassImpl interface3 = new MyClassImpl();
		System.out.println(interface3.add(3, 30));
		System.out.println(interface3.sub(3, 2));
	}

}
