package com.vidhu.jenkinsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.vidhu.jenkinsample.Calculator;

class CalculatorTest {

	@Test
	void add() {
		int a=4;
		int b=5;
		assertEquals(9, Calculator.add(a,b));
	}

}
