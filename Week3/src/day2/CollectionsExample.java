package day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;

public class CollectionsExample {

	public static void main(String[] args) {

		// a set is a n unordered data structure that can only contain unique elements
		// adding an item to a set that is already there will overwrite the existing
		// elements in the set
		Set<String> set = new HashSet<String>();

		set.add("element1");
		set.add("element2");
		set.add("element3");
		set.add("element1"); // this item overwrites the first time we added the string element1

		for (String e : set) {
			System.out.println(e);
		}

		if (set.isEmpty()) {
			// the set has no elements
		}

		if (set.size() == 0) {
			// same as is empty
		}

		System.out.println("===========================\n");

		List<String> list = new ArrayList<>();

		// the list is an ordered data structure that can contain duplicate elements
		list.add("element1");
		list.add("element2");
		list.add("element3");
		list.add("element1");

		for (String element1 : list) {
			System.out.println(1);
		}

		if (list.contains("element1")) {
			System.out.println("The list contains element1\n");
		}

		if (list.isEmpty()) {
			// generally if a list is empty it means there was no results
		}

		if (list.size() == 0) {
			// this is the same as isEmpty
		}

		// this will get the first element of the list
		// however this should be checked to make sure it's empty or you'll get an index
		// out of bounds error

		System.out.println("===================iterators====================\n");

		// this will remove the first element from the list
		// if you are doing a for loop over the list you can not use remove as it
		// modifies the underlying data structure
		// which in turn causes problems with the for loop itself
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("element2")) {
				list.remove(i);
			}
		}

		// an iterator is another way of looping over a list
		// this is not used very often and its primary use is if you want to delete an
		// element from a list
		// this is the safe way of doing a delete
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next(); // this has 2 effects, first is getting the element and then advancing the
												// iterator by 1
			if (element.equals("element2")) {
				iterator.remove();
			}
		}

		// the primary use of a string joiner is to create a CSV file
		// a CSV file in which the data is separated by , or some other delimiter
		// 1st arg is delimiter which will go between each element and separates each
		// element
		// 2nd arg is the start character
		// 3rd arg is the end character

		StringJoiner sj1 = new StringJoiner(":", "{", ")");

		sj1.add("element1");
		sj1.add("element2");
		sj1.add("element3");
		sj1.add("element4");

		System.out.println(sj1.toString());

		StringJoiner sj2 = new StringJoiner(",", "[", "]");

		sj2.add("list1");
		sj2.add("list2");
		sj2.add("list3");
		sj2.add("list4");

		// by using the merge function it used the delimiter from
		// sj1 for the elements from sj1 and the delimiter from si2 on the elements from
		// sj2
		// then used the start and end characters from sj1

		System.out.println(sj1.merge(sj2).toString());
	}

}
