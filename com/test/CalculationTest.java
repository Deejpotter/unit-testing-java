package com.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class CalculationTest {

	@Test
	final void testAdd() {
		Calculation testObject = new Calculation();
		int result = testObject.add(1, 2);
		assertEquals(3, result);
		
	}

	@Test
	final void testSub() {
		Calculation testObject = new Calculation();
		int result = testObject.sub(2, 1);
		assertEquals(1, result);
	}

}
