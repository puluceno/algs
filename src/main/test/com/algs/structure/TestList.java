package com.algs.structure;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import com.algs.structure.impl.LinkedList;

public class TestList {

	private ListStructure<Integer> list;

	@Before
	public void init() {
		list = new LinkedList<>();
	}

	@Test
	public void addToHead() {
		list.addToHead(1);
		assertSame(1, list.getFirst());
		list.addToHead(10);
		assertSame(10, list.getFirst());
		assertSame(1, list.getLast());
	}

	@Test
	public void add() {
		list.add(1);
		assertSame(1, list.getFirst());
	}

	@Test
	public void add2() {
		list.add(1);
		list.add(2);
		list.add(3);
		assertSame(3, list.getSize());
		assertSame(1, list.getFirst());
		assertSame(3, list.getLast());
		assertSame(1, list.get(0));
		assertSame(2, list.get(1));
		assertSame(3, list.get(2));
	}

	@Test
	public void addToPosition() {
	}

	@Test
	public void remove() {
		list.add(1);
		list.add(2);
		list.add(3);
		assertSame(3, list.getSize());
		list.remove(1);
		assertSame(2, list.getSize());
		assertSame(2, list.getFirst());
	}
}