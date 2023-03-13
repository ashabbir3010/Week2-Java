package Loops_Arrays;

public class Loops {
	public static void main(String[] args) {
		for (int i = 100; i <= 200; i++) {
			System.out.println("A:" + i);
		}

		for (int i = 100; i <= 200; i++) {

			if (i % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}

		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 9; j++)
				System.out.println("i: " + i);
		}

		for (int i = 0; i <= 10; i++) {
			if (i == 10) {

				System.out.println("10, 10 times: " + i);
			} else {
				System.out.println("output: " + i);
			}
		}

	}

}
