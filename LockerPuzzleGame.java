package javaBasic;

public class LockerPuzzleGame {

	public static void main(String[] args) {

		boolean isStatus[] = new boolean[101];
		for (int i = 1; i <= 100; i++) {
			for (int j = i; j <= 100; j++) {
				if (isStatus[j] == true) {
					isStatus[j] = false;
				} else {
					isStatus[j] = true;
				}
			}
		}
		int count = 0;
		System.out.println("Open clocks are :");
		for (int i = 1; i <= 100; i++) {
			if (isStatus[i] == true) {
				count++;
				if (count % 10 == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println("Total open clocks is " + count);
	}

}
