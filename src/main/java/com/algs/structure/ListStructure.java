package com.algs.structure;

public interface ListStructure<T> {

	/**
	 * Adds an element to the beginning of the list.
	 *
	 * @param element
	 */
	public void addToHead(T element);

	/**
	 * Adds an element to the end of the list.
	 *
	 * @param element
	 */
	public void add(T element);

	/**
	 * Adds an element to a given position in the list.
	 *
	 * @param element
	 */
	public void addToPosition(T element, int position);

	/**
	 * Removes an element from the list.
	 *
	 * @param element
	 */
	public void remove(T element);

	/**
	 * Retrieves the first element from the list.
	 *
	 * @return
	 */
	public T getFirst();

	/**
	 * Retrives the last element from the list.
	 *
	 * @return
	 */
	public T getLast();

	/**
	 * Retrieves an element from the given position in the list.
	 *
	 * @param index
	 * @return
	 */
	public T get(int index);

	/**
	 * Returns the size of the list.
	 *
	 * @return
	 */
	public int getSize();

	class Node<T> {
		Node<T> nextNode;
		T value;

		public Node(T value) {
			this.value = value;
		}

		public Node(Node<T> nextNode, T value) {
			this.nextNode = nextNode;
			this.value = value;
		}

		public Node<T> getNext() {
			return nextNode;
		}

		public void setNext(Node<T> node) {
			this.nextNode = node;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

	}
}
