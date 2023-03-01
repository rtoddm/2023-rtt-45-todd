package day3;

import java.util.Comparator;

public class Comparitor {

	public static void main(String[] args) {
		
		
		
		
		
		
	}
	
	//a comparator is jut an interface that we are implementing
	
	class NumberComparitor<Integer> implements Comparator<Integer>{
		
		//comparator return 3 values
		//if o1 is < o2 then return -1
		//if o1 == o2 then return 0
		//if o1 > o2 then return 1
		
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
	}
}
