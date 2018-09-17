package com.algs.search.impl;

import java.util.Arrays;

import com.algs.search.Search;

public class BinarySearch implements Search {

	@Override
	public int find(Integer[] array, int k) {
		int mid = array.length / 2;
		if (array[mid] == k)
			return mid;
		if (array.length == 1)
			return -1;
		else if (array[mid] > k)
			return find(Arrays.copyOfRange(array, 0, mid), k);
		else
			return find(Arrays.copyOfRange(array, mid, array.length), k);
	}

	public int find(Integer[] array, int k, int low, int high) {
		int mid = (low + (high - low) / 2);
		if (array[mid] == k)
			return mid;
		if (array.length - 1 == mid)
			return -1;
		else if (array[mid] > k)
			return find(array, k, low, mid - 1);
		else
			return find(array, k, mid + 1, high);
	}

}
