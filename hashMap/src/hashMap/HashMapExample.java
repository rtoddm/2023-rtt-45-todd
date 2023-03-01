package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	//List - ArrayList, LinkedList
	//Set - HashSet ...
	//Map - HashMap, TreeMap

	public static void main(String[] args) {
		
		//Map<K,V>
		//this is a map with string as a key and string as a value
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("key", "value");
		dictionary.put("concat", "To add 2 strings together");
		dictionary.put("instantiate", "to create a new object");
		dictionary.put("new", "allocate new memory location");
		
		dictionary.remove("key");
		
		Set<String> keySet = dictionary.keySet();  //this gives us all the keys without the values
		for(String key : dictionary.keySet()) {	//then we are looping over the keys
			//printing the key and the value
			//however we have to fetch the value from the map using the key
			System.out.println(key + "=" + dictionary.get(key));  
			
		}
		
		
		System.out.println("===============================");
		
		
		
		
		
		
	}

}
