package com.main;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Happy");
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		System.out.println(buffer);
		buffer.append(" Time");
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		System.out.println(buffer);
		buffer.append(" Time 1234567890 1234567890");
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		System.out.println(buffer);
	}

}
