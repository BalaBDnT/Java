package com.bdnt;

public class StudentB extends Marks {
	private int i;
	private int j;
	private int k;
	private int l;

	public StudentB(int i, int j, int k, int l) {
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
	}

	@Override
	public void getPercentage() {
		double result2 = ((double) (i + j + k + l) / 400) * 100;

		System.out.println(result2);

	}

}
