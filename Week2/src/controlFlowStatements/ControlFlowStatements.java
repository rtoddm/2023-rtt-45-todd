package controlFlowStatements;

import java.util.Scanner; //Importing the Scanner Class

public class ControlFlowStatements {

	// Question 1
	static int x1 = 7;

	static void ifStatement() {
		if (x1 < 10) {
			System.out.println("Less than 10");
		}
	}

	// Question 2
	static int x2 = 15;

	static void ifElseStatement() {
		if (x2 < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}
	}

	// Question 3
	static int x3 = 50;

	static void ifElseIfStatement() {
		if (x3 < 10) {
			System.out.println("Less than 10");
		} else if (x3 > 10 && x3 < 20) {
			System.out.println("Between 10 and 20");
		} else {
			System.out.println("Greater than or equal to 20");
		}
	}

	// Question 4
	static int x4 = 5;

	static void ifOutOfRange() {
		if (x4 < 10 || x4 > 20) {
			System.out.println("Out of Range");
		} else {
			System.out.println("In Range");
		}
	}

	// Question 5
//	static void grades() {
//
//		Scanner gradeScanner = new Scanner(System.in);
//
//		float grade;
//		System.out.println("Enter your grade: ");
//		grade = gradeScanner.nextFloat();
//
//		if (grade < 0 || grade > 100) {
//			System.out.println("Out of Range");
//		} else if (grade >= 90 && grade <= 100) {
//			System.out.println("You got an A!");
//		} else if (grade >= 80 && grade <= 89) {
//			System.out.println("You got a B!");
//		} else if (grade >= 70 && grade <= 79) {
//			System.out.println("That's still pretty good!");
//		} else if (grade >= 60 && grade <= 69) {
//			System.out.println("Yeahhh...that's not so great");
//		} else {
//			System.out.println("How sad...You failed!");
//		}
//
//		gradeScanner.close();
//
//	}

	// Question 6

	static void dayOfWeek() {
		Scanner scanner = new Scanner(System.in);

		int day;
		System.out.println("Please enter a number: ");
		day = scanner.nextInt();

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Out of Range");
		}
	}

	// Question 7

	public static void main(String[] args) {

		// Question 1 Output
		ifStatement();

		// Question 2 Output
		ifElseStatement();

		// Question 3 Output
		ifElseIfStatement();

		// Question 4 Output
		ifOutOfRange();

		// Question 5 Output
		//grades();
	
		//Question 6 Output
		dayOfWeek();
	}
}
