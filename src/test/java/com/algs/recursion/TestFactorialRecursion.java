package com.algs.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algs.recursion.impl.FactorialRecursion;

public class TestFactorialRecursion {

	private Recursion rec;

	@Before
	public void init() {
		rec = new FactorialRecursion();
	}

	@Test
	public void testFactorial() {
		assertEquals(1, rec.function(0));
		assertEquals(1, rec.function(1));
		assertEquals(2, rec.function(2));
		assertEquals(6, rec.function(3));
		assertEquals(24, rec.function(4));
		assertEquals(120, rec.function(5));
		assertEquals(720, rec.function(6));
		assertEquals(5040, rec.function(7));
		assertEquals(40320, rec.function(8));
		assertEquals(362880, rec.function(9));
		assertEquals(3628800, rec.function(10));
		assertEquals(479001600, rec.function(12));
	}
}
