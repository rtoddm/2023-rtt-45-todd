package sba1Practice;

import java.util.ArrayList;

public class Methods {
	
	static ArrayList<String> list = new ArrayList<>();
	static String[] arr = { "zero", "one", "two", "three", "four", "five" };
	
	
	public static void convert(String[] arr) {
		// add the elements in the string array to the ArrayList of strings
		for (String temp : arr) {
			list.add(temp);
		}
		System.out.println(list);
	}
	
	public static void replace(int idx) {
		// in an ArrayList write the value at idx to be an empty string
		// print a message saying what the value of the position in the list is and the
		// value you are overwriting it with
		
		String replaced = list.get(idx);
		System.out.println("I have replaced: " + replaced + " with an empty string");
		System.out.println("Replace method: " + list);
	}
	
	
	public static ArrayList<String> compact() {
		// remove all values in the array list that are empty strings
		// must use .equals and not ==
		for(String temp : list) {
			if(temp.equals("")) {
				list.remove(temp);
			}
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		
		
		convert(arr);
		replace(2);
		compact();
		
	}
	
	
}
