package com.bdnt;

public class StudentA extends Marks {
	private int a;
	private int b;
	private int c;

	public StudentA(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void getPercentage() {
		double result1 = ((double) (a + b + c) / 300) * 100;

		System.out.println(result1);

	}

}
