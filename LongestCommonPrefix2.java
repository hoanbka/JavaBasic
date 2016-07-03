package javabasic;

import java.util.Scanner;

public class LongestCommonPrefix2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Input string1 :");
		String str1 = input.nextLine();
		System.out.println("Input string2 :");
		String str2 = input.nextLine();

		if (str1.length() < str2.length()) {
			String temp = str1;
			str1 = str2;
			str2 = temp;
		}
		String result = null;
		for (int i = 1; i <= str2.length(); i++) {
			String temp = str2.substring(0, i);
			if (str1.contains(temp)) {
				result = temp;
			} else {
				break;
			}
		}
		if (result == null) {
			System.out.println("No common prefix");
		} else {
			System.out.println(result);
		}

	}

}
