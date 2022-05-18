package com.service;

import com.exceptions.ManualException1;

public interface CalculatorService {
	public int add(int num1,int num2);
	public int sub(int num1,int num2);
	public int mul(int num1,int num2);
	public int div(int num1,int num2) throws ManualException1;
}
