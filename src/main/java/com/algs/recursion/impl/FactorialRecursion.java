package com.algs.recursion.impl;

import com.algs.recursion.Recursion;

public class FactorialRecursion implements Recursion {

	@Override
	public int function(int nthNumber) {
		if (nthNumber <= 1)
			return 1;
		return nthNumber * function(nthNumber - 1);
	}

}
