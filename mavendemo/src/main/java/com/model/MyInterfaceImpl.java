package com.model;

public class MyInterfaceImpl implements SciInterface {

	@Override
	public int mod(int num1, int num2) {

		return num1 % num2;
	}

	@Override
	public int add(int num1, int num2) {

		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {

		return num1 - num2;
	}

	@Override
	public int mul(int num1, int num2) {

		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {

		return num1 / num2;
	}

	public double power(int num1, int num2) {
		int powered = 1;
		for (int j = 1; j <= num1; j++) {
			powered = powered * j;
		}
		return powered;
	}

	/*
	 * public double root(int num1,int num2) { int rootLow=0; int rootHigh=0;
	 * 
	 * for(int i=1;i<num2;i++) { int powered =1; for(int j=1;j<=num1;j++) {
	 * powered=powered*i; } if(powered<num2) { rootLow=i; }else if(powered >num2) {
	 * rootHigh=i; break; }else { return i; } }
	 * 
	 * 
	 * return ((double)rootLow+(double)rootHigh)/2.6; }
	 */
	public float root(int a, int b) {
		double i = 0, precision = 0.001;

		for (int i1 = 1; (Math.pow(i1, b)) <= a; ++i1) {
			System.out.println("i1: " + i1);
			if(Math.pow(i1, b)>a){
				for (--i; (Math.pow(i, b)) < a; i += precision) {
					System.out.println(i);
				}
			}else if(Math.pow(i1, b)==a) {
				return i1;
			}
			
		}
		return (float) i;

	}
	public float cubrt(int a, int b,double precision) {
		double i = 0;
		precision=1/precision;

		for (int i1 = 1; (Math.pow(i1, b)) <= a; ++i1) {
			System.out.println("i1: " + i1);
			for (--i; (Math.pow(i, b)) < a; i += precision) {
				System.out.println(i);
			}
		}
		return (float) i;

	}

}
