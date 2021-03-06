package com.algs.bitwise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestBitwiseOperations {

	private byte a;
	private byte b;
	private byte c;
	private byte d;

	@Before
	public void init() {
		a = 2;
		b = 3;
		c = 5;
		d = 6;
	}

	@Test
	public void shiftRight() {
		assertEquals(1, a >> 1);
		assertEquals(1, b >> 1);
		assertEquals(2, c >> 1);
		assertEquals(3, d >> 1);
		assertEquals(0, a >> 2);
		assertEquals(0, b >> 2);
		assertEquals(1, c >> 2);
		assertEquals(1, d >> 2);
	}

	@Test
	public void shiftLeft() {
		assertEquals(4, a << 1);
		assertEquals(6, b << 1);
		assertEquals(10, c << 1);
		assertEquals(12, d << 1);
		assertEquals(8, a << 2);
		assertEquals(12, b << 2);
		assertEquals(20, c << 2);
		assertEquals(24, d << 2);
	}

	@Test
	public void xorSwap() {
		byte valueA = a;
		byte valueB = b;

		a ^= b;
		b ^= a;
		a ^= b;

		assertEquals(b, valueA);
		assertEquals(a, valueB);
	}
}
