package com;

import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

	Calculator calculator;

	@Before
	public void setUp() {
		System.out.println("@Before");
		calculator = new Calculator();
	}

	@Ignore
	@Test
	public void add1() {
		int actual = calculator.add(12, 13);
		int expected = 25;
		assertEquals(expected, actual);
	}

	@Test
	public void add2() {
		int actual = calculator.add(12, 12);
		int expected = 25;
		assertNotEquals(expected, actual);
	}

}
