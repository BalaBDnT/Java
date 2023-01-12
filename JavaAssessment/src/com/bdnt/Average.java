package com.bdnt;

import java.util.Scanner;

public class Average {
	public void Average() {
		int number = 0;

		int sum = 0;
		int product = 1;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number or -1 to quit");

		while (number != -1) {

			number = sc.nextInt();

			if (number != -1) {

				sum = sum + number;

				count++;
			}
		}

		System.out.println("\nAverage is: " + ((float) sum / count));

	}

	public static void main(String[] args) {
		Average obj = new Average();
		obj.Average();
	}

}
