package javabasic;

import java.util.Scanner;

public class PrimeCheck2 {
	final static int NUMBER_OF_PRIMES_PER_LINE = 10;

	public static boolean isPrime(int number) {
		boolean isPrime = false;
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			isPrime = true;
		}

		return isPrime;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number, to find all primes <= number :");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int count = 0;
		for (int i = 1; i <= number; i++) {

			if (isPrime(i)) {
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");

				}
			}
		}

	}

}
