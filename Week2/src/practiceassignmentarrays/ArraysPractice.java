package practiceassignmentarrays;

import java.util.Arrays;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Question 1
		//Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.

		//Option 1
		int numArray[];
		numArray = new int[3];
		numArray[0] = 1;
		numArray[1] = 2;
		numArray[2] = 3;
		
		System.out.println(numArray[0]);
		System.out.println(numArray[1]);
		System.out.println(numArray[2]);
		
		//Option 2
		int[] numberArray = {1, 2, 3};
		System.out.println(numberArray[0]);
		System.out.println(numberArray[1]);
		System.out.println(numberArray[2]);
	
		
		
		//Question 2
		
		//Option 1
		int[] moreNumbers = {13, 5, 7, 68, 2};
		System.out.println(moreNumbers[2]);
		
		
		//Option 2
		int[] someMoreNums = new int[5];
		someMoreNums[0] = 13;
		someMoreNums[1] = 5;
		someMoreNums[2] = 7;
		someMoreNums[3] = 68;
		someMoreNums[4] = 2;
		
		System.out.println(someMoreNums[2]);
		
		
		
		//Question 3
		
		String[] colors = {"red", "green", "blue", "yellow"};
		
		int arrayLength = colors.length;
		
		System.out.println("The length of the array is:" + arrayLength); //Length of Array
		System.out.println(colors.length);
		
		String[] myNewArray = colors.clone();				//clone array
		System.out.println(Arrays.toString(myNewArray));	//array to a string
	
										
		
		
		//Question 4
		
		int [] myIntArray = {3, 5, 6, 8, 9};
		System.out.println(myIntArray[myIntArray.length -5]);	
		System.out.println(myIntArray[myIntArray.length -1]);
		
		//System.out.println(myIntArray[myIntArray.length]);  	//Produces Exception
		
		//System.out.println(myIntArray[5] = 11);					//Out of bounds Exception
		
		
		
		//Question 5	
		//Write a program where you create an integer array with a length of 5. 
		//Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
		
		int[] integerArray = new int[5];
		
		for(int i = 0; i < integerArray.length; i++) {
			integerArray[i] = i;
			
		}
		System.out.println(Arrays.toString(integerArray));
	
	
		//Question 6
		//Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of the 
		//loop control variable multiplied by 2 to the corresponding index in the array.
		
		int [] integerArray2 = new int [5];
		
		for(int i = 0; i < integerArray2.length; i++) {
			integerArray2[i] = i * 2;
			
		}
		System.out.println(Arrays.toString(integerArray2));
		
		//Question 7
		//Write a program where you create an array of 5 elements. 
		//Loop through the array and print the value of each element, except for the middle (index 2) element.
		int[] fiveElements = {1, 3, 5, 7, 9};
		for(int i = 0; i < fiveElements.length; i++) {
			if(i == fiveElements[0]) {
				System.out.println(fiveElements[0]);
			}else if(i == fiveElements[1]) {
				System.out.println(fiveElements[1]);
			}else if(i == fiveElements[3]) {
				System.out.println(fiveElements[3]);
			}else if(i == fiveElements[4]) {
				System.out.println(fiveElements[4]);
			}
		}
		
		//Question 8
		
		
		
		
		
		
		
	}

}
