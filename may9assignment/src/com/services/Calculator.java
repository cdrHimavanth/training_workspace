package com.services;
//Assignment 5 calculator with add , sub , mul , div
public class Calculator {
	
	
	public void add(int num1,int num2) {
		System.out.println("The sum of two numbers is : "+(num1+num2));
	}
	public void sub(int num1,int num2) {
		System.out.println("The difference between two numbers is : "+(num1>num2?num1-num2:num2-num1));
	}
	public void mul(int num1,int num2) {
		System.out.println("The product of two numbers is : "+(num1*num2));
	}
	public void div(int num1,int num2) {
		System.out.println(num1+" divided by "+num2+" is : "+(num1/num2));
	}
	
	
	public int addAndReturn(int num1,int num2) {
		return num1+num2;
	}
	public int subAndReturn(int num1,int num2) {
		return num1>num2?num1-num2:num2-num1;
	}
	public int mulAndReturn(int num1,int num2) {
		return num1*num2;
	}
	public int divAndReturn(int num1,int num2) {
		return num1/num2;
	}
}
