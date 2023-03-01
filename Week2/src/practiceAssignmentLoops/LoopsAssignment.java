package practiceAssignmentLoops;

import java.util.Scanner;

public class LoopsAssignment {

	public static void main(String[] args) {

		// Question 1
		// Write a program that uses nested for loops to print a multiplication table.

		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 12; j++) {
				System.out.print("\t" + i * j);
			}
			System.out.println();
		}

		// Question 2
		// Write a program that prompts the user to enter two positive integers, and
		// find their greatest common divisor (GCD).

//		Scanner scanner = new Scanner(System.in); //create new scanner object
//		System.out.println("Enter two positive integers, n1 and n2:"); //ask for user input
//		
//		int n1 = scanner.nextInt(); //read user input
//		int n2 = scanner.nextInt();
//		
//		static int gcd(int n1, int n2) {
//			while(n1!=0 && n2!=0) 
//		  {
//		     int n3 = n2;
//		     n2 = n1%n2;
//		     n1 = n3;
//		  }
//		  return n1+n2; // either one is 0, so return the non-zero value		
//		}

		// Question 3
		// Suppose the tuition for a university is 10,000 for the current year and
		// increases by 7 percent every year.
		// In how many years will the tuition be doubled?

		
//
		//A While Loop
		double tuition = 10000;
		int totalYears = 0;
		
		while(tuition < 20000) {
			tuition *= 1.07;
			totalYears++;
		}
		System.out.println(totalYears);
		
	}
}
