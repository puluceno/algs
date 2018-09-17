package com.algs.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.algs.data.TestData;
import com.algs.search.impl.BinarySearch;

public class TestBinarySearch {

	private Search bs;
	private Integer left;
	private Integer right;
	private Integer middle;
	private Integer none;

	@Before
	public void init() {
		bs = new BinarySearch();
		left = 1;
		right = 30;
		middle = 23;
		none = 45;
	}

	@Test
	public void findLeftElement() {
		assertEquals(Collections.binarySearch(Arrays.asList(TestData.orderedArray), left),
				bs.find(TestData.orderedArray, left));
	}

	@Ignore
	@Test
	public void findRightElement() {
		assertEquals(Collections.binarySearch(Arrays.asList(TestData.orderedArray), right),
				bs.find(TestData.orderedArray, right));
	}

	@Ignore
	@Test
	public void findMiddleElement() {
		assertEquals(Collections.binarySearch(Arrays.asList(TestData.orderedArray), middle),
				bs.find(TestData.orderedArray, middle));
	}

	@Test
	public void findNoneElement() {
		assertEquals(Collections.binarySearch(Arrays.asList(TestData.orderedArray), none),
				-TestData.orderedArray.length + bs.find(TestData.orderedArray, none));
	}

	@Test
	public void findLeftElement2() {
		assertEquals(Collections.binarySearch(Arrays.asList(TestData.orderedArray), left),
				bs.find(TestData.orderedArray, left, 0, TestData.orderedArray.length - 1));
	}

	@Test
	public void findRightElement2() {
		assertEquals(Collections.binarySearch(Arrays.asList(TestData.orderedArray), right),
				bs.find(TestData.orderedArray, right, 0, TestData.orderedArray.length - 1));
	}

	@Test
	public void findMiddleElement2() {
		assertEquals(Collections.binarySearch(Arrays.asList(TestData.orderedArray), middle),
				bs.find(TestData.orderedArray, middle, 0, TestData.orderedArray.length - 1));
	}

	@Test
	public void findNoneElement2() {
		assertEquals(Collections.binarySearch(Arrays.asList(TestData.orderedArray), none), -TestData.orderedArray.length
				+ bs.find(TestData.orderedArray, none, 0, TestData.orderedArray.length - 1));
	}

}
