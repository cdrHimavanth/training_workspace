package com.main;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		System.out.println(builder.length());
		System.out.println(builder.capacity());
		
		builder.append("Happy");
		System.out.println(builder.length());
		System.out.println(builder.capacity());

	}

}
