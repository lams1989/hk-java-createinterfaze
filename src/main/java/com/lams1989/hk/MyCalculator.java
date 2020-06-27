package com.lams1989.hk;

public class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisor_sum(int n) {
		int sum = 0;
		int divisores = n;
		for (int i = 1; i <= divisores; i++) {
			if (n % i == 0) {
				sum += i ;
			}
		}
		return sum;
	}

}
