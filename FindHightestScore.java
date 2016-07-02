package javabasic;

import java.util.Scanner;

public class FindHightestScore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the number of students :");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int[] scores = new int[number];
		int maxScore = scores[0];
		String[] names = new String[number];
		System.out.println("Enter names and scores :");
		for (int i = 0; i <= number - 1; i++) {
			names[i] = input.next();
			scores[i] = input.nextInt();
			if (maxScore < scores[i]) {
				maxScore = scores[i];
			}
		}

		System.out.println("Display name and score of each student :");
		for (int i = 0; i <= number - 1; i++) {
			System.out.println("No " + i + " " + names[i] + ", score :"
					+ scores[i]);
		}
		System.out.println("Show the result1 :");
		for (int i = 0; i <= number - 1; i++) {
			if (scores[i] == maxScore) {
				System.out.println("Highest score = " + maxScore
						+ " of the student " + names[i]);
			}

		}
		int []newScores= new int[number];
		System.arraycopy(scores, 0, newScores, 0, number);
		// Sort the array of scores
		for (int i = 0; i <= number - 2; i++) {
			for (int j = i + 1; j <= number - 1; j++) {
				if (scores[i] < scores[j]) {
					int temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;

				}
			}
		}
		for (int i = 0; i <= number - 1; i++) {
			System.out.print(scores[i] + " ");
		}

		// Find 2nd high score
		int max2nd = scores[0];
		for (int i = 0; i <= number - 1; i++) {
			if (scores[i] < maxScore) {
				max2nd = scores[i];
				break;
			}
		}
		System.out.println();
		System.out.println("Show the result2 :");
		for (int i = 0; i <= number - 1; i++) {
			if (newScores[i] == max2nd) {
				System.out.println("2nd high score = " + max2nd
						+ " of the student " + names[i]);
			}

		}

	}

}
