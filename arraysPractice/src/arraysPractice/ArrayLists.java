package arraysPractice;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {

		String[] fishArr = new String[4];
		fishArr[2] = "trout";
		fishArr[0] = "salmon";
		fishArr[1] = "tuna";

		fishArr[1] = "bass"; // this overwrites the element in index 1

		String aFish2 = fishArr[0]; // this retrieves an element from an array and stores it to a variable

		ArrayList<String> fishArrList = new ArrayList<String>();

		// There are two versions of the add() method
		fishArrList.add("salmon"); // this option adds the new element to the end of the array
		fishArrList.add("trout");

		fishArrList.add(1, "tuna"); // this option allows you to specify where you want the new element to go

		fishArrList.set(1, "bass"); // ***.set()*** this is how you overwrite an element in an array list

		fishArrList.remove(1); // ***.remove()*** this removes an element and the remaining elements all slide
								// down to take its place

		String removedFish = fishArrList.remove(1); // setting the removed element to a variable

		String aFish = fishArrList.get(0); // ***.get() method*** "get or "retrieve" an element from the array which you
											// can set to a variable or print out
		
		//A limitation of ArrayLists is that they can only hold objects...so you can't have an ArrayList of int datatype. 
		//To get around this we use the "wrapper class"
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(4); //wraps with autoboxing
		int someOtherNumber = myNumbers.get(0); //unwraps with autoboxing
		
		//An additional feature of ArrayLists is that you can simply print them out to the console
		System.out.println(fishArrList);
		
		//You can't simply print an array...if you do you'll only get gibberish
		System.out.println(fishArr);

		//We can use a for loop to print out the value of an array or an ArrayList
		//Let's start with an array
		
		for(int i = 0; i < fishArr.length; i++) {		//***use .length _ no parentheses_ with an array***
			System.out.println(fishArr[i]);
		}
		
		
		for(int i = 0; i < fishArrList.size(); i++) {			//***use .size() with an arrayList***
			System.out.println("Array list element: " + fishArrList.get(i));
		}
	}
}