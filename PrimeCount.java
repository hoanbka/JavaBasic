package javabasic;

import java.util.Scanner;

public class PrimeCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the number n to find total primes <= n ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int total = 0;
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if ((i % j) == 0) {
					count++;
				}
			}
			if (count == 2) {
				total++;
				if (total % 10 == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println();
		System.out.println("total of primes is " + total);
	}

}
