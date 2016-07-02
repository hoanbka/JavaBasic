package javabasic;

import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {
		System.out.println("Enter string :");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		if (str.length() != 12) {
			System.out.println("No Valid ISBN");
		} else {
			long number = Long.valueOf(str).longValue();

			int[] digits = new int[13];
			int i = 11;
			while (number > 0) {
				digits[i] = (int) (number % 10l);// (int) (number % 10l)
				i--;
				number = number / 10;
			}

			digits[12] = 10 - (digits[0] + 3 * digits[1] + digits[2] + 3
					* digits[3] + digits[4] + 3 * digits[5] + digits[6] + 3
					* digits[7] + digits[8] + 3 * digits[9] + digits[10] + 3 * digits[11]) % 10;

			if (digits[12] == 10) {
				digits[12] = 0;
			}
			String temp = Integer.toString(digits[12]);
			System.out.println("ISBN is " + str.concat(temp));

		}
	}
}
