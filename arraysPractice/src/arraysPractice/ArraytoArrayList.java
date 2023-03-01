package arraysPractice;

import java.util.ArrayList;

public class ArraytoArrayList {

	public static void main(String[] args) {
		
		int [] anArray = {3, 6, 1, 7, 3, 1};
		
		ArrayList<Integer> anArrayList = new ArrayList<>();
		
		for(int temp : anArray) {
			
			anArrayList.add(temp);
		}
		 System.out.println(anArrayList);
	}
	
}
