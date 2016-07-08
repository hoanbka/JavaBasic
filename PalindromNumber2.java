package samsung;

public class PalindromNumber2 {
	public static boolean check(int i) {
		boolean check = false;

		if ((i / 100000 % 10 == i / 1 % 10) && (i / 10000 % 10 == i / 10 % 10)
				&& (i / 1000 % 10 == i / 100 % 10))

			check = true;

		return check;
	}

	public static void main(String[] args) {
		int count = 0;

		for (int i = 100000; i <= 999999; i++) {
			if (check(i)) {
				count++;

				if (count % 10 == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println("Total number is " + count);

	}

}
