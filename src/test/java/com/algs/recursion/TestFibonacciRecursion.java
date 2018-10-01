package com.algs.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algs.recursion.impl.FibonacciRecursion;

public class TestFibonacciRecursion {

	private Recursion rec;

	@Before
	public void init() {
		rec = new FibonacciRecursion();
	}

	@Test
	public void getNthNumber() {
		assertEquals(0, rec.function(0));
		assertEquals(1, rec.function(1));
		assertEquals(1, rec.function(2));
		assertEquals(2, rec.function(3));
		assertEquals(3, rec.function(4));
		assertEquals(5, rec.function(5));
		assertEquals(8, rec.function(6));
		assertEquals(13, rec.function(7));
		assertEquals(21, rec.function(8));
		assertEquals(34, rec.function(9));
		assertEquals(55, rec.function(10));
		assertEquals(102334155, rec.function(40));
	}
}
