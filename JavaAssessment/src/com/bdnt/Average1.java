package com.bdnt;

import java.util.Scanner;

public class Average1 {
	public void average() {
		int n = 0;
		double sum = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER N OR -1");
		while (n != -1) {
			n = sc.nextInt();
			if (n != -1) {
				sum = sum + n;// 1 1+2 1+2+3 1+2+3+4
				count = count + 1;// 1 1+1 1+1+1 1+1+1+1

			}

		}

		System.out.println((double) (sum / count));
	}

	public static void main(String[] args) {
		Average1 obj = new Average1();
		obj.average();

	}
}
