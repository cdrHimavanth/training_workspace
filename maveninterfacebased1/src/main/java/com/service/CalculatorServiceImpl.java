package com.service;

import com.exceptions.ManualException1;

public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1-num2;
	}

	@Override
	public int mul(int num1, int num2) {
		return num1*num2;
	}
	
	@Override
	public int div(int num1,int num2) throws ManualException1 {
		int result =0;
		if(num2==0) {
			throw new ManualException1("Division by 0");
		}else {
			result=num1/num2;
			
		}
		return result;
	}

}
