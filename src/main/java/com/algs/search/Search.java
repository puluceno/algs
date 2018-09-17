package com.algs.search;

public interface Search {

	/**
	 * Finds the position where the element is in the array.
	 * 
	 * @return The position of the element in the given array. Returns -1 in case
	 *         the searched element is not in found in the array.
	 */
	public int find(Integer[] array, int k);

	/**
	 * Finds the position where the element is in the array.
	 * 
	 * @return The position of the element in the given array. Returns -1 in case
	 *         the searched element is not in found in the array.
	 */
	public int find(Integer[] array, int k, int low, int high);
}
