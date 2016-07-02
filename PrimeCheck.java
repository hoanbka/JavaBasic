package javabasic;

public class PrimeCheck {
	final static int NUMBER_OF_PER_LINE = 10;
	final static int NUMBER_OF_PRIMES = 50;

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
		int number = 2;
		int count = 0;
		
		// Find the first 50 primes
		while (count < NUMBER_OF_PRIMES) {
			if (isPrime(number)) {
				count++;

				if (count % NUMBER_OF_PER_LINE == 0) {
					System.out.println(number);
				} else {
					System.out.print(number + " ");
				}
			}
			number++;
		}
	}
}
