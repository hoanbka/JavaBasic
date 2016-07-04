package javaBasic;

import java.util.Scanner;

public class GradesOfStudents {

	public static char assignGrades(int score, int bestScore) {

		if (score >= bestScore - 10) {
			return 'A';
		} else if (score >= bestScore - 20) {
			return 'B';
		} else if (score >= bestScore - 30) {
			return 'C';
		} else if (score >= bestScore - 40) {
			return 'D';
		} else {
			return 'F';
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of the students :");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String[] names = new String[number];
		int[] scores = new int[number];
		input.nextLine();
		System.out.println("Enter name and score of each student :");
		for (int i = 0; i < number; i++) {
			names[i] = input.nextLine();
			scores[i] = input.nextInt();
			input.nextLine();
		}
		// Find best score
		int bestScore = scores[0];
		for (int i = 0; i < number; i++) {
			if (scores[i] > bestScore) {
				bestScore = scores[i];
			}
		}
		// Display information
		for (int i = 0; i < number; i++) {
			System.out.println("Student " + names[i] + " , score is "
					+ scores[i] + " ,grade is "
					+ assignGrades(scores[i], bestScore));
		}

	}

}
