package com.algs.recursion.impl;

import com.algs.recursion.Recursion;

public class FibonacciRecursion implements Recursion {

	@Override
	public int function(int nthNumber) {
		if (nthNumber <= 1)
			return nthNumber;
		return function(nthNumber - 1) + function(nthNumber - 2);
	}

}
