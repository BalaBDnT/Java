package com.bdnt;

import java.util.Scanner;

public class MyCalculator implements AdvancedArithmetic {
	 int n;

	public int divisor_sum(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {

				sum = sum + i;
			}
		}
		System.out.println("The Sum of " +" " +n+" " + "divisors is:" + sum);
		return sum;
	}

}
