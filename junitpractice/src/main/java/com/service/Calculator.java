package com.service;

import com.exceptions.DivisionByZeroException;

public class Calculator {
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int diff(int a,int b) {
		if(a>b) {
			return a-b;
		}else {
		return b-a;
		}
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int mod(int a,int b) {
		return a%b;
	}
	public static int div(int a,int b) throws DivisionByZeroException{
		int res = 0 ;
		if(b!=0) {
			res=a/b;
		}else {
			throw new DivisionByZeroException("Gave 0 as a denominator");
		}
		return res;
	}
}
