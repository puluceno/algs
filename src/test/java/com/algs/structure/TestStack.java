package com.algs.structure;

import static org.junit.Assert.assertEquals;

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
		assertEquals(4, stack.pop().intValue());
		assertEquals(3, stack.pop().intValue());
		assertEquals(2, stack.pop().intValue());
		assertEquals(1, stack.pop().intValue());
		stack.push(10);
		assertEquals(10, stack.pop().intValue());
		stack.push(20);
		assertEquals(20, stack.pop().intValue());
	}

	@Test
	public void testEmpty() {
		stack.push(1);
		assertEquals(1, stack.pop().intValue());
		assertEquals(null, stack.pop());
		assertEquals(null, stack.pop());
	}

	@Test(expected = StackOverflowError.class)
	public void testFull() {
		for (int i = 0; i <= stack.getSize(); i++)
			stack.push(i);
	}

}
