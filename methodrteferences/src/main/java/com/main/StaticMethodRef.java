package com.main;

import com.service.StaticClass;
import com.service.StaticInterface;

public class StaticMethodRef {

	public static void main(String[] args) {
		StaticInterface interface1 = StaticClass::staticFunc;
		String val = interface1.sayHello("Sleep");
		System.out.println(val);
	}

}
