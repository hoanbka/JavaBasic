package javabasic;

import java.util.Scanner;

public class OccurenceNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[101];
		System.out.println("Enter the number from 1 to 100 :");
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			int data = input.nextInt();
			arr[data] = arr[data] + data;
			if (data == 0) {
				break;
			}
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				if (arr[i] / i > 1) {
					System.out.println(i+ " occurs " + (arr[i] / i)
							+ " times");
				} else {
					System.out.println(i + " occurs " + (arr[i] / i)
							+ " time");
				}
			}
		}

	}

}
