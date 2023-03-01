package loopLab;

import java.util.List;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		// Question 1
		for (int i = 1; i <= 5; i++) {
			System.out.println("Java is fun!");
		}

		// Question 2
		// Program to find the sum of natural numbers 1 to 1000

		// My Version
		int sum = 0;

		for (int i = 0; i <= 1000; i++) {
			sum += i;
		}
		System.out.println(sum);

		// Their Version
		int sum2 = 0;
		int n = 1000;

		for (int i = 1; i <= n; ++i) {
			sum2 += i;
		}
		System.out.println("Sum2 = " + sum2);

		// Question 3
		// In this example, we are going to see whether a number is a palindrome.
		// A for loop is used in this case. A palindrome number, when reversed,
		// represents the same number.

//		String original, reverse = ""; // Objects of String class
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter a string/number to check if it is a palindrome");
//		original = in.nextLine();
//		int length = original.length();
//		for (int i = length - 1; i >= 0; i--)
//			reverse = reverse + original.charAt(i);
//		if (original.equals(reverse)) {
//			System.out.println("Entered string/number is a palindrome.");
//		} else {
//			System.out.println("Entered string/number isn't a palindrome.");
//		}

		// Question 4
		// Here the class name is PyramidExample. The main() is declared. After that,
		// the two loop control variables are declared.
		// One is the loop control variable “i,” and the other is the loop control
		// variable “j.” Then the “*” is printed in the loop control.
		// The new line is given so that the given format of the pyramid structure is
		// maintained. In this code, the program runs five times.
		// However, by increasing the value of the letter “i” we can make sure that the
		// pyramid is bigger.

		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
