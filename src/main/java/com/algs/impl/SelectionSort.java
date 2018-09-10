package com.algs.impl;

import com.algs.Sort;

/**
 * Find the smallest element in the list and put it at the beginning of the
 * list.
 * 
 * @author pulu
 *
 */
public class SelectionSort implements Sort {

	public static void main(String[] args) {
		Sort s = new SelectionSort();
		int[] array = new int[] { 3, 2, 1 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if (i == array.length - 1)
				System.out.println("");
		}
		s.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	@Override
	public int[] sort(int[] array) {
		int min = -1;

		for (int j = 0; j < array.length; j++) {

			for (int i = 0; i < array.length - 1; i++) {

				if (array[i + 1] < array[i]) {
					min = array[i + 1];
					array[i + 1] = array[i];
					array[i] = min;
				}
			}
		}
		System.out.println("Mínimo: " + min);
		return array;
	}

}
