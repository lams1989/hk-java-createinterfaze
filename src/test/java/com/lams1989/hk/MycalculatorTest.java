package com.lams1989.hk;

import junit.framework.TestCase;

public class MycalculatorTest extends TestCase {
	
	
	public void testMycalculator() {
		MyCalculator ap = new MyCalculator();
		int value = 6;

		assertEquals(12, ap.divisor_sum(value));
		
		assertEquals(18, ap.divisor_sum(10));
	}
	
}
