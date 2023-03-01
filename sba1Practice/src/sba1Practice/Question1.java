package sba1Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sba1Practice.Question1;

public class Question1 {

	// String x = null; this means that no string object has been created and there
	// is no memory allocated
	// String y = ""; this is an empty string that has been allocated to memory

	// ( x == null ) is true
	// ( x.equals("") ) will throw a NullPointerException
	// ( y.equals("") ) is true
	// ( y == null ) is false

	public static void main(String[] args) {
		// how to transfer an array into an array list
		String[] arr = { "zero", "one", "two", "three", "four", "five" };

		Question1 q1 = new Question1();

		q1.convert(arr);

		q1.replace(2);
		// i have replaced two with the empty string

		q1.replace(4);
		// i have replace four with the empty string

		ArrayList<String> compacted = q1.compact();
		System.out.println(compacted);
		
		//q1.compact();
		
//		 print compacted and should produce
//		 zero, one, three, five

	}

	private ArrayList<String> list;

	public Question1() {
		// in the constructor create a new array list
		this.list = new ArrayList<String>();
		System.out.println("testingConstructor");
	}

//	public Question1(String[] arr) {
//		// TODO Auto-generated constructor stub
//	}

	public void convert(String[] arr) {
		// add the elements in the string array to the ArrayList of strings
		for (String elem : arr) {
			list.add(elem);
		}
	}

	public void replace(int idx) {
		// in an ArrayList write the value at idx to be an empty string
		// print a message saying what the value of the position in the list is and the
		// value you are overwriting it with
		String replaced = list.get(idx);
		list.set(idx, "");
		System.out.println("The value in position " + idx + " was replaced with " + replaced
				+ " and I am overwriting it with " + "\"\"");
	}

	public ArrayList<String> compact() {
		// remove all values in the array list that are empty strings
		// must use .equals and not ==
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("")) {
				list.remove(i);
			}
		}
		return list;
	}
	
	
//	public void compact() {
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).equals("")) {
//				list.remove(i);
//			}
//		}
//		System.out.println(list.toString());
//	}
	}

