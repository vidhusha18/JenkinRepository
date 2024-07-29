package com.vidhu.jenkinsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calculator;
	@BeforeEach
    public void setUp() {
        calculator = new Calculator(); // This method will run before each test method
    }
 @AfterEach
    public void tearDown() {
        calculator = null; // This method will run after each test method
        System.out.println("Test finished");
    }
	@Test
	void add() {
		int a=4;
		int b=5;
		assertEquals(9, calculator.add(a,b));
	}

}
