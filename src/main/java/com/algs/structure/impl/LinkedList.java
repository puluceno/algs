package com.algs.structure.impl;

import java.util.Objects;

import com.algs.structure.ListStructure;

public class LinkedList<T> implements ListStructure<T> {

	private int size;
	private Node<T> head;

	@Override
	public void addToHead(T element) {
		if (Objects.nonNull(getFirst()))
			head = new Node<>(head, element);
		else
			head = new Node<>(element);

		size++;
	}

	@Override
	public void add(T element) {
		if (Objects.isNull(head)) {
			addToHead(element);
			return;
		} else {
			Node<T> tmp = head;
			while (Objects.nonNull(tmp.getNext()))
				tmp = tmp.getNext();
			tmp.setNext(new Node<>(element));
		}
		size++;
	}

	@Override
	public void addToPosition(T element, int position) {
		if (position > getSize())
			throw new ArrayIndexOutOfBoundsException(
					"Index " + position + " is out of range for array size " + getSize() + " .");

		Node<T> previous = head;
		if (position == 0) {
			head = new Node<>(head, element);
			size++;
			return;
		}

		int aux = 1;
		while (aux < position) {
			previous = previous.getNext();
			aux++;
		}
		previous.setNext(new Node<>(previous.getNext(), element));
		size++;
	}

	@Override
	public void remove(T element) {
		if (Objects.isNull(head))
			throw new ArrayStoreException("Cannot remove from an empty list.");

		Node<T> current = head;
		if (current.getValue().equals(element)) {
			head = current.getNext();
			size--;
			return;
		}

		Node<T> previous = null;
		while (Objects.nonNull(current.getNext()) && !current.getNext().getValue().equals(element)) {
			previous = current;
			current = current.getNext();
		}
		if (Objects.isNull(previous))
			throw new ArrayStoreException("Did not find the given element in the list.");

		previous.setNext(current.getNext());
		size--;
	}

	@Override
	public T getFirst() {
		return Objects.nonNull(head) ? head.getValue() : null;
	}

	@Override
	public T getLast() {
		Node<T> tmp = head;
		while (Objects.nonNull(tmp.getNext()))
			tmp = tmp.getNext();

		return tmp.getValue();
	}

	@Override
	public T get(int index) {
		if (index > getSize())
			throw new ArrayIndexOutOfBoundsException(
					"Index " + index + " is out of range for array size " + getSize() + " .");
		if (Objects.isNull(head))
			throw new ArrayStoreException("Cannot get from an empty list.");

		Node<T> tmp = head;
		int aux = 0;
		if (aux == index)
			return head.getValue();

		while (Objects.nonNull(tmp.getNext()) && aux < index) {
			tmp = tmp.getNext();
			aux++;
		}
		return tmp.getValue();
	}

	@Override
	public int getSize() {
		return size;
	}

}
