package com.persholas.java_basics;

public class javabasicsclass {

	public static void main(String[] args) {
		
		//Write a program that declares 2 integer variables, assigns an integer to each, and adds them together. 
		//Assign the sum to a variable. Print out the result.
		
		int num1 = 5;
		int num2 = 10;
		
		int sum = num1 + num2;
		System.out.println(sum);
		
		/*
		 * Write a program that declares 2 double variables, assigns a number to each, and adds them together. 
		 * Assign the sum to a variable. Print out the result.
		 */
		
		double decimal1 = 10.5;
		double decimal2 = 10.5;
		
		double decimalSum = decimal1 + decimal2;
		System.out.println(decimalSum);
		
		/*
		 * Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. 
		 * Assign the sum to a variable. Print out the result. What variable type must the sum be?
		 */
		
		int num3 = 6;
		double num4 = 6.2;
		
		double answer = num3 + num4;
		
		System.out.println(answer);
		
		/*
		 * Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the 
		 * smaller number. 
		 * Assign the result to a variable. Print out the result. 
		 * Now change the larger number to a decimal. What happens? What corrections are needed?
		 */
		
		//First Step
		int numAgain = 2;
		int numSomeMore = 4;
		int divided = numSomeMore/numAgain;
		
		System.out.println("First Time: " + divided);
		
		//Second Step
		double numSomeMore2 = 4.5;
		double dividedANew = numSomeMore/numAgain;
		
		System.out.println("Second Time: " + dividedANew);
		
		/*
		 * Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller. 
		 * Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
		 */
		
		//First Step
		double firstOne = 5;
		double secondOne = 10;
		double divided2 = secondOne/firstOne;
		
		System.out.println(divided2);
		
		//Second Step
		int x1;
		x1 = (int)divided2;
		
		System.out.println(x1);
		
		/*
		 * Write a program that declares two integer variables, x, and y, and assigns 5 to x and 6 to y. 
		 * Declare a variable q and assign y/x to it and print q. 
		 * Now, cast y to a double and assign it to q. Print q again.
		 */
		
		//First Step
//		int x = 5;
//		int y = 6;
//		int q = y/x;
		
//		System.out.println(q);
		
		//Second Step
		int x = 5;
		double y = 6;
		double q = (double)y/x;
		
		System.out.println(q);
		
		/*
		 * Write a program that declares a named constant and uses it in a calculation. Print the result.
		 */
		
		final int number = 2;
		int summation = number + 3;
		
		System.out.println(summation);
		
		/*
		 * Write a program where you create 3 variables that represent products at a cafe. 
		 * The products could be beverages like coffee, cappuccino, espresso, green tea, etc. 
		 * Assign prices to each product. 
		 * Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product, 
		 * 4 items of the second product, and 2 items of the third product. 
		 * Add them all together to calculate the subtotal. 
		 * Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. 
		 * Be sure to format the results to 2 decimal places.
		 */
		
		double greenTea = 4.00;
		double blackCoffee = 1.50;
		double espresso = 2.50;
		double subTotal = (greenTea * 3) + (blackCoffee * 4) + (espresso * 3);
		double SALES_TAX = .13;
		double totalSale = subTotal + SALES_TAX;
		
		System.out.println(totalSale);
		
	}
}
