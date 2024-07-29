package com.vidhu.jenkinsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator Calculator;
	@Test
	void add() {
		int a=4;
		int b=5;
		assertEquals(9, Calculator.add(a,b));
	}

}
