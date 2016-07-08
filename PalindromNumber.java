package samsung;

public class PalindromNumber {

	public static int generatePalindromNumber(int number) {
		String s = "" + number;
		String s1 = s;
		s1 = new StringBuffer(s1).reverse().toString();
		return Integer.valueOf(s.concat(s1));
	}

	public static void main(String[] args) {
		int[] arr = new int[1000];
		int count = 0;
		for (int i = 100; i <= 999; i++) {
			arr[i] = generatePalindromNumber(i);
			count++;
			if (count % 10 == 0) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("Total number = " + count);

	}

}
