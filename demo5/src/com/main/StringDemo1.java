package com.main;

public class StringDemo1 {

	public static void main(String[] args) {
		String str1 = "Happy";
		System.out.println("Length of string 1 is : " + str1.length());
		String str2 = "Good";
		System.out.println("Length of string 1 is : " + str2.length());
		String str3 = "Happy";
		System.out.println("Length of string 1 is : " + str3.length());
		if (str1 == str3) {
			System.out.println("They are same");
		} else {
			System.out.println("They are not");
		}
	}

}
