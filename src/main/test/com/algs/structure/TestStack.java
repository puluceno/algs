package com.algs.structure;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.algs.structure.impl.Stack;

public class TestStack {

	private Structure stack;

	@Before
	public void init() {
		stack = new Stack(10);
	}

	@Test
	public void testPushAndPop() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		assertTrue(4 == stack.pop());
		assertTrue(3 == stack.pop());
		assertTrue(2 == stack.pop());
		assertTrue(1 == stack.pop());
		stack.push(10);
		assertTrue(10 == stack.pop());
		stack.push(20);
		assertTrue(20 == stack.pop());
	}

	@Test
	public void testEmpty() {
		stack.push(1);
		assertTrue(1 == stack.pop());
		assertTrue(null == stack.pop());
		assertTrue(null == stack.pop());
	}

	@Test(expected = StackOverflowError.class)
	public void testFull() {
		for (int i = 0; i <= stack.getSize() + 1; i++)
			stack.push(i);
	}

}
