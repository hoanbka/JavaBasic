package javaBasic;

import java.util.Scanner;

public class PatternRecognition {
	public static boolean isConsecutive(int[] values) {
		boolean check = false;
		for (int i = 0; i < values.length - 3; i++) {
			if ((values[i] == values[i + 1])
					&& (values[i + 1] == values[i + 2])
					&& (values[i + 2] == values[i + 3])) {
				check = true;
				break;
			}
		}

		return check;
	}

	public static void main(String[] args) {
		System.out.println("Enter the length of the array with length >=4:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int values[] = new int[number];
		if (number < 3) {
			System.out.println("The list has NO consecutive fours haha");
		} else {
			System.out.println("Enter each number to the array :");
			for (int i = 0; i < values.length; i++) {
				values[i] = input.nextInt();
			}
			boolean result = isConsecutive(values);
			if (result) {
				System.out.println("The list has consecutive fours");
			} else {
				System.out.println("The list has NO consecutive fours");
			}
		}
	}

}
