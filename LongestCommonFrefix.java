package javabasic;

import java.util.Scanner;

public class LongestCommonFrefix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first String :");
		String str1 = input.nextLine();
		System.out.println("Enter the second String :");
		String str2 = input.nextLine();
		boolean check = false;
		if (str1.length() >= str2.length()) {
			for (int i = str2.length(); i >= 1; i--) {
				String temp = str2.substring(0, i);
				if (str1.contains(temp)) {
					System.out
							.println("Longest Common Prefix of two Strings is "
									+ str2.substring(0, i));
					check = true;
					break;
				}
			}
		} else {
			for (int i = str1.length(); i >= 1; i--) {
				String temp = str1.substring(0, i);
				if (str2.contains(temp)) {
					System.out
							.println("Longest Common Prefix of two Strings is "
									+ str1.substring(0, i));
					check = true;
					break;
				}
			}
		}
		if (check == false) {
			System.out.println("There is no common prefix btw stwo strings");
		}
	}
}
