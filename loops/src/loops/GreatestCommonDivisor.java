package loops;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a positive number");

		int n1 = scanner.nextInt();

		System.out.println("Enter a second positive number");
		
		scanner.close();

		int n2 = scanner.nextInt();
		int number = 0;
		for (int k = 2; k < n1 && k < n2; k++) {
			if (n1 % k == 0 && n2 % k == 0) {
				number = k;
			}
		}
		System.out.println(number);
	}

}
