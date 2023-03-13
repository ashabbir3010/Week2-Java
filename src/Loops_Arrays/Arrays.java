package Loops_Arrays;

public class Arrays {
	public static void main(String[] args) {
		int[] whole = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i : whole) {
			System.out.println("Number: " + i);
		}

		for (int i = 0; i < whole.length; i++) {
			whole[i] = i * 10;
			System.out.println("Iteration = " + i + " New number = " + (i * 10));

		}

		int num = 123, sum = 0, remainder;
		while (num > 0) {
			remainder = num % 10;
			sum = sum + remainder;
			num = num / 10;
		}

		System.out.println("sum of the digits: ");

	}
}
