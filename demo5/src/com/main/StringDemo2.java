package com.main;

public class StringDemo2 {

	public static void main(String[] args) {
		String str1 = new String("Happy");
		System.out.println("Length of string 1 is : " + str1.length());
		String str2 = new String("Good");
		System.out.println("Length of string 1 is : " + str2.length());
		String str3 = new String("Happy");
		System.out.println("Length of string 1 is : " + str3.length());
		
		
		if (str1==str3) { // checks memory address
			System.out.println("They are same");
		} else {
			System.out.println("They are not");
		}
		
		
		if (str1.equals(str3)) { //checks content
			System.out.println("They are same");
		} else {
			System.out.println("They are not");
		}
		
		char[] charArr = str1.toCharArray();
		String reversed  = new String("");
		for (int i = 0; i < charArr.length; i++) {
			reversed=charArr[i]+reversed;
		}
		System.out.println(reversed);
	}
}
