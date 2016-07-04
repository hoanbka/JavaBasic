package javaBasic;

import java.util.Scanner;

public class SortOfStudents {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Enter the number of students :");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		String[] names = new String[number];
		int[] scores = new int[number];
		
		input.nextLine();
		System.out.println("Enter data of each student :");
		for (int i = 0; i <= number - 1; i++) {
			names[i] = input.nextLine();
			scores[i] = input.nextInt();
			input.nextLine();
		}


		for (int i = 0; i < number - 1; i++) {
			for (int j = i + 1; j < number; j++) {
				if (scores[i] < scores[j]) {
					int temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;

					String temp2 = names[i];
					names[i] = names[j];
					names[j] = temp2;

				}
			}
		}
		for (int i = 0; i < number; i++) {
			System.out.println(names[i] + "      , score : " + scores[i]);
		}
	}

}
