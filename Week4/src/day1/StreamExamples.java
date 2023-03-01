package day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Larry");
		names.add("Steven");
		names.add("Eric");
		names.add("Jessica");
		names.add("Ellen");
		
		//1. Sort the original names by length of name using a stream
//		Comparator<String> compByLength = (aName, bName) -> aName.length() - bName.length();
//		names.stream().sorted(compByLength).forEach(System.out::println);		
		
		
		//2. When the length is the same then sort secondary alphabetically
		names.sort(Comparator.comparingInt(String::length).thenComparing(x -> x.toLowerCase()));
		System.out.print(String.join("\n", names) + "\n");
		
		System.out.println("=================================================");
		
//		List<String> sortedList = names.stream()
//			.sorted(Comparator.reverseOrder())
//			.collect(Collectors.toList());
//		System.out.println(String.join("\n", sortedList) + "\n");
//				
//				
//				System.out.println("=====================================");
//		
//		//remove all names form the list that contain an "n"
//		sortedList.removeIf(name -> name.contains("n"));
//		System.out.println("");
		
		
		
		
		
		
	}
}
