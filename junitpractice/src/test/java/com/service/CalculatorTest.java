package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import com.exceptions.DivisionByZeroException;

class CalculatorTest {

	@Test
	void test() {
		assertEquals(10, Calculator.add(1,9));
	}
	
	@Test
	void test2() {
		assertEquals(10, Calculator.sub(11,1));
	}
	
	@Test
	void test3() {
		assertEquals(10, Calculator.diff(10,20));
	}
	
	@Test
	void test4() {
		assertEquals(1, Calculator.mod(10,9));
	}
	@Test
	void test5() {
		try {
			assertEquals(0, Calculator.div(10,0));
		} catch (DivisionByZeroException e) {
			assertEquals("Gave 0 as a denominator",e.getMessage());
		}
	}

}
