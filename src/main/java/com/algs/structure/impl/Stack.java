package com.algs.structure.impl;

import com.algs.structure.Structure;

public class Stack implements Structure {
	private int[] stack;
	private int pointer;
	private int size;

	public Stack(int size) {
		this.stack = new int[size];
		this.pointer = 0;
		this.size = size;
	}

	@Override
	public void push(int element) {
		if (isFull())
			throw new StackOverflowError("Stack is full");
		else
			this.stack[pointer++] = element;
	}

	@Override
	public Integer pop() {
		return isEmpty() ? null : this.stack[--this.pointer];
	}

	@Override
	public boolean isEmpty() {
		return pointer == 0;
	}

	@Override
	public boolean isFull() {
		return this.pointer == this.size;
	}

	@Override
	public int getSize() {
		return size;
	}

}
