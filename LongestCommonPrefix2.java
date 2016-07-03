package javabasic;

import java.util.Scanner;

public class LongestCommonPrefix2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Input string1 :");
		String str1 = input.nextLine();
		System.out.println("Input string2 :");
		String str2 = input.nextLine();

		boolean check = false;

		if (str1.length() < str2.length()) {
			String temp = str1;
			str1 = str2;
			str2 = temp;
		}

		for (int i = str2.length() - 1; i >= 0; i--) {
			String temp = str2.substring(0, i);
			if (temp == str1.substring(0)) {
				System.out.println("Longest Common Prefix of two Strings is "
						+ str2.substring(0, i));
				check = true;
				break;
			}
		}

		if (check == false) {
			System.out.println("No common prefix");
		}

	}

}
