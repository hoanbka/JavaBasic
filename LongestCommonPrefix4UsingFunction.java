package javabasic;

import java.util.Scanner;

public class LongestCommonPrefix4UsingFunction {
	public static String findLongestCommonPrefix(String str1, String str2) {
		String result = null;
		for (int i = str2.length(); i >= 1; i--) {
			String temp = str2.substring(0, i);
			if (str1.contains(temp)) {
				result = temp;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first String :");
		String str1 = input.nextLine();
		System.out.println("Enter the second String :");
		String str2 = input.nextLine();

		if (str1.length() < str2.length()) {
			String temp = str1;
			str1 = str2;
			str2 = temp;
		}
		
		String result = findLongestCommonPrefix(str1, str2);
		if (result != null) {
			System.out.println("Longest common prefix of two strings is : "
					+ result);
		} else {
			System.out.println("No common prefix");
		}

	}

}
