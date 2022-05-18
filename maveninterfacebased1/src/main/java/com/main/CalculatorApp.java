package com.main;

import com.exceptions.ManualException1;
import com.service.CalculatorService;
import com.service.CalculatorServiceImpl;

public class CalculatorApp {

	public static void main(String[] args) {
		CalculatorService calculatorService = new CalculatorServiceImpl();
		int a = 10;
		int b =0;
		int ans=0;
		try {
			ans = calculatorService.div(a, b);
		} catch (ManualException1 e) {
			System.err.println("There is an exception "+e.getMessage());
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
		System.out.println(ans);
	}

}
