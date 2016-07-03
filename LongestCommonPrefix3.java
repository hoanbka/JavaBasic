package javabasic;

import java.util.Scanner;

public class LongestCommonPrefix3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input String1 :");
		String str1 = input.nextLine();
		System.out.println("Input String2 :");
		String str2 = input.nextLine();

		if (str1.length() < str2.length()) {
			String temp = str1;
			str1 = str2;
			str2 = temp;
		}
		String result = null;

		for (int i = str2.length() ; i >= 1; i--) {
			String temp = str2.substring(0, i);
			if (str1.contains(temp)) {
				result = temp;
				break;
			}
		}

		if (result != null) {
			System.out.println(result);
		} else {
			System.out.println("No common prefix");
		}

	}

}
