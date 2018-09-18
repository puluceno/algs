package com.algs.structure.impl;

import com.algs.structure.Structure;

public class Stack implements Structure {
	private Integer[] stack;
	private int pointer;
	private int size;

	public Stack(int size) {
		this.stack = new Integer[size];
		this.pointer = 0;
		this.size = size;
	}

	@Override
	public void push(Integer element) {
		if (isFull())
			throw new StackOverflowError("Stack is full");
		else {
			this.stack[pointer] = element;
			this.pointer++;
		}
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
