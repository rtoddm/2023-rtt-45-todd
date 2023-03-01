package loopLab;

import java.util.ArrayList;
import java.util.List;

public class LoopIterations {

	public static void main(System[] args) {

		LoopIterations li = new LoopIterations();
		// li.forLoop();
		li.forLoopList();
		//li.forListExercise();
		//liwhileloop();
	}
	
	
	
	public void maxRandomValue() {
		int max = 100;
		int min = 1;
		
		List<Integer> list = new ArrayList<>();
		
		//this code adds 10 random numbers to the list
		for (int i = 1; i <= 10; i++) {
			
		}
	}
	
	
	
	// ToDo...create a List of Integers and use a loop to add the numbers 1 to 10 to
	// the list.
	// Then use the new style for loop to print the elements in the list.
	
	public void forListExercise(int start, int end) {
		List<Integer> list = new ArrayList<>();
		
	
		for(int i = 1; i <=10; i++) {
			list.add(i);	
		}
		
		for(Integer e : list) {
			System.out.println(e);
		}
		
	}

	// Ctrl - shift - O to import classes List and ArrayList
	public void forLoopList() {
		List<String> list = new ArrayList<>();
		list.add("String 1");
		list.add("String 2");
		list.add("String 3");

		// loop over the list and print elements
		// this loop is only used when you need to have a specific requirement to know
		// the
		// position of each element
		// for some sort of business logic...this does happen from time to time
		for (int position = 0; position < list.size(); position++) {
			System.out.println(list.get(position));
		}

		System.out.println("============================");

		// new style for loop that is easier to read and used more commonly
		// read as...for each element in the list...do something
		for (String element : list) {
			System.out.println(element);
		}
	}
}
