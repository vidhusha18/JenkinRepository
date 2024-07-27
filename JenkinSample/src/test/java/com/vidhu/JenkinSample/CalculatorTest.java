package com.vidhu.JenkinSample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void add() {
		int a=4;
		int b=5;
		assertEquals(9, Calculator.add(a,b));
	}

}
