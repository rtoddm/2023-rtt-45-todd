package stringMethods;

import java.util.Arrays;

public class BuiltInMethods {

	public static void main(String[] args) {

		// 1. length() method

		// The length() method return the length of the string or it
		// returns the count of the total number of characters present
		// in the string

		String str1 = "Java";
		String str2 = "";

		System.out.println(str1.length()); // 4
		System.out.println(str2.length()); // 0
		System.out.println("Java".length()); // 4
		System.out.println("Java\n".length()); // 5
		System.out.println("Learn Java".length()); // 10

		// 2. IsEmpty() method

		// This method checks whether the String contains anything
		// or not. If the Java string is empty, it returns true
		// or false.

		String s1 = "";
		String s2 = "hello";
		System.out.println(s1.isEmpty()); // returns true
		System.out.println(s2.isEmpty()); // return false

		// 3. Trim() method

		// The Java string trim() method removes the leading and
		// trailing spaces. It checks the Unicode value of the space
		// character ('/u0020') before and after the string. If it
		// exists, then remove the spaces and return the omitted
		// string.

		String s3 = "  hello   ";
		System.out.println(s3 + "how are you"); // without trim()
		System.out.println(s3.trim() + "how are you"); // with trim()

		// 4. toLowerCase() method

		// The toLowerCase() method converts all the characters of the
		// String to lower case.

		String s4 = "HELLO HOW Are You?";
		String s4lower = s4.toLowerCase();
		System.out.println(s4lower);

		// 5. toUpperCase() method

		// The toUpperCase() method converts all the String characters
		// upper case

		String s5 = "hello how are you";
		String s5upper = s5.toUpperCase();
		System.out.println(s5upper);

		// 6. concat() method

		// You can also use the + operator to concatenate two or more
		// strings. But the Java String class provides the concat()
		// method. This method combines a specific string at the end
		// of another string, and ultimately returns a combined string.

		String str11 = "Learn ";
		String str21 = "Java";

		System.out.println(str11.concat(str21)); // "Learn Java"

		System.out.println(str21.concat(str11)); // "JavaLearn "
		// --- By using + operator---
		String s31 = "hello";
		String s41 = "Learners";
		// String s5 = s3.concat(s4); or
		String s51 = s31 + s41;
		// both of the above statement will give you the same result

		// Three strings are concatenated
		String message = "Welcome " + "to " + "Java";

		// String Chapter is concatenated with number 2
		String s = "Chapter" + 2; // s becomes Chapter2

		// String Supplement is concatenated with character B
		String s11 = "Supplement" + 'B'; // s1 becomes SupplementB

		// 7. split() method

		// The split() method divides the string at the specified
		// regex and returns an array of substrings. Syntax of the
		// split() method is:
		// string.split(String regex, int limit)
		// regex - the string is divided at this regex (can be strings)
		// limit (optional) - controls the number of resulting substrings

		String vowels = "a::b::c::d:e";

		// splitting the string at "::"
		// storing the result in an array of strings
		String[] result = vowels.split("::");

		// converting array to string and printing it
		System.out.println("result = " + Arrays.toString(result));

		// 8. charAt() method: Getting Characters From a String

		// Strings are zero indexed

		String message8 = "Welcome to Java";
		System.out.println("The first character in the message is " + message.charAt(0));

		// 9. compareTo() method

		// The Java String compareTo() method compares the given string
		// with the current string. It is a method of ‘Comparable’
		// interface that is implemented by the String class.
		// It either returns a positive number, negative number or 0.

		String s111 = "hello";
		String s21 = "hello";
		String s311 = "hemlo";
		String s411 = "flag";
		System.out.println(s111.compareTo(s21)); // 0 because both are equal
		System.out.println(s111.compareTo(s311)); // -1 because "l" is only one time lower than "m"
		System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"

		// 10. Substrings() method

		// The substring() method extracts a substring from the
		// string and returns it. The syntax of the substring()
		// method is:
		// stringObj.substring(int startIndex, int endIndex)

		String str111 = "java is fun";

		// extract substring from index 0 to 3
		System.out.println(str111.substring(0, 4));

		// 11. indexOf() method

		// The indexOf() method returns the index of the first
		// occurrence of the specified character/substring within
		// the string.

		String str1111 = "Java is fun";
		int result1;

		// getting index of character 's'
		result1 = str1111.indexOf('s');

		System.out.println(result1); // 6

		// getting index of character 'J'
		result1 = str1111.lastIndexOf('J');
		System.out.println(result1); // 0

		// the last occurrence of 'a' is returned

		result1 = str1111.lastIndexOf('a');
		System.out.println(result1); // 3

		// character not in the string
		result1 = str1111.lastIndexOf('j');
		System.out.println(result1); // -1

		// getting the last occurrence of "ava"
		result1 = str1111.lastIndexOf("ava");
		System.out.println(result1); // 1

		// substring not in the string
		result1 = str1111.lastIndexOf("java");
		System.out.println(result1); // -1

		// 12. contains() method

		// The contains() method checks the specified string
		// (sequence of characters) is present in the string or not

		String str11111 = "Learn Java";
		Boolean result11;

		// check if str1 contains "Java"

		boolean result111 = str1.contains("Java");
		System.out.println(result111); // true

		// check if str1 contains "Python"
		result111 = str1.contains("Python");
		System.out.println(result111); // false

		// check if str1 contains ""
		result111 = str1.contains("");

		System.out.println(result111); // true

		// 13. replace() method

		// The replace() method replaces each matching occurrence of
		// the old character/text in the string wiht the new character/text.
		// The syntax of the replace() method is either:
		// stringobj.replace(char oldChar, char newChar)
		// or
		// stringobj.replace(CharSequence oldText, CharSequence newText)
		// Here, stringobj is an object of the String class.

		String str111111 = "abc cba";
		// all occurrences of 'a' is replaced with 'z'
		System.out.println(str111111.replace('a', 'z'));

		// all occurrences of 'L' is replaced with 'J'
		System.out.println("Lava".replace('L', 'J'));
		// character not in the string
		System.out.println("Hello".replace('4', 'J'));
		// all occurrences of "C++" is replaced with "Java"
		System.out.println(str111111.replace("C++", "Java"));

		// all occurrences of "aa" is replaced with "zz"
		System.out.println("aa bb aa zz".replace("aa", "zz"));

		// substring not in the string
		System.out.println("Java".replace("C++", "C"));

		// 14. Java String compares

		// We can compare String in Java based on content and reference.
		// It is used in authentication (by equals() method), sorting (by compareTo()
		// method), and reference matching (by == operator) etc.
		// There are three ways to compare String in Java:
		// By Using equals() Method
		// By Using == Operator
		// By compareTo() Method

		// 1. By Using the equals() method

		// The String class equals() method compares the original content of the string.
		// It compares values of string for equality.
		// Create a class named Teststringcomparison and write the code below to it.

		String s1111 = "PerScholas";
		String s211 = "PerScholas";
		String s3111 = new String("PerScholas");
		String s4111 = "Teksystem";
		System.out.println(s1111.equals(s211));// true
		System.out.println(s1111.equals(s3111));// true
		System.out.println(s1111.equals(s4111));// false

		// 2.By Using == operator:
		// The == operator compares references, not values.

		String s11111 = "Perscholas";
		String s2111 = "Perscholas";
		String s31111 = new String("Perscholas");
		System.out.println(s11111 == s2111);// true (because both refer to same instance)
		System.out.println(s11111 == s31111);// false(because s3 refers to instance created in nonpool)

		// 3. By Using compareTo() method
		
		//The String class compareTo() method compares values 
		//lexicographically. It returns an integer value that 
		//describes if the first string is less than, equal to, 
		//or greater than the second string.
		
		// return 0 if this string is the same as another;
		// <0 if lexicographically less than another; or >0


		//Suppose s1 and s2 are two String objects. If:
		//s1 == s2 : The method returns 0.
		//s1 > s2 : The method returns a positive value.
		//s1 < s2 : The method returns a negative value.
		
		String s111111="Perscholas";
	       String s21111="Perscholas";
	       String s311111="Perscholas";
	       System.out.println(s111111.compareTo(s21111));//0
	       System.out.println(s111111.compareTo(s311111));//1(because s1>s3)
	       System.out.println(s311111.compareTo(s111111));//-1(because s3 < s1 )


		
		
		
	}

}
